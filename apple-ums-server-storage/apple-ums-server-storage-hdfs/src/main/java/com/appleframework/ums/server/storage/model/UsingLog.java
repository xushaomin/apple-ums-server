package com.appleframework.ums.server.storage.model;

import java.io.Serializable;

public class UsingLog implements Serializable {

	private static final long serialVersionUID = 6627292882340302709L;

	private String session_id;
	private String duration;
	private String end_millis;
	private String useridentifier;
	private String start_millis;
	private String appkey;
	private String activities;
	private String lib_version;
	private String version;
	private String deviceid;

	public String getSession_id() {
		return session_id;
	}

	public void setSession_id(String session_id) {
		this.session_id = session_id;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getEnd_millis() {
		return end_millis;
	}

	public void setEnd_millis(String end_millis) {
		this.end_millis = end_millis;
	}

	public String getUseridentifier() {
		return useridentifier;
	}

	public void setUseridentifier(String useridentifier) {
		this.useridentifier = useridentifier;
	}

	public String getStart_millis() {
		return start_millis;
	}

	public void setStart_millis(String start_millis) {
		this.start_millis = start_millis;
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

	public String getLib_version() {
		return lib_version;
	}

	public void setLib_version(String lib_version) {
		this.lib_version = lib_version;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getDeviceid() {
		return deviceid;
	}

	public void setDeviceid(String deviceid) {
		this.deviceid = deviceid;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UsingLog [session_id=");
		builder.append(session_id);
		builder.append(", duration=");
		builder.append(duration);
		builder.append(", end_millis=");
		builder.append(end_millis);
		builder.append(", useridentifier=");
		builder.append(useridentifier);
		builder.append(", start_millis=");
		builder.append(start_millis);
		builder.append(", appkey=");
		builder.append(appkey);
		builder.append(", activities=");
		builder.append(activities);
		builder.append(", lib_version=");
		builder.append(lib_version);
		builder.append(", version=");
		builder.append(version);
		builder.append(", deviceid=");
		builder.append(deviceid);
		builder.append("]");
		return builder.toString();
	}
	
	

}
