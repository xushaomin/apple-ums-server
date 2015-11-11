package com.appleframework.ums.server.core.model;

import java.io.Serializable;

public class ClientTag implements Serializable {

	private static final long serialVersionUID = 8832731155570003458L;
	private String appKey;
	private String tags;
	private String deviceId;

	public String getAppKey() {
		return appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	@Override
	public String toString() {
		return "ClientTag [appKey=" + appKey + ", tags=" + tags + ", deviceId=" + deviceId + "]";
	}

}
