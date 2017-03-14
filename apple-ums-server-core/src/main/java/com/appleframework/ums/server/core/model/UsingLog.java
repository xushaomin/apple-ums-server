package com.appleframework.ums.server.core.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

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
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		StringBuffer buffer = new StringBuffer();
		buffer.append(session_id).append(",");// session_id
		buffer.append(start_millis).append(",");// start_millis
		buffer.append(end_millis.trim()).append(",");// end_millis
		buffer.append(duration).append(",");// duration
		buffer.append(activities.trim()).append(",");// activities
		buffer.append(appkey).append(",");// appkey
		buffer.append(version).append(",");// version
		buffer.append(deviceid).append(",");// deviceid
		buffer.append(useridentifier).append(",");// useridentifier
		buffer.append(lib_version).append(",");// lib_version
		buffer.append(sdf.format(new Date()));// insertdate
		return buffer.toString();
	}

}
