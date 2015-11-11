package com.appleframework.ums.server.collector.request;

import com.appleframework.rest.AbstractRestRequest;

public class GetOnlineConfigurationRequest extends AbstractRestRequest {

	// {
	// "appkey":"e739b6f55077da0038c93978863d811c",
	//}

	private String appkey;

	public String getAppkey() {
		return appkey;
	}

	public void setAppkey(String appkey) {
		this.appkey = appkey;
	}

	@Override
	public String toString() {
		return "GetOnlineConfigurationRequest [appkey=" + appkey + "]";
	}
	
}
