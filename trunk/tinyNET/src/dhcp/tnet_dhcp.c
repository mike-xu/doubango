/*
* Copyright (C) 2009 Mamadou Diop.
*
* Contact: Mamadou Diop <diopmamadou@yahoo.fr>
*	
* This file is part of Open Source Doubango Framework.
*
* DOUBANGO is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*	
* DOUBANGO is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU Lesser General Public License for more details.
*	
* You should have received a copy of the GNU General Public License
* along with DOUBANGO.
*
*/
/**@file tnet_dhcp.c
 * @brief DHCP/BOOTP (RFC 2131 - Dynamic Host Configuration Protocol) utilities function for P-CSCF discovery(RFC 3319 and 3361).
 *		  Also implement: RFC 3315, 3319, ...
 *
 * @author Mamadou Diop <diopmamadou(at)yahoo.fr>
 *
 * @date Created: Sat Nov 8 16:54:58 2009 mdiop
 */
#include "tnet_dhcp.h"

#include "tsk_thread.h"
#include "tsk_memory.h"
#include "tsk_time.h"
#include "tsk_debug.h"

// Useful link: http://support.microsoft.com/?scid=kb%3Ben-us%3B169289&x=21&y=14
// Another one: http://www.iana.org/assignments/bootp-dhcp-parameters/

/* FIXME: USE retransmission mech (*2*2...)
*/
tnet_dhcp_reply_t* tnet_dhcp_send_request(tnet_dhcp_ctx_t* ctx, tnet_dhcp_request_t* request)
{
	tsk_buffer_t *output;
	tnet_dhcp_reply_t* reply = 0;
	int ret;
	struct timeval tv;
	fd_set set;
	tnet_fd_t clientFD = TNET_INVALID_FD;
	uint64_t timeout = 0;
	tsk_list_item_t *item;
	const tnet_interface_t *iface;
	
	tnet_socket_t *localsocket4 = 0;
	tnet_socket_t *localsocket6 = 0;
	struct sockaddr_storage server;
	
	if(!ctx || !request)
	{
		goto bail;
	}

	if(ctx->use_ipv6)
	{
		localsocket6 = TNET_SOCKET_CREATE(TNET_SOCKET_HOST_ANY, ctx->port_client, tnet_socket_type_udp_ipv6);
		if(TNET_SOCKET_IS_VALID(localsocket6))
		{
			clientFD = localsocket6->fd;
		}
		else goto bail;
	}
	else
	{
		localsocket4 = TNET_SOCKET_CREATE(TNET_SOCKET_HOST_ANY, ctx->port_client, tnet_socket_type_udp_ipv4);
		if(TNET_SOCKET_IS_VALID(localsocket4))
		{
			clientFD = localsocket4->fd;
		}
		else goto bail;
	}

	/* Always wait for 500ms before retransmission */
	tv.tv_sec = 0;
	tv.tv_usec = (500 * 1000);

	if(tnet_sockaddr_init("255.255.255.255"/* FIXME: IPv6 */, ctx->server_port, (ctx->use_ipv6 ? tnet_socket_type_udp_ipv6 : tnet_socket_type_udp_ipv4), &server))
	{
		TNET_PRINT_LAST_ERROR("Failed to initialize the DHCP server address.");
		goto bail;
	}

	/* ENABLE BROADCASTING */
	{
#if defined(SOLARIS)
		char yes = '1';
#else
		int yes = 1;
#endif
		if(setsockopt(clientFD, SOL_SOCKET, SO_BROADCAST, (char*)&yes, sizeof(int)))
		{
			TSK_DEBUG_ERROR("Failed to enable broadcast option [errno=%d].", tnet_geterrno());
			goto bail;
		}
	}

	/* Set timeout */
	timeout = tsk_time_epoch() + ctx->timeout;

	do
	{
		tsk_list_foreach(item, ctx->interfaces)
		{
			iface = item->data;

			/* Set FD */
			FD_ZERO(&set);
			FD_SET(clientFD, &set);
		
			/* chaddr */
			memset(request->chaddr, 0, sizeof(request->chaddr));
			request->hlen = iface->mac_address_length > sizeof(request->chaddr) ? sizeof(request->chaddr) : iface->mac_address_length;
			memcpy(request->chaddr, iface->mac_address, request->hlen);

			/* Serialize and send to the server. */
			if(!(output = tnet_dhcp_message_serialize(request)))
			{
				TSK_DEBUG_ERROR("Failed to serialize the DHCP message.");
				goto next_iface;
			}
			/* Send the request to the DHCP server */
			if((ret =tnet_sockfd_sendto(clientFD, (const struct sockaddr*)&server, output->data, output->size))<0)
			{
				TNET_PRINT_LAST_ERROR("Failed to send DHCP request.");

				tsk_thread_sleep(150); // wait 150ms before trying the next iface.
				goto next_iface;
			}
			/* wait for response */
			if((ret = select(clientFD+1, &set, NULL, NULL, &tv))<0)
			{	/* Error */
				TNET_PRINT_LAST_ERROR("select have failed.");
				tsk_thread_sleep(150); // wait 150ms before trying the next iface.
				goto next_iface;
			}
			else if(ret == 0)
			{	/* timeout ==> do nothing */
			}
			else
			{	/* there is data to read */
				size_t len = 0;
				void* data = 0;

				/* Check how how many bytes are pending */
				if((ret = tnet_ioctlt(clientFD, FIONREAD, &len))<0)
				{
					goto next_iface;
				}
				
				/* Receive pending data */
				data = tsk_calloc(len, sizeof(uint8_t));
				if((ret = tnet_sockfd_recv(clientFD, data, len, 0))<0)
				{
					TSK_FREE(data);
									
					TNET_PRINT_LAST_ERROR("Failed to receive DHCP dgrams.");
					goto next_iface;
				}

				/* Parse the incoming response. */
				reply = tnet_dhcp_message_deserialize(data, len);
				TSK_FREE(data);
				
				if(reply)
				{	/* response successfuly parsed */
					if(request->xid != reply->xid)
					{ /* Not same transaction id ==> continue*/
						TSK_OBJECT_SAFE_FREE(reply);
					}
				}
			}

	next_iface:
			TSK_OBJECT_SAFE_FREE(output);
			if(reply){
				goto bail;
			}
		}
		break;//FIXME
	}
	while(timeout > tsk_time_epoch());

bail:
	TSK_OBJECT_SAFE_FREE(localsocket4);
	TSK_OBJECT_SAFE_FREE(localsocket6);

	return reply;
}

tnet_dhcp_reply_t* tnet_dhcp_query(tnet_dhcp_ctx_t* ctx, tnet_dhcp_params_t* params)
{
	tnet_dhcp_reply_t* reply = 0;
	tnet_dhcp_request_t* request = TNET_DHCP_REQUEST_CREATE();

	if(!ctx || !params || !request)
	{
		goto bail;
	}

	//request->op = params->tag;
	request->type = dhcp_type_discover; // FIXME
	reply = tnet_dhcp_send_request(ctx, request);

bail:
	TSK_OBJECT_SAFE_FREE(request);

	return reply;
}






//========================================================
//	[[DHCP CONTEXT]] object definition
//
static void* tnet_dhcp_ctx_create(void * self, va_list * app)
{
	tnet_dhcp_ctx_t *ctx = self;
	if(ctx)
	{
		ctx->timeout = TNET_DHCP_TIMEOUT_DEFAULT;
		ctx->port_client = TNET_DHCP_CLIENT_PORT;
		ctx->server_port = TNET_DHCP_SERVER_PORT;
		ctx->interfaces = tnet_get_interfaces();
		
		if(!ctx->interfaces || TSK_LIST_IS_EMPTY(ctx->interfaces))
		{
			TSK_DEBUG_ERROR("Failed to retrieve network interfaces.");
		}

		tsk_safeobj_init(ctx);
	}
	return self;
}

static void* tnet_dhcp_ctx_destroy(void * self) 
{ 
	tnet_dhcp_ctx_t *ctx = self;
	if(ctx)
	{
		tsk_safeobj_deinit(ctx);

		TSK_OBJECT_SAFE_FREE(ctx->interfaces);
	}
	return self;
}

static const tsk_object_def_t tnet_dhcp_ctx_def_s =
{
	sizeof(tnet_dhcp_ctx_t),
	tnet_dhcp_ctx_create,
	tnet_dhcp_ctx_destroy,
	0,
};
const void *tnet_dhcp_ctx_def_t = &tnet_dhcp_ctx_def_s;

//========================================================
//	[[DHCP PARAMS]] object definition
//
static void* tnet_dhcp_params_create(void * self, va_list * app)
{
	tnet_dhcp_params_t *params = self;
	if(params)
	{
		params->tag = va_arg(*app, tnet_dhcp_option_tag_t);
	}
	return self;
}

static void* tnet_dhcp_params_destroy(void * self) 
{ 
	tnet_dhcp_params_t *params = self;
	if(params)
	{
	}
	return self;
}

static const tsk_object_def_t tnet_dhcp_params_def_s =
{
	sizeof(tnet_dhcp_params_t),
	tnet_dhcp_params_create,
	tnet_dhcp_params_destroy,
	0,
};
const void *tnet_dhcp_params_def_t = &tnet_dhcp_params_def_s;