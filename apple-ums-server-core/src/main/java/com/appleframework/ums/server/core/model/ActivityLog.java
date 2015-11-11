package com.appleframework.ums.server.core.model;

import java.io.Serializable;

public class ActivityLog implements Serializable {

	private static final long serialVersionUID = -4612441415437679113L;

	private String duration;
	private String sessionId;
	private String endMillis;
	private String startMillis;
	private String userId;
	private String appKey;
	private String activities;
	private String deviceId;
	private String version;

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getEndMillis() {
		return endMillis;
	}

	public void setEndMillis(String endMillis) {
		this.endMillis = endMillis;
	}

	public String getStartMillis() {
		return startMillis;
	}

	public void setStartMillis(String startMillis) {
		this.startMillis = startMillis;
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

	public String getActivities() {
		return activities;
	}

	public void setActivities(String activities) {
		this.activities = activities;
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
		return "ActivityLog [duration=" + duration + ", sessionId=" + sessionId + ", endMillis=" + endMillis
				+ ", startMillis=" + startMillis + ", userId=" + userId + ", appKey=" + appKey + ", activities="
				+ activities + ", deviceId=" + deviceId + ", version=" + version + "]";
	}

}
