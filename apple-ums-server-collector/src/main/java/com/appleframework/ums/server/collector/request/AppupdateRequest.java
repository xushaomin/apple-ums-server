package com.appleframework.ums.server.collector.request;

import com.appleframework.rest.AbstractRestRequest;

public class AppupdateRequest extends AbstractRestRequest {

	private String appKey;
	private String versionCode;

	public String getAppKey() {
		return appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	public String getVersionCode() {
		return versionCode;
	}

	public void setVersionCode(String versionCode) {
		this.versionCode = versionCode;
	}

}
