package com.appleframework.ums.server.collector.request;

import com.appleframework.rest.AbstractRestRequest;

public class PostEventRequest extends AbstractRestRequest {

	// {
	// "time":"2015-10-14 21:00:28",
	// "userid":"user id",
	// "appkey":"e739b6f55077da0038c93978863d811c",
	// "label":"",
	// "attachment":"",
	//	"acc":1,
	//	"activity":".CobubSampleActivity",
	//	"event_identifier":"click",
	//	"deviceid":"7c82bd703c2bc7905da9a150f771da67",
	//	"version":"1.0"
	//}

	private String time;
	private String userid;
	private String appkey;
	private String label;
	private String attachment;
	private Integer acc;
	private String activity;
	private String event_identifier;
	private String deviceid;
	private String version;

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
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

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getAttachment() {
		return attachment;
	}

	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}

	public Integer getAcc() {
		return acc;
	}

	public void setAcc(Integer acc) {
		this.acc = acc;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public String getEvent_identifier() {
		return event_identifier;
	}

	public void setEvent_identifier(String event_identifier) {
		this.event_identifier = event_identifier;
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
		return "PostEventRequest [time=" + time + ", userid=" + userid + ", appkey=" + appkey + ", label=" + label
				+ ", attachment=" + attachment + ", acc=" + acc + ", activity=" + activity + ", event_identifier="
				+ event_identifier + ", deviceid=" + deviceid + ", version=" + version + "]";
	}

}
