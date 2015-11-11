package com.appleframework.ums.server.core.model;

import java.io.Serializable;

public class UserId implements Serializable {

	private static final long serialVersionUID = -7642959669670935363L;

	private String userId;
	private String appKey;
	private String deviceId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAppKey() {
		return appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	@Override
	public String toString() {
		return "UserId [userId=" + userId + ", appKey=" + appKey + ", deviceId=" + deviceId + "]";
	}

}
