/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.39
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.doubango.tinyWRAP;

class tinyWRAPJNI {
  public final static native long new_DDebugCallback();
  public final static native void delete_DDebugCallback(long jarg1);
  public final static native int DDebugCallback_OnDebugInfo(long jarg1, DDebugCallback jarg1_, String jarg2);
  public final static native int DDebugCallback_OnDebugWarn(long jarg1, DDebugCallback jarg1_, String jarg2);
  public final static native int DDebugCallback_OnDebugError(long jarg1, DDebugCallback jarg1_, String jarg2);
  public final static native int DDebugCallback_OnDebugFatal(long jarg1, DDebugCallback jarg1_, String jarg2);
  public final static native long new_SipUri(String jarg1);
  public final static native void delete_SipUri(long jarg1);
  public final static native boolean SipUri_isValid__SWIG_0(String jarg1);
  public final static native boolean SipUri_isValid__SWIG_1(long jarg1, SipUri jarg1_);
  public final static native String SipUri_getScheme(long jarg1, SipUri jarg1_);
  public final static native String SipUri_getHost(long jarg1, SipUri jarg1_);
  public final static native int SipUri_getPort(long jarg1, SipUri jarg1_);
  public final static native String SipUri_getUserName(long jarg1, SipUri jarg1_);
  public final static native String SipUri_getPassword(long jarg1, SipUri jarg1_);
  public final static native String SipUri_getDisplayName(long jarg1, SipUri jarg1_);
  public final static native String SipUri_getParamValue(long jarg1, SipUri jarg1_, String jarg2);
  public final static native long new_SipMessage();
  public final static native void delete_SipMessage(long jarg1);
  public final static native String SipMessage_getSipHeaderValue__SWIG_0(long jarg1, SipMessage jarg1_, String jarg2, long jarg3);
  public final static native String SipMessage_getSipHeaderValue__SWIG_1(long jarg1, SipMessage jarg1_, String jarg2);
  public final static native String SipMessage_getSipHeaderParamValue__SWIG_0(long jarg1, SipMessage jarg1_, String jarg2, String jarg3, long jarg4);
  public final static native String SipMessage_getSipHeaderParamValue__SWIG_1(long jarg1, SipMessage jarg1_, String jarg2, String jarg3);
  public final static native long SipMessage_getSipContentLength(long jarg1, SipMessage jarg1_);
  public final static native long SipMessage_getSipContent(long jarg1, SipMessage jarg1_, java.nio.ByteBuffer jarg2, long jarg3);
  public final static native void delete_SipEvent(long jarg1);
  public final static native short SipEvent_getCode(long jarg1, SipEvent jarg1_);
  public final static native String SipEvent_getPhrase(long jarg1, SipEvent jarg1_);
  public final static native long SipEvent_getBaseSession(long jarg1, SipEvent jarg1_);
  public final static native long SipEvent_getSipMessage(long jarg1, SipEvent jarg1_);
  public final static native void delete_DialogEvent(long jarg1);
  public final static native void delete_StackEvent(long jarg1);
  public final static native void delete_CallEvent(long jarg1);
  public final static native int CallEvent_getType(long jarg1, CallEvent jarg1_);
  public final static native long CallEvent_getSession(long jarg1, CallEvent jarg1_);
  public final static native long CallEvent_takeSessionOwnership(long jarg1, CallEvent jarg1_);
  public final static native void delete_MessagingEvent(long jarg1);
  public final static native int MessagingEvent_getType(long jarg1, MessagingEvent jarg1_);
  public final static native long MessagingEvent_getSession(long jarg1, MessagingEvent jarg1_);
  public final static native long MessagingEvent_takeSessionOwnership(long jarg1, MessagingEvent jarg1_);
  public final static native void delete_OptionsEvent(long jarg1);
  public final static native int OptionsEvent_getType(long jarg1, OptionsEvent jarg1_);
  public final static native long OptionsEvent_getSession(long jarg1, OptionsEvent jarg1_);
  public final static native void delete_PublicationEvent(long jarg1);
  public final static native int PublicationEvent_getType(long jarg1, PublicationEvent jarg1_);
  public final static native long PublicationEvent_getSession(long jarg1, PublicationEvent jarg1_);
  public final static native void delete_RegistrationEvent(long jarg1);
  public final static native int RegistrationEvent_getType(long jarg1, RegistrationEvent jarg1_);
  public final static native long RegistrationEvent_getSession(long jarg1, RegistrationEvent jarg1_);
  public final static native void delete_SubscriptionEvent(long jarg1);
  public final static native int SubscriptionEvent_getType(long jarg1, SubscriptionEvent jarg1_);
  public final static native long SubscriptionEvent_getSession(long jarg1, SubscriptionEvent jarg1_);
  public final static native long new_SipSession(long jarg1, SipStack jarg1_);
  public final static native void delete_SipSession(long jarg1);
  public final static native boolean SipSession_haveOwnership(long jarg1, SipSession jarg1_);
  public final static native boolean SipSession_addHeader(long jarg1, SipSession jarg1_, String jarg2, String jarg3);
  public final static native boolean SipSession_removeHeader(long jarg1, SipSession jarg1_, String jarg2);
  public final static native boolean SipSession_addCaps__SWIG_0(long jarg1, SipSession jarg1_, String jarg2, String jarg3);
  public final static native boolean SipSession_addCaps__SWIG_1(long jarg1, SipSession jarg1_, String jarg2);
  public final static native boolean SipSession_removeCaps(long jarg1, SipSession jarg1_, String jarg2);
  public final static native boolean SipSession_setExpires(long jarg1, SipSession jarg1_, long jarg2);
  public final static native boolean SipSession_setFromUri(long jarg1, SipSession jarg1_, String jarg2);
  public final static native boolean SipSession_setToUri(long jarg1, SipSession jarg1_, String jarg2);
  public final static native boolean SipSession_setSilentHangup(long jarg1, SipSession jarg1_, boolean jarg2);
  public final static native boolean SipSession_addSigCompCompartment(long jarg1, SipSession jarg1_, String jarg2);
  public final static native boolean SipSession_removeSigCompCompartment(long jarg1, SipSession jarg1_);
  public final static native long SipSession_getId(long jarg1, SipSession jarg1_);
  public final static native long new_CallSession(long jarg1, SipStack jarg1_);
  public final static native void delete_CallSession(long jarg1);
  public final static native boolean CallSession_callAudio(long jarg1, CallSession jarg1_, String jarg2);
  public final static native boolean CallSession_callAudioVideo(long jarg1, CallSession jarg1_, String jarg2);
  public final static native boolean CallSession_callVideo(long jarg1, CallSession jarg1_, String jarg2);
  public final static native boolean CallSession_setSessionTimer(long jarg1, CallSession jarg1_, long jarg2, String jarg3);
  public final static native boolean CallSession_set100rel(long jarg1, CallSession jarg1_, boolean jarg2);
  public final static native boolean CallSession_setQoS(long jarg1, CallSession jarg1_, int jarg2, int jarg3);
  public final static native boolean CallSession_accept(long jarg1, CallSession jarg1_);
  public final static native boolean CallSession_hold(long jarg1, CallSession jarg1_);
  public final static native boolean CallSession_resume(long jarg1, CallSession jarg1_);
  public final static native boolean CallSession_sendDTMF(long jarg1, CallSession jarg1_, int jarg2);
  public final static native boolean CallSession_hangup(long jarg1, CallSession jarg1_);
  public final static native long new_MessagingSession(long jarg1, SipStack jarg1_);
  public final static native void delete_MessagingSession(long jarg1);
  public final static native boolean MessagingSession_send(long jarg1, MessagingSession jarg1_, java.nio.ByteBuffer jarg2, long jarg3);
  public final static native boolean MessagingSession_accept(long jarg1, MessagingSession jarg1_);
  public final static native boolean MessagingSession_reject(long jarg1, MessagingSession jarg1_);
  public final static native long new_OptionsSession(long jarg1, SipStack jarg1_);
  public final static native void delete_OptionsSession(long jarg1);
  public final static native boolean OptionsSession_send(long jarg1, OptionsSession jarg1_);
  public final static native long new_PublicationSession(long jarg1, SipStack jarg1_);
  public final static native void delete_PublicationSession(long jarg1);
  public final static native boolean PublicationSession_publish(long jarg1, PublicationSession jarg1_, java.nio.ByteBuffer jarg2, long jarg3);
  public final static native boolean PublicationSession_unPublish(long jarg1, PublicationSession jarg1_);
  public final static native long new_RegistrationSession(long jarg1, SipStack jarg1_);
  public final static native void delete_RegistrationSession(long jarg1);
  public final static native boolean RegistrationSession_register_(long jarg1, RegistrationSession jarg1_);
  public final static native boolean RegistrationSession_unRegister(long jarg1, RegistrationSession jarg1_);
  public final static native long new_SubscriptionSession(long jarg1, SipStack jarg1_);
  public final static native void delete_SubscriptionSession(long jarg1);
  public final static native boolean SubscriptionSession_subscribe(long jarg1, SubscriptionSession jarg1_);
  public final static native boolean SubscriptionSession_unSubscribe(long jarg1, SubscriptionSession jarg1_);
  public final static native long new_ProxyAudioConsumer();
  public final static native void delete_ProxyAudioConsumer(long jarg1);
  public final static native int ProxyAudioConsumer_prepare(long jarg1, ProxyAudioConsumer jarg1_, int jarg2, int jarg3, int jarg4);
  public final static native int ProxyAudioConsumer_prepareSwigExplicitProxyAudioConsumer(long jarg1, ProxyAudioConsumer jarg1_, int jarg2, int jarg3, int jarg4);
  public final static native int ProxyAudioConsumer_start(long jarg1, ProxyAudioConsumer jarg1_);
  public final static native int ProxyAudioConsumer_startSwigExplicitProxyAudioConsumer(long jarg1, ProxyAudioConsumer jarg1_);
  public final static native int ProxyAudioConsumer_pause(long jarg1, ProxyAudioConsumer jarg1_);
  public final static native int ProxyAudioConsumer_pauseSwigExplicitProxyAudioConsumer(long jarg1, ProxyAudioConsumer jarg1_);
  public final static native int ProxyAudioConsumer_stop(long jarg1, ProxyAudioConsumer jarg1_);
  public final static native int ProxyAudioConsumer_stopSwigExplicitProxyAudioConsumer(long jarg1, ProxyAudioConsumer jarg1_);
  public final static native void ProxyAudioConsumer_setActivate(long jarg1, ProxyAudioConsumer jarg1_, boolean jarg2);
  public final static native long ProxyAudioConsumer_pull(long jarg1, ProxyAudioConsumer jarg1_, java.nio.ByteBuffer jarg2, long jarg3);
  public final static native boolean ProxyAudioConsumer_registerPlugin();
  public final static native void ProxyAudioConsumer_director_connect(ProxyAudioConsumer obj, long cptr, boolean mem_own, boolean weak_global);
  public final static native void ProxyAudioConsumer_change_ownership(ProxyAudioConsumer obj, long cptr, boolean take_or_release);
  public final static native long new_ProxyVideoConsumer(int jarg1);
  public final static native void delete_ProxyVideoConsumer(long jarg1);
  public final static native int ProxyVideoConsumer_prepare(long jarg1, ProxyVideoConsumer jarg1_, int jarg2, int jarg3, int jarg4);
  public final static native int ProxyVideoConsumer_prepareSwigExplicitProxyVideoConsumer(long jarg1, ProxyVideoConsumer jarg1_, int jarg2, int jarg3, int jarg4);
  public final static native int ProxyVideoConsumer_consume(long jarg1, ProxyVideoConsumer jarg1_, long jarg2, ProxyVideoFrame jarg2_);
  public final static native int ProxyVideoConsumer_consumeSwigExplicitProxyVideoConsumer(long jarg1, ProxyVideoConsumer jarg1_, long jarg2, ProxyVideoFrame jarg2_);
  public final static native int ProxyVideoConsumer_start(long jarg1, ProxyVideoConsumer jarg1_);
  public final static native int ProxyVideoConsumer_startSwigExplicitProxyVideoConsumer(long jarg1, ProxyVideoConsumer jarg1_);
  public final static native int ProxyVideoConsumer_pause(long jarg1, ProxyVideoConsumer jarg1_);
  public final static native int ProxyVideoConsumer_pauseSwigExplicitProxyVideoConsumer(long jarg1, ProxyVideoConsumer jarg1_);
  public final static native int ProxyVideoConsumer_stop(long jarg1, ProxyVideoConsumer jarg1_);
  public final static native int ProxyVideoConsumer_stopSwigExplicitProxyVideoConsumer(long jarg1, ProxyVideoConsumer jarg1_);
  public final static native void ProxyVideoConsumer_setActivate(long jarg1, ProxyVideoConsumer jarg1_, boolean jarg2);
  public final static native boolean ProxyVideoConsumer_setDisplaySize(long jarg1, ProxyVideoConsumer jarg1_, int jarg2, int jarg3);
  public final static native boolean ProxyVideoConsumer_registerPlugin();
  public final static native void ProxyVideoConsumer_director_connect(ProxyVideoConsumer obj, long cptr, boolean mem_own, boolean weak_global);
  public final static native void ProxyVideoConsumer_change_ownership(ProxyVideoConsumer obj, long cptr, boolean take_or_release);
  public final static native void delete_ProxyVideoFrame(long jarg1);
  public final static native long ProxyVideoFrame_getSize(long jarg1, ProxyVideoFrame jarg1_);
  public final static native long ProxyVideoFrame_getContent(long jarg1, ProxyVideoFrame jarg1_, java.nio.ByteBuffer jarg2, long jarg3);
  public final static native long new_ProxyAudioProducer();
  public final static native void delete_ProxyAudioProducer(long jarg1);
  public final static native int ProxyAudioProducer_prepare(long jarg1, ProxyAudioProducer jarg1_, int jarg2, int jarg3, int jarg4);
  public final static native int ProxyAudioProducer_prepareSwigExplicitProxyAudioProducer(long jarg1, ProxyAudioProducer jarg1_, int jarg2, int jarg3, int jarg4);
  public final static native int ProxyAudioProducer_start(long jarg1, ProxyAudioProducer jarg1_);
  public final static native int ProxyAudioProducer_startSwigExplicitProxyAudioProducer(long jarg1, ProxyAudioProducer jarg1_);
  public final static native int ProxyAudioProducer_pause(long jarg1, ProxyAudioProducer jarg1_);
  public final static native int ProxyAudioProducer_pauseSwigExplicitProxyAudioProducer(long jarg1, ProxyAudioProducer jarg1_);
  public final static native int ProxyAudioProducer_stop(long jarg1, ProxyAudioProducer jarg1_);
  public final static native int ProxyAudioProducer_stopSwigExplicitProxyAudioProducer(long jarg1, ProxyAudioProducer jarg1_);
  public final static native void ProxyAudioProducer_setActivate(long jarg1, ProxyAudioProducer jarg1_, boolean jarg2);
  public final static native int ProxyAudioProducer_push(long jarg1, ProxyAudioProducer jarg1_, java.nio.ByteBuffer jarg2, long jarg3);
  public final static native boolean ProxyAudioProducer_registerPlugin();
  public final static native void ProxyAudioProducer_director_connect(ProxyAudioProducer obj, long cptr, boolean mem_own, boolean weak_global);
  public final static native void ProxyAudioProducer_change_ownership(ProxyAudioProducer obj, long cptr, boolean take_or_release);
  public final static native long new_ProxyVideoProducer(int jarg1);
  public final static native void delete_ProxyVideoProducer(long jarg1);
  public final static native int ProxyVideoProducer_prepare(long jarg1, ProxyVideoProducer jarg1_, int jarg2, int jarg3, int jarg4);
  public final static native int ProxyVideoProducer_prepareSwigExplicitProxyVideoProducer(long jarg1, ProxyVideoProducer jarg1_, int jarg2, int jarg3, int jarg4);
  public final static native int ProxyVideoProducer_start(long jarg1, ProxyVideoProducer jarg1_);
  public final static native int ProxyVideoProducer_startSwigExplicitProxyVideoProducer(long jarg1, ProxyVideoProducer jarg1_);
  public final static native int ProxyVideoProducer_pause(long jarg1, ProxyVideoProducer jarg1_);
  public final static native int ProxyVideoProducer_pauseSwigExplicitProxyVideoProducer(long jarg1, ProxyVideoProducer jarg1_);
  public final static native int ProxyVideoProducer_stop(long jarg1, ProxyVideoProducer jarg1_);
  public final static native int ProxyVideoProducer_stopSwigExplicitProxyVideoProducer(long jarg1, ProxyVideoProducer jarg1_);
  public final static native void ProxyVideoProducer_setActivate(long jarg1, ProxyVideoProducer jarg1_, boolean jarg2);
  public final static native int ProxyVideoProducer_push(long jarg1, ProxyVideoProducer jarg1_, java.nio.ByteBuffer jarg2, long jarg3);
  public final static native boolean ProxyVideoProducer_registerPlugin();
  public final static native void ProxyVideoProducer_director_connect(ProxyVideoProducer obj, long cptr, boolean mem_own, boolean weak_global);
  public final static native void ProxyVideoProducer_change_ownership(ProxyVideoProducer obj, long cptr, boolean take_or_release);
  public final static native long new_SipCallback();
  public final static native void delete_SipCallback(long jarg1);
  public final static native int SipCallback_OnDialogEvent(long jarg1, SipCallback jarg1_, long jarg2, DialogEvent jarg2_);
  public final static native int SipCallback_OnDialogEventSwigExplicitSipCallback(long jarg1, SipCallback jarg1_, long jarg2, DialogEvent jarg2_);
  public final static native int SipCallback_OnStackEvent(long jarg1, SipCallback jarg1_, long jarg2, StackEvent jarg2_);
  public final static native int SipCallback_OnStackEventSwigExplicitSipCallback(long jarg1, SipCallback jarg1_, long jarg2, StackEvent jarg2_);
  public final static native int SipCallback_OnCallEvent(long jarg1, SipCallback jarg1_, long jarg2, CallEvent jarg2_);
  public final static native int SipCallback_OnCallEventSwigExplicitSipCallback(long jarg1, SipCallback jarg1_, long jarg2, CallEvent jarg2_);
  public final static native int SipCallback_OnMessagingEvent(long jarg1, SipCallback jarg1_, long jarg2, MessagingEvent jarg2_);
  public final static native int SipCallback_OnMessagingEventSwigExplicitSipCallback(long jarg1, SipCallback jarg1_, long jarg2, MessagingEvent jarg2_);
  public final static native int SipCallback_OnOptionsEvent(long jarg1, SipCallback jarg1_, long jarg2, OptionsEvent jarg2_);
  public final static native int SipCallback_OnOptionsEventSwigExplicitSipCallback(long jarg1, SipCallback jarg1_, long jarg2, OptionsEvent jarg2_);
  public final static native int SipCallback_OnPublicationEvent(long jarg1, SipCallback jarg1_, long jarg2, PublicationEvent jarg2_);
  public final static native int SipCallback_OnPublicationEventSwigExplicitSipCallback(long jarg1, SipCallback jarg1_, long jarg2, PublicationEvent jarg2_);
  public final static native int SipCallback_OnRegistrationEvent(long jarg1, SipCallback jarg1_, long jarg2, RegistrationEvent jarg2_);
  public final static native int SipCallback_OnRegistrationEventSwigExplicitSipCallback(long jarg1, SipCallback jarg1_, long jarg2, RegistrationEvent jarg2_);
  public final static native int SipCallback_OnSubscriptionEvent(long jarg1, SipCallback jarg1_, long jarg2, SubscriptionEvent jarg2_);
  public final static native int SipCallback_OnSubscriptionEventSwigExplicitSipCallback(long jarg1, SipCallback jarg1_, long jarg2, SubscriptionEvent jarg2_);
  public final static native void SipCallback_director_connect(SipCallback obj, long cptr, boolean mem_own, boolean weak_global);
  public final static native void SipCallback_change_ownership(SipCallback obj, long cptr, boolean take_or_release);
  public final static native long new_SafeObject();
  public final static native void delete_SafeObject(long jarg1);
  public final static native int SafeObject_Lock(long jarg1, SafeObject jarg1_);
  public final static native int SafeObject_UnLock(long jarg1, SafeObject jarg1_);
  public final static native long new_SipStack(long jarg1, SipCallback jarg1_, String jarg2, String jarg3, String jarg4);
  public final static native void delete_SipStack(long jarg1);
  public final static native boolean SipStack_start(long jarg1, SipStack jarg1_);
  public final static native boolean SipStack_setDebugCallback(long jarg1, SipStack jarg1_, long jarg2, DDebugCallback jarg2_);
  public final static native boolean SipStack_setRealm(long jarg1, SipStack jarg1_, String jarg2);
  public final static native boolean SipStack_setIMPI(long jarg1, SipStack jarg1_, String jarg2);
  public final static native boolean SipStack_setIMPU(long jarg1, SipStack jarg1_, String jarg2);
  public final static native boolean SipStack_setPassword(long jarg1, SipStack jarg1_, String jarg2);
  public final static native boolean SipStack_setAMF(long jarg1, SipStack jarg1_, String jarg2);
  public final static native boolean SipStack_setOperatorId(long jarg1, SipStack jarg1_, String jarg2);
  public final static native boolean SipStack_setProxyCSCF(long jarg1, SipStack jarg1_, String jarg2, int jarg3, String jarg4, String jarg5);
  public final static native boolean SipStack_setLocalIP(long jarg1, SipStack jarg1_, String jarg2);
  public final static native boolean SipStack_setLocalPort(long jarg1, SipStack jarg1_, int jarg2);
  public final static native boolean SipStack_setEarlyIMS(long jarg1, SipStack jarg1_, boolean jarg2);
  public final static native boolean SipStack_addHeader(long jarg1, SipStack jarg1_, String jarg2, String jarg3);
  public final static native boolean SipStack_removeHeader(long jarg1, SipStack jarg1_, String jarg2);
  public final static native boolean SipStack_addDnsServer(long jarg1, SipStack jarg1_, String jarg2);
  public final static native boolean SipStack_setDnsDiscovery(long jarg1, SipStack jarg1_, boolean jarg2);
  public final static native boolean SipStack_setAoR(long jarg1, SipStack jarg1_, String jarg2, int jarg3);
  public final static native boolean SipStack_setSigCompParams(long jarg1, SipStack jarg1_, long jarg2, long jarg3, long jarg4, boolean jarg5);
  public final static native boolean SipStack_addSigCompCompartment(long jarg1, SipStack jarg1_, String jarg2);
  public final static native boolean SipStack_removeSigCompCompartment(long jarg1, SipStack jarg1_, String jarg2);
  public final static native boolean SipStack_setSTUNServer(long jarg1, SipStack jarg1_, String jarg2, int jarg3);
  public final static native boolean SipStack_setSTUNCred(long jarg1, SipStack jarg1_, String jarg2, String jarg3);
  public final static native String SipStack_dnsENUM(long jarg1, SipStack jarg1_, String jarg2, String jarg3, String jarg4);
  public final static native String SipStack_dnsNaptrSrv(long jarg1, SipStack jarg1_, String jarg2, String jarg3, int[] jarg4);
  public final static native String SipStack_dnsSrv(long jarg1, SipStack jarg1_, String jarg2, int[] jarg3);
  public final static native boolean SipStack_isValid(long jarg1, SipStack jarg1_);
  public final static native boolean SipStack_stop(long jarg1, SipStack jarg1_);
  public final static native void SipStack_setCodecs(int jarg1);
  public final static native void SipStack_setCodecs_2(int jarg1);
  public final static native long new_XcapSelector(long jarg1, XcapStack jarg1_);
  public final static native void delete_XcapSelector(long jarg1);
  public final static native long XcapSelector_setAUID(long jarg1, XcapSelector jarg1_, String jarg2);
  public final static native long XcapSelector_setName(long jarg1, XcapSelector jarg1_, String jarg2);
  public final static native long XcapSelector_setAttribute(long jarg1, XcapSelector jarg1_, String jarg2, String jarg3, String jarg4);
  public final static native long XcapSelector_setPos(long jarg1, XcapSelector jarg1_, String jarg2, long jarg3);
  public final static native long XcapSelector_setPosAttribute(long jarg1, XcapSelector jarg1_, String jarg2, long jarg3, String jarg4, String jarg5);
  public final static native long XcapSelector_setNamespace(long jarg1, XcapSelector jarg1_, String jarg2, String jarg3);
  public final static native String XcapSelector_getString(long jarg1, XcapSelector jarg1_);
  public final static native void XcapSelector_reset(long jarg1, XcapSelector jarg1_);
  public final static native long new_XcapMessage();
  public final static native void delete_XcapMessage(long jarg1);
  public final static native short XcapMessage_getCode(long jarg1, XcapMessage jarg1_);
  public final static native String XcapMessage_getPhrase(long jarg1, XcapMessage jarg1_);
  public final static native String XcapMessage_getXcapHeaderValue__SWIG_0(long jarg1, XcapMessage jarg1_, String jarg2, long jarg3);
  public final static native String XcapMessage_getXcapHeaderValue__SWIG_1(long jarg1, XcapMessage jarg1_, String jarg2);
  public final static native String XcapMessage_getXcapHeaderParamValue__SWIG_0(long jarg1, XcapMessage jarg1_, String jarg2, String jarg3, long jarg4);
  public final static native String XcapMessage_getXcapHeaderParamValue__SWIG_1(long jarg1, XcapMessage jarg1_, String jarg2, String jarg3);
  public final static native long XcapMessage_getXcapContentLength(long jarg1, XcapMessage jarg1_);
  public final static native long XcapMessage_getXcapContent(long jarg1, XcapMessage jarg1_, java.nio.ByteBuffer jarg2, long jarg3);
  public final static native void delete_XcapEvent(long jarg1);
  public final static native int XcapEvent_getType(long jarg1, XcapEvent jarg1_);
  public final static native long XcapEvent_getXcapMessage(long jarg1, XcapEvent jarg1_);
  public final static native long new_XcapCallback();
  public final static native void delete_XcapCallback(long jarg1);
  public final static native int XcapCallback_onEvent(long jarg1, XcapCallback jarg1_, long jarg2, XcapEvent jarg2_);
  public final static native int XcapCallback_onEventSwigExplicitXcapCallback(long jarg1, XcapCallback jarg1_, long jarg2, XcapEvent jarg2_);
  public final static native void XcapCallback_director_connect(XcapCallback obj, long cptr, boolean mem_own, boolean weak_global);
  public final static native void XcapCallback_change_ownership(XcapCallback obj, long cptr, boolean take_or_release);
  public final static native long new_XcapStack(long jarg1, XcapCallback jarg1_, String jarg2, String jarg3, String jarg4);
  public final static native void delete_XcapStack(long jarg1);
  public final static native boolean XcapStack_start(long jarg1, XcapStack jarg1_);
  public final static native boolean XcapStack_setCredentials(long jarg1, XcapStack jarg1_, String jarg2, String jarg3);
  public final static native boolean XcapStack_setXcapRoot(long jarg1, XcapStack jarg1_, String jarg2);
  public final static native boolean XcapStack_setLocalIP(long jarg1, XcapStack jarg1_, String jarg2);
  public final static native boolean XcapStack_setLocalPort(long jarg1, XcapStack jarg1_, long jarg2);
  public final static native boolean XcapStack_addHeader(long jarg1, XcapStack jarg1_, String jarg2, String jarg3);
  public final static native boolean XcapStack_removeHeader(long jarg1, XcapStack jarg1_, String jarg2);
  public final static native boolean XcapStack_setTimeout(long jarg1, XcapStack jarg1_, long jarg2);
  public final static native boolean XcapStack_getDocument(long jarg1, XcapStack jarg1_, String jarg2);
  public final static native boolean XcapStack_stop(long jarg1, XcapStack jarg1_);
  public final static native long new_RPData();
  public final static native void delete_RPData(long jarg1);
  public final static native int RPData_getType(long jarg1, RPData jarg1_);
  public final static native long RPData_getPayloadLength(long jarg1, RPData jarg1_);
  public final static native long RPData_getPayload(long jarg1, RPData jarg1_, java.nio.ByteBuffer jarg2, long jarg3);
  public final static native long SMSEncoder_encodeSubmit(int jarg1, String jarg2, String jarg3, String jarg4);
  public final static native void delete_SMSEncoder(long jarg1);
  public final static native long SWIGDialogEventUpcast(long jarg1);
  public final static native long SWIGStackEventUpcast(long jarg1);
  public final static native long SWIGCallEventUpcast(long jarg1);
  public final static native long SWIGMessagingEventUpcast(long jarg1);
  public final static native long SWIGOptionsEventUpcast(long jarg1);
  public final static native long SWIGPublicationEventUpcast(long jarg1);
  public final static native long SWIGRegistrationEventUpcast(long jarg1);
  public final static native long SWIGSubscriptionEventUpcast(long jarg1);
  public final static native long SWIGCallSessionUpcast(long jarg1);
  public final static native long SWIGMessagingSessionUpcast(long jarg1);
  public final static native long SWIGOptionsSessionUpcast(long jarg1);
  public final static native long SWIGPublicationSessionUpcast(long jarg1);
  public final static native long SWIGRegistrationSessionUpcast(long jarg1);
  public final static native long SWIGSubscriptionSessionUpcast(long jarg1);
  public final static native long SWIGSipStackUpcast(long jarg1);

  public static int SwigDirector_ProxyAudioConsumer_prepare(ProxyAudioConsumer self, int ptime, int rate, int channels) {
    return self.prepare(ptime, rate, channels);
  }
  public static int SwigDirector_ProxyAudioConsumer_start(ProxyAudioConsumer self) {
    return self.start();
  }
  public static int SwigDirector_ProxyAudioConsumer_pause(ProxyAudioConsumer self) {
    return self.pause();
  }
  public static int SwigDirector_ProxyAudioConsumer_stop(ProxyAudioConsumer self) {
    return self.stop();
  }
  public static int SwigDirector_ProxyVideoConsumer_prepare(ProxyVideoConsumer self, int width, int height, int fps) {
    return self.prepare(width, height, fps);
  }
  public static int SwigDirector_ProxyVideoConsumer_consume(ProxyVideoConsumer self, long frame) {
    return self.consume((frame == 0) ? null : new ProxyVideoFrame(frame, false));
  }
  public static int SwigDirector_ProxyVideoConsumer_start(ProxyVideoConsumer self) {
    return self.start();
  }
  public static int SwigDirector_ProxyVideoConsumer_pause(ProxyVideoConsumer self) {
    return self.pause();
  }
  public static int SwigDirector_ProxyVideoConsumer_stop(ProxyVideoConsumer self) {
    return self.stop();
  }
  public static int SwigDirector_ProxyAudioProducer_prepare(ProxyAudioProducer self, int ptime, int rate, int channels) {
    return self.prepare(ptime, rate, channels);
  }
  public static int SwigDirector_ProxyAudioProducer_start(ProxyAudioProducer self) {
    return self.start();
  }
  public static int SwigDirector_ProxyAudioProducer_pause(ProxyAudioProducer self) {
    return self.pause();
  }
  public static int SwigDirector_ProxyAudioProducer_stop(ProxyAudioProducer self) {
    return self.stop();
  }
  public static int SwigDirector_ProxyVideoProducer_prepare(ProxyVideoProducer self, int width, int height, int fps) {
    return self.prepare(width, height, fps);
  }
  public static int SwigDirector_ProxyVideoProducer_start(ProxyVideoProducer self) {
    return self.start();
  }
  public static int SwigDirector_ProxyVideoProducer_pause(ProxyVideoProducer self) {
    return self.pause();
  }
  public static int SwigDirector_ProxyVideoProducer_stop(ProxyVideoProducer self) {
    return self.stop();
  }
  public static int SwigDirector_SipCallback_OnDialogEvent(SipCallback self, long e) {
    return self.OnDialogEvent((e == 0) ? null : new DialogEvent(e, false));
  }
  public static int SwigDirector_SipCallback_OnStackEvent(SipCallback self, long e) {
    return self.OnStackEvent((e == 0) ? null : new StackEvent(e, false));
  }
  public static int SwigDirector_SipCallback_OnCallEvent(SipCallback self, long e) {
    return self.OnCallEvent((e == 0) ? null : new CallEvent(e, false));
  }
  public static int SwigDirector_SipCallback_OnMessagingEvent(SipCallback self, long e) {
    return self.OnMessagingEvent((e == 0) ? null : new MessagingEvent(e, false));
  }
  public static int SwigDirector_SipCallback_OnOptionsEvent(SipCallback self, long e) {
    return self.OnOptionsEvent((e == 0) ? null : new OptionsEvent(e, false));
  }
  public static int SwigDirector_SipCallback_OnPublicationEvent(SipCallback self, long e) {
    return self.OnPublicationEvent((e == 0) ? null : new PublicationEvent(e, false));
  }
  public static int SwigDirector_SipCallback_OnRegistrationEvent(SipCallback self, long e) {
    return self.OnRegistrationEvent((e == 0) ? null : new RegistrationEvent(e, false));
  }
  public static int SwigDirector_SipCallback_OnSubscriptionEvent(SipCallback self, long e) {
    return self.OnSubscriptionEvent((e == 0) ? null : new SubscriptionEvent(e, false));
  }
  public static int SwigDirector_XcapCallback_onEvent(XcapCallback self, long e) {
    return self.onEvent((e == 0) ? null : new XcapEvent(e, false));
  }

  private final static native void swig_module_init();
  static {
    swig_module_init();
  }
}
