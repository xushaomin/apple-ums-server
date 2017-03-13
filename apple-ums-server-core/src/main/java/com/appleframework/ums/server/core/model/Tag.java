package com.appleframework.ums.server.core.model;

import java.io.Serializable;

public class Tag implements Serializable {

	private static final long serialVersionUID = 6627292882340302709L;

	public String appkey;
	public String lib_version;
	public String useridentifier;
	public String tag;
	public String deviceid;

	public String getAppkey() {
		return appkey;
	}

	public void setAppkey(String appkey) {
		this.appkey = appkey;
	}

	public String getLib_version() {
		return lib_version;
	}

	public void setLib_version(String lib_version) {
		this.lib_version = lib_version;
	}

	public String getUseridentifier() {
		return useridentifier;
	}

	public void setUseridentifier(String useridentifier) {
		this.useridentifier = useridentifier;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
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
		builder.append("Tag [appkey=");
		builder.append(appkey);
		builder.append(", lib_version=");
		builder.append(lib_version);
		builder.append(", useridentifier=");
		builder.append(useridentifier);
		builder.append(", tag=");
		builder.append(tag);
		builder.append(", deviceid=");
		builder.append(deviceid);
		builder.append("]");
		return builder.toString();
	}

}
