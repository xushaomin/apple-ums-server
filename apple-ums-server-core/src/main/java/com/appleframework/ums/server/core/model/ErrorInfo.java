package com.appleframework.ums.server.core.model;

import java.io.Serializable;

public class ErrorInfo implements Serializable {

	private static final long serialVersionUID = -9103690988636507554L;

	private String appKey;
	private String time;
	private String stackTrace;

	private String activity;
	private String deviceId;
	private String osVersion;
	private String version;

	public String getAppKey() {
		return appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getStackTrace() {
		return stackTrace;
	}

	public void setStackTrace(String stackTrace) {
		this.stackTrace = stackTrace;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getOsVersion() {
		return osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "ErrorInfo [appKey=" + appKey + ", time=" + time + ", stackTrace=" + stackTrace + ", activity="
				+ activity + ", deviceId=" + deviceId + ", osVersion=" + osVersion + ", version=" + version + "]";
	}

}
