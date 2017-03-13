package com.appleframework.ums.server.collector.request;

import com.appleframework.rest.AbstractRestRequest;

public class PushpolicyqueryRequest extends AbstractRestRequest {

	private String appKey;

	public String getAppKey() {
		return appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

}
