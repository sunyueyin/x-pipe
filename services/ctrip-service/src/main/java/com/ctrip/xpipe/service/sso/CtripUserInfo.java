package com.ctrip.xpipe.service.sso;

import com.ctrip.xpipe.api.sso.UserInfo;

/**
 * @author lepdou 2016-11-08
 */
public class CtripUserInfo implements UserInfo {

    private String userId;

    @Override
    public String getUserId() {
        return userId;
    }

    @Override
    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public int getOrder() {
        return HIGHEST_PRECEDENCE;
    }
}
