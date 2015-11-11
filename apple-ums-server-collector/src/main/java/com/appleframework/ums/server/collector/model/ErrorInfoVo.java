package com.appleframework.ums.server.collector.model;

import java.io.Serializable;

public class ErrorInfoVo implements Serializable {

	/*
	 {
	    "appkey": "e739b6f55077da0038c93978863d811c",
	  	"time": "2015-10-14 22:08:19",
	    "stacktrace": "java.lang.ArithmeticException",
	    "activity": ".CobubSampleActivity",
	   	"deviceid": "Samsung GT-N7100",
	 	"os_version": "4.1.2",
	  	"version": "1.0"
	}
	*/

	private static final long serialVersionUID = -9103690988636507554L;
	
	private String appkey;
	private String time;
	private String stacktrace;

	private String activity;
	private String deviceid;
	private String os_version;
	private String version;

	public String getAppkey() {
		return appkey;
	}

	public void setAppkey(String appkey) {
		this.appkey = appkey;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
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
		return "ErrorInfo [appkey=" + appkey + ", time=" + time + ", stacktrace=" + stacktrace + ", activity="
				+ activity + ", deviceid=" + deviceid + ", os_version=" + os_version + ", version=" + version + "]";
	}
	
}
