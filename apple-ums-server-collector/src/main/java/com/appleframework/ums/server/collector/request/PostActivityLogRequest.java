package com.appleframework.ums.server.collector.request;

import com.appleframework.rest.AbstractRestRequest;

public class PostActivityLogRequest extends AbstractRestRequest {

	/*{
	    "duration": "289",
	    "session_id": "1eb69a5ba11cf85a61785d9ca3866e79",
	    "end_millis": "2015-10-14 21:25:18",
	    "start_millis": "2015-10-14 21:25:18",
	    "userid": "user id",
	    "appkey": "e739b6f55077da0038c93978863d811c",
	    "activities": "Page:43",
	    "deviceid": "7c82bd703c2bc7905da9a150f771da67",
	    "version": "1.0"
	}*/

	private String duration;
	private String session_id;
	private String end_millis;
	private String start_millis;
	private String userid;
	private String appkey;
	private String activities;
	private String deviceid;
	private String version;

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getSession_id() {
		return session_id;
	}

	public void setSession_id(String session_id) {
		this.session_id = session_id;
	}

	public String getEnd_millis() {
		return end_millis;
	}

	public void setEnd_millis(String end_millis) {
		this.end_millis = end_millis;
	}

	public String getStart_millis() {
		return start_millis;
	}

	public void setStart_millis(String start_millis) {
		this.start_millis = start_millis;
	}

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

	public String getActivities() {
		return activities;
	}

	public void setActivities(String activities) {
		this.activities = activities;
	}

	public String getDeviceid() {
		return deviceid;
	}

	public void setDeviceid(String deviceid) {
		this.deviceid = deviceid;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "PostActivityLogRequest [duration=" + duration + ", session_id=" + session_id + ", end_millis="
				+ end_millis + ", start_millis=" + start_millis + ", userid=" + userid + ", appkey=" + appkey
				+ ", activities=" + activities + ", deviceid=" + deviceid + ", version=" + version + "]";
	}
	
}
