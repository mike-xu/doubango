/****************************************************************************
			 _             _                             
			| |           | |                            
		  _ | | ___  _   _| | _   ____ ____   ____  ___  
		 / || |/ _ \| | | | || \ / _  |  _ \ / _  |/ _ \ 
		( (_| | |_| | |_| | |_) | ( | | | | ( ( | | |_| |
		 \____|\___/ \____|____/ \_||_|_| |_|\_|| |\___/ 
											(_____|   
	
	Copyright (C) 2009 xxxyyyzzz <imsframework(at)gmail.com>

	This file is part of Open Source Doubango IMS Client Framework project.

    DOUBANGO is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.
	
    DOUBANGO is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Lesser General Public License for more details.
	
    You should have received a copy of the GNU General Public License
    along with DOUBANGO.
****************************************************************************/

#ifndef _TINYXCAP_XDM_XCAP_CAPS_H_
#define _TINYXCAP_XDM_XCAP_CAPS_H_

#include "tinyxcap_config.h"
#include "xdm_xml.h"

/* urn:ietf:params:xml:ns:xcap-caps */

/* xcap-caps document */
typedef struct xcap_caps_s
{
	xdm_list_t* auids;
	xdm_list_t*	extensions;
	xdm_list_t* namespaces;
}
xcap_caps_t;

TINYXCAP_API xcap_caps_t* xdm_xcap_caps_create(const char* buffer, size_t size);
TINYXCAP_API void xdm_xcap_caps_free(xcap_caps_t** caps);

#endif /* _TINYXCAP_XDM_XCAP_CAPS_H_ */