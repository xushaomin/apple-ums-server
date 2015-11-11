package com.appleframework.ums.server.collector.request;

import com.appleframework.rest.AbstractRestRequest;

public class GetApplicationUpdateRequest extends AbstractRestRequest {

	/*{
	    "appkey": "e739b6f55077da0038c93978863d811c",
	    "version_code": "1.0"
	}*/

	private String appkey;
	private String channel;
	private String version_code;

	public String getAppkey() {
		return appkey;
	}

	public void setAppkey(String appkey) {
		this.appkey = appkey;
	}

	public String getVersion_code() {
		return version_code;
	}

	public void setVersion_code(String version_code) {
		this.version_code = version_code;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	@Override
	public String toString() {
		return "GetApplicationUpdateRequest [appkey=" + appkey + ", channel=" + channel + ", version_code="
				+ version_code + "]";
	}

}
