package com.appleframework.ums.server.collector.request;

import com.appleframework.rest.AbstractRestRequest;

public class PosttagRequest extends AbstractRestRequest {

	/*{
	    "appkey": "e739b6f55077da0038c93978863d811c",
	    "tags": "test tags",
	    "deviceid": "7c82bd703c2bc7905da9a150f771da67"
	}*/
	
	private String appkey;
	private String tags;
	private String deviceid;

	public String getAppkey() {
		return appkey;
	}

	public void setAppkey(String appkey) {
		this.appkey = appkey;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getDeviceid() {
		return deviceid;
	}

	public void setDeviceid(String deviceid) {
		this.deviceid = deviceid;
	}

	@Override
	public String toString() {
		return "PosttagRequest [appkey=" + appkey + ", tags=" + tags + ", deviceid=" + deviceid + "]";
	}
	

}
