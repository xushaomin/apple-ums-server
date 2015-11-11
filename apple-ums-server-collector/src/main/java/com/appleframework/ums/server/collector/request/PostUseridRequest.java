package com.appleframework.ums.server.collector.request;

import com.appleframework.rest.AbstractRestRequest;

public class PostUseridRequest extends AbstractRestRequest {

	/*{
	    "userid": "user id",
	    "appkey": "e739b6f55077da0038c93978863d811c",
	    "deviceid": "7c82bd703c2bc7905da9a150f771da67"
	}*/

	private String userid;
	private String appkey;
	private String deviceid;

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getAppkey() {
		return appkey;
	}

	public void setAppkey(String appkey) {
		this.appkey = appkey;
	}

	public String getDeviceid() {
		return deviceid;
	}

	public void setDeviceid(String deviceid) {
		this.deviceid = deviceid;
	}

	@Override
	public String toString() {
		return "PostUseridRequest [userid=" + userid + ", appkey=" + appkey + ", deviceid=" + deviceid + "]";
	}

}
