package com.appleframework.ums.server.core.model;

import java.io.Serializable;

public class EventLog implements Serializable {

	private static final long serialVersionUID = -2933721846517475515L;

	private String time;
	private String userId;
	private String appKey;
	private String label;
	private String attachment;
	private Integer acc;
	private String activity;
	private String eventIdentifier;
	private String deviceId;
	private String version;

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

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

	public String getEventIdentifier() {
		return eventIdentifier;
	}

	public void setEventIdentifier(String eventIdentifier) {
		this.eventIdentifier = eventIdentifier;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "EventLog [time=" + time + ", userId=" + userId + ", appKey=" + appKey + ", label=" + label
				+ ", attachment=" + attachment + ", acc=" + acc + ", activity=" + activity + ", eventIdentifier="
				+ eventIdentifier + ", deviceId=" + deviceId + ", version=" + version + "]";
	}

}
