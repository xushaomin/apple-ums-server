package com.appleframework.ums.server.storage.model;

import java.io.Serializable;

public class ClientData implements Serializable {

	private static final long serialVersionUID = 6401151737886170198L;

	private String session_id;
	private String cellid;
	private Boolean ismobiledevice;
	private String appkey;
	private String resolution;
	private String network;
	private String lac;
	private String version;
	private String deviceid;
	private String modulename;
	private String time;
	private String useridentifier;
	private String lib_version;
	private Boolean havegravity;
	private String platform;
	private Boolean havewifi;
	private String os_version;
	private Boolean havebt;
	private Integer phonetype;
	private Boolean havegps;
	private String wifimac;
	private String devicename;
	private String mccmnc;
	private String imsi;
	private String language;
	private String salt;

	public String getSession_id() {
		return session_id;
	}

	public void setSession_id(String session_id) {
		this.session_id = session_id;
	}

	public String getCellid() {
		return cellid;
	}

	public void setCellid(String cellid) {
		this.cellid = cellid;
	}

	public Boolean getIsmobiledevice() {
		return ismobiledevice;
	}

	public void setIsmobiledevice(Boolean ismobiledevice) {
		this.ismobiledevice = ismobiledevice;
	}

	public String getAppkey() {
		return appkey;
	}

	public void setAppkey(String appkey) {
		this.appkey = appkey;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public String getNetwork() {
		return network;
	}

	public void setNetwork(String network) {
		this.network = network;
	}

	public String getLac() {
		return lac;
	}

	public void setLac(String lac) {
		this.lac = lac;
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

	public String getModulename() {
		return modulename;
	}

	public void setModulename(String modulename) {
		this.modulename = modulename;
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

	public String getLib_version() {
		return lib_version;
	}

	public void setLib_version(String lib_version) {
		this.lib_version = lib_version;
	}

	public Boolean getHavegravity() {
		return havegravity;
	}

	public void setHavegravity(Boolean havegravity) {
		this.havegravity = havegravity;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public Boolean getHavewifi() {
		return havewifi;
	}

	public void setHavewifi(Boolean havewifi) {
		this.havewifi = havewifi;
	}

	public String getOs_version() {
		return os_version;
	}

	public void setOs_version(String os_version) {
		this.os_version = os_version;
	}

	public Boolean getHavebt() {
		return havebt;
	}

	public void setHavebt(Boolean havebt) {
		this.havebt = havebt;
	}

	public Integer getPhonetype() {
		return phonetype;
	}

	public void setPhonetype(Integer phonetype) {
		this.phonetype = phonetype;
	}

	public Boolean getHavegps() {
		return havegps;
	}

	public void setHavegps(Boolean havegps) {
		this.havegps = havegps;
	}

	public String getWifimac() {
		return wifimac;
	}

	public void setWifimac(String wifimac) {
		this.wifimac = wifimac;
	}

	public String getDevicename() {
		return devicename;
	}

	public void setDevicename(String devicename) {
		this.devicename = devicename;
	}

	public String getMccmnc() {
		return mccmnc;
	}

	public void setMccmnc(String mccmnc) {
		this.mccmnc = mccmnc;
	}

	public String getImsi() {
		return imsi;
	}

	public void setImsi(String imsi) {
		this.imsi = imsi;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ClientData [session_id=");
		builder.append(session_id);
		builder.append(", cellid=");
		builder.append(cellid);
		builder.append(", ismobiledevice=");
		builder.append(ismobiledevice);
		builder.append(", appkey=");
		builder.append(appkey);
		builder.append(", resolution=");
		builder.append(resolution);
		builder.append(", network=");
		builder.append(network);
		builder.append(", lac=");
		builder.append(lac);
		builder.append(", version=");
		builder.append(version);
		builder.append(", deviceid=");
		builder.append(deviceid);
		builder.append(", modulename=");
		builder.append(modulename);
		builder.append(", time=");
		builder.append(time);
		builder.append(", useridentifier=");
		builder.append(useridentifier);
		builder.append(", lib_version=");
		builder.append(lib_version);
		builder.append(", havegravity=");
		builder.append(havegravity);
		builder.append(", platform=");
		builder.append(platform);
		builder.append(", havewifi=");
		builder.append(havewifi);
		builder.append(", os_version=");
		builder.append(os_version);
		builder.append(", havebt=");
		builder.append(havebt);
		builder.append(", phonetype=");
		builder.append(phonetype);
		builder.append(", havegps=");
		builder.append(havegps);
		builder.append(", wifimac=");
		builder.append(wifimac);
		builder.append(", devicename=");
		builder.append(devicename);
		builder.append(", mccmnc=");
		builder.append(mccmnc);
		builder.append(", imsi=");
		builder.append(imsi);
		builder.append(", language=");
		builder.append(language);
		builder.append(", salt=");
		builder.append(salt);
		builder.append("]");
		return builder.toString();
	}

}
