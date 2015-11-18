package com.appleframework.ums.server.collector.model;

import java.io.Serializable;

public class ClientDataVo implements Serializable {

	/*
	 {
	    "platform": "android",
	    "ismobiledevice": true,
	    "havewifi": true,
	    "imei": "352304060262284",
	    "userid": "user id",
	    "appkey": "e739b6f55077da0038c93978863d811c",
	    "resolution": "720x1280",
	    "network": "wifi",
	    "version": "1.0",
	    "os_version": "4.1.2",
	    "deviceid": "7c82bd703c2bc7905da9a150f771da67",
	    "havebt": true,
	    "phonetype": 1,
	    "havegps": "false",
	    "modulename": "t03gzc",
	    "time": "2015-10-14 21:50:31",
	    "wifimac": "78:4B:87:6B:5A:A0",
	    "devicename": "Samsung GT-N7100",
	    "mccmnc": "46001",
	    "imsi": "",
	    "language": "zh",
	    "havegravity": true,
	    "salt": "fb81ea4de8c3416cbdb773c7f0afb682"
	}
	*/

	private static final long serialVersionUID = -9103690988636507554L;
	
	private String platform;
	private Boolean ismobiledevice;
	private Boolean havewifi;

	private String imei;
	private String userid;
	private String appkey;
	private String resolution;

	private String network;
	private String version;
	private String os_version;
	private String deviceid;
	private Boolean havebt;
	private Integer phonetype;

	private Boolean havegps;
	private String modulename;
	private String time;
	private String wifimac;
	private String devicename;

	private String mccmnc;
	private String imsi;
	private String language;

	private Boolean havegravity;
	private String salt;

	private String longitude;
	private String latitude;
	
	private String channel;
	private Integer isjailbroken;
	private String ip;

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public Boolean getIsmobiledevice() {
		return ismobiledevice;
	}

	public void setIsmobiledevice(Boolean ismobiledevice) {
		this.ismobiledevice = ismobiledevice;
	}

	public Boolean getHavewifi() {
		return havewifi;
	}

	public void setHavewifi(Boolean havewifi) {
		this.havewifi = havewifi;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
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

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getOs_version() {
		return os_version;
	}

	public void setOs_version(String os_version) {
		this.os_version = os_version;
	}

	public String getDeviceid() {
		return deviceid;
	}

	public void setDeviceid(String deviceid) {
		this.deviceid = deviceid;
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

	public Boolean getHavegravity() {
		return havegravity;
	}

	public void setHavegravity(Boolean havegravity) {
		this.havegravity = havegravity;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	
	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public Integer getIsjailbroken() {
		return isjailbroken;
	}

	public void setIsjailbroken(Integer isjailbroken) {
		this.isjailbroken = isjailbroken;
	}
	
	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	@Override
	public String toString() {
		return "ClientDataVo [platform=" + platform + ", ismobiledevice=" + ismobiledevice + ", havewifi=" + havewifi
				+ ", imei=" + imei + ", userid=" + userid + ", appkey=" + appkey + ", resolution=" + resolution
				+ ", network=" + network + ", version=" + version + ", os_version=" + os_version + ", deviceid="
				+ deviceid + ", havebt=" + havebt + ", phonetype=" + phonetype + ", havegps=" + havegps
				+ ", modulename=" + modulename + ", time=" + time + ", wifimac=" + wifimac + ", devicename="
				+ devicename + ", mccmnc=" + mccmnc + ", imsi=" + imsi + ", language=" + language + ", havegravity="
				+ havegravity + ", salt=" + salt + ", longitude=" + longitude + ", latitude=" + latitude + ", channel="
				+ channel + "]";
	}
	
}
