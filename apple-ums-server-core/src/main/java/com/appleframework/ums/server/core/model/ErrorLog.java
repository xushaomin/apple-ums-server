package com.appleframework.ums.server.core.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ErrorLog implements Serializable {

	private static final long serialVersionUID = 6627292882340302709L;
	
	private String error_type;
	private String time;
	private String session_id;
	private String useridentifier;
	private String appkey;
	private String devicename;
	private String lib_version;
	private String stacktrace;
	private String activity;
	private String deviceid;
	private String os_version;
	private String version;

	public String getError_type() {
		return error_type;
	}

	public void setError_type(String error_type) {
		this.error_type = error_type;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getSession_id() {
		return session_id;
	}

	public void setSession_id(String session_id) {
		this.session_id = session_id;
	}

	public String getUseridentifier() {
		return useridentifier;
	}

	public void setUseridentifier(String useridentifier) {
		this.useridentifier = useridentifier;
	}

	public String getAppkey() {
		return appkey;
	}

	public void setAppkey(String appkey) {
		this.appkey = appkey;
	}

	public String getDevicename() {
		return devicename;
	}

	public void setDevicename(String devicename) {
		this.devicename = devicename;
	}

	public String getLib_version() {
		return lib_version;
	}

	public void setLib_version(String lib_version) {
		this.lib_version = lib_version;
	}

	public String getStacktrace() {
		return stacktrace;
	}

	public void setStacktrace(String stacktrace) {
		this.stacktrace = stacktrace;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public String getDeviceid() {
		return deviceid;
	}

	public void setDeviceid(String deviceid) {
		this.deviceid = deviceid;
	}

	public String getOs_version() {
		return os_version;
	}

	public void setOs_version(String os_version) {
		this.os_version = os_version;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		StringBuffer buffer = new StringBuffer();
		buffer.append(error_type).append("\t");
		buffer.append(time).append("\t");
		buffer.append(session_id).append("\t");
		buffer.append(useridentifier).append("\t");
		buffer.append(appkey).append("\t");
		buffer.append(devicename).append("\t");
		buffer.append(lib_version).append("\t");
		buffer.append(activity).append("\t");
		buffer.append(deviceid).append("\t");
		buffer.append(os_version).append("\t");
		buffer.append(version).append("\t");
		buffer.append(sdf.format(new Date()));
		return buffer.toString();
		
		/*private String error_type;
		private String time;
		private String session_id;
		private String useridentifier;
		private String appkey;
		private String devicename;
		private String lib_version;
		private String stacktrace;
		private String activity;
		private String deviceid;
		private String os_version;
		private String version;*/
	}

}
