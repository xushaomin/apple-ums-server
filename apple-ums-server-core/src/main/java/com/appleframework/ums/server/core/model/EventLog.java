package com.appleframework.ums.server.core.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EventLog implements Serializable {

	private static final long serialVersionUID = 4757760187921535005L;

	private String session_id;
	private String time;
	private String useridentifier;
	private String appkey;
	private String label;
	private String lib_version;
	private String attachment;
	private String acc;
	private String activity;
	private String event_identifier;
	private String deviceid;
	private String version;

	public String getSession_id() {
		return session_id;
	}

	public void setSession_id(String session_id) {
		this.session_id = session_id;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
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

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getLib_version() {
		return lib_version;
	}

	public void setLib_version(String lib_version) {
		this.lib_version = lib_version;
	}

	public String getAttachment() {
		return attachment;
	}

	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}

	public String getAcc() {
		return acc;
	}

	public void setAcc(String acc) {
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
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		StringBuffer buffer = new StringBuffer();
		buffer.append(deviceid.trim()).append(",");// deviceid
		buffer.append(activity).append(",");// category
		buffer.append(event_identifier.trim()).append(",");// event
		buffer.append(label).append(",");// label
		buffer.append(attachment.trim()).append(",");// attachment
		buffer.append(time.trim()).append(",");// clientdate
		buffer.append(appkey.trim()).append(",");// productkey
		buffer.append(acc).append(",");// num
		buffer.append(0).append(",");// event_id
		buffer.append(version).append(",");// version
		buffer.append(useridentifier.trim()).append(",");// useridentifier
		buffer.append(session_id.trim()).append(",");// session_id
		buffer.append(lib_version.trim()).append(",");// lib_version
		buffer.append(sdf.format(new Date()));// insertdate
		return buffer.toString();
	}

}
