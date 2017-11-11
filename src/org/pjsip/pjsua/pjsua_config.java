package org.pjsip.pjsua;

public class pjsua_config {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected pjsua_config(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(pjsua_config obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsuaJNI.delete_pjsua_config(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setMax_calls(long value) {
    pjsuaJNI.pjsua_config_max_calls_set(swigCPtr, this, value);
  }

  public long getMax_calls() {
    return pjsuaJNI.pjsua_config_max_calls_get(swigCPtr, this);
  }

  public void setThread_cnt(long value) {
    pjsuaJNI.pjsua_config_thread_cnt_set(swigCPtr, this, value);
  }

  public long getThread_cnt() {
    return pjsuaJNI.pjsua_config_thread_cnt_get(swigCPtr, this);
  }

  public void setNameserver_count(long value) {
    pjsuaJNI.pjsua_config_nameserver_count_set(swigCPtr, this, value);
  }

  public long getNameserver_count() {
    return pjsuaJNI.pjsua_config_nameserver_count_get(swigCPtr, this);
  }

  public void setNameserver(pj_str_t[] value) {
    pjsuaJNI.pjsua_config_nameserver_set(swigCPtr, this, pj_str_t.cArrayUnwrap(value));
  }

  public pj_str_t[] getNameserver() {
    return pj_str_t.cArrayWrap(pjsuaJNI.pjsua_config_nameserver_get(swigCPtr, this), false);
  }

  public void setForce_lr(int value) {
    pjsuaJNI.pjsua_config_force_lr_set(swigCPtr, this, value);
  }

  public int getForce_lr() {
    return pjsuaJNI.pjsua_config_force_lr_get(swigCPtr, this);
  }

  public void setOutbound_proxy_cnt(long value) {
    pjsuaJNI.pjsua_config_outbound_proxy_cnt_set(swigCPtr, this, value);
  }

  public long getOutbound_proxy_cnt() {
    return pjsuaJNI.pjsua_config_outbound_proxy_cnt_get(swigCPtr, this);
  }

  public void setOutbound_proxy(pj_str_t[] value) {
    pjsuaJNI.pjsua_config_outbound_proxy_set(swigCPtr, this, pj_str_t.cArrayUnwrap(value));
  }

  public pj_str_t[] getOutbound_proxy() {
    return pj_str_t.cArrayWrap(pjsuaJNI.pjsua_config_outbound_proxy_get(swigCPtr, this), false);
  }

  public void setStun_domain(pj_str_t value) {
    pjsuaJNI.pjsua_config_stun_domain_set(swigCPtr, this, pj_str_t.getCPtr(value), value);
  }

  public pj_str_t getStun_domain() {
    long cPtr = pjsuaJNI.pjsua_config_stun_domain_get(swigCPtr, this);
    return (cPtr == 0) ? null : new pj_str_t(cPtr, false);
  }

  public void setStun_host(pj_str_t value) {
    pjsuaJNI.pjsua_config_stun_host_set(swigCPtr, this, pj_str_t.getCPtr(value), value);
  }

  public pj_str_t getStun_host() {
    long cPtr = pjsuaJNI.pjsua_config_stun_host_get(swigCPtr, this);
    return (cPtr == 0) ? null : new pj_str_t(cPtr, false);
  }

  public void setStun_srv_cnt(long value) {
    pjsuaJNI.pjsua_config_stun_srv_cnt_set(swigCPtr, this, value);
  }

  public long getStun_srv_cnt() {
    return pjsuaJNI.pjsua_config_stun_srv_cnt_get(swigCPtr, this);
  }

  public void setStun_srv(pj_str_t[] value) {
    pjsuaJNI.pjsua_config_stun_srv_set(swigCPtr, this, pj_str_t.cArrayUnwrap(value));
  }

  public pj_str_t[] getStun_srv() {
    return pj_str_t.cArrayWrap(pjsuaJNI.pjsua_config_stun_srv_get(swigCPtr, this), false);
  }

  public void setStun_ignore_failure(int value) {
    pjsuaJNI.pjsua_config_stun_ignore_failure_set(swigCPtr, this, value);
  }

  public int getStun_ignore_failure() {
    return pjsuaJNI.pjsua_config_stun_ignore_failure_get(swigCPtr, this);
  }

  public void setStun_map_use_stun2(int value) {
    pjsuaJNI.pjsua_config_stun_map_use_stun2_set(swigCPtr, this, value);
  }

  public int getStun_map_use_stun2() {
    return pjsuaJNI.pjsua_config_stun_map_use_stun2_get(swigCPtr, this);
  }

  public void setNat_type_in_sdp(int value) {
    pjsuaJNI.pjsua_config_nat_type_in_sdp_set(swigCPtr, this, value);
  }

  public int getNat_type_in_sdp() {
    return pjsuaJNI.pjsua_config_nat_type_in_sdp_get(swigCPtr, this);
  }

  public void setRequire_100rel(pjsua_100rel_use value) {
    pjsuaJNI.pjsua_config_require_100rel_set(swigCPtr, this, value.swigValue());
  }

  public pjsua_100rel_use getRequire_100rel() {
    return pjsua_100rel_use.swigToEnum(pjsuaJNI.pjsua_config_require_100rel_get(swigCPtr, this));
  }

  public void setUse_timer(pjsua_sip_timer_use value) {
    pjsuaJNI.pjsua_config_use_timer_set(swigCPtr, this, value.swigValue());
  }

  public pjsua_sip_timer_use getUse_timer() {
    return pjsua_sip_timer_use.swigToEnum(pjsuaJNI.pjsua_config_use_timer_get(swigCPtr, this));
  }

  public void setEnable_unsolicited_mwi(int value) {
    pjsuaJNI.pjsua_config_enable_unsolicited_mwi_set(swigCPtr, this, value);
  }

  public int getEnable_unsolicited_mwi() {
    return pjsuaJNI.pjsua_config_enable_unsolicited_mwi_get(swigCPtr, this);
  }

  public void setTimer_setting(pjsip_timer_setting value) {
    pjsuaJNI.pjsua_config_timer_setting_set(swigCPtr, this, pjsip_timer_setting.getCPtr(value), value);
  }

  public pjsip_timer_setting getTimer_setting() {
    long cPtr = pjsuaJNI.pjsua_config_timer_setting_get(swigCPtr, this);
    return (cPtr == 0) ? null : new pjsip_timer_setting(cPtr, false);
  }

  public void setCred_count(long value) {
    pjsuaJNI.pjsua_config_cred_count_set(swigCPtr, this, value);
  }

  public long getCred_count() {
    return pjsuaJNI.pjsua_config_cred_count_get(swigCPtr, this);
  }

  public void setCred_info(pjsip_cred_info value) {
    pjsuaJNI.pjsua_config_cred_info_set(swigCPtr, this, pjsip_cred_info.getCPtr(value), value);
  }

  public pjsip_cred_info getCred_info() {
    long cPtr = pjsuaJNI.pjsua_config_cred_info_get(swigCPtr, this);
    return (cPtr == 0) ? null : new pjsip_cred_info(cPtr, false);
  }

  public void setCb(pjsua_callback value) {
    pjsuaJNI.pjsua_config_cb_set(swigCPtr, this, pjsua_callback.getCPtr(value), value);
  }

  public pjsua_callback getCb() {
    long cPtr = pjsuaJNI.pjsua_config_cb_get(swigCPtr, this);
    return (cPtr == 0) ? null : new pjsua_callback(cPtr, false);
  }

  public void setUser_agent(pj_str_t value) {
    pjsuaJNI.pjsua_config_user_agent_set(swigCPtr, this, pj_str_t.getCPtr(value), value);
  }

  public pj_str_t getUser_agent() {
    long cPtr = pjsuaJNI.pjsua_config_user_agent_get(swigCPtr, this);
    return (cPtr == 0) ? null : new pj_str_t(cPtr, false);
  }

  public void setUse_srtp(pjmedia_srtp_use value) {
    pjsuaJNI.pjsua_config_use_srtp_set(swigCPtr, this, value.swigValue());
  }

  public pjmedia_srtp_use getUse_srtp() {
    return pjmedia_srtp_use.swigToEnum(pjsuaJNI.pjsua_config_use_srtp_get(swigCPtr, this));
  }

  public void setSrtp_secure_signaling(int value) {
    pjsuaJNI.pjsua_config_srtp_secure_signaling_set(swigCPtr, this, value);
  }

  public int getSrtp_secure_signaling() {
    return pjsuaJNI.pjsua_config_srtp_secure_signaling_get(swigCPtr, this);
  }

  public void setSrtp_optional_dup_offer(int value) {
    pjsuaJNI.pjsua_config_srtp_optional_dup_offer_set(swigCPtr, this, value);
  }

  public int getSrtp_optional_dup_offer() {
    return pjsuaJNI.pjsua_config_srtp_optional_dup_offer_get(swigCPtr, this);
  }

  public void setHangup_forked_call(int value) {
    pjsuaJNI.pjsua_config_hangup_forked_call_set(swigCPtr, this, value);
  }

  public int getHangup_forked_call() {
    return pjsuaJNI.pjsua_config_hangup_forked_call_get(swigCPtr, this);
  }

  public pjsua_config() {
    this(pjsuaJNI.new_pjsua_config(), true);
  }

}
