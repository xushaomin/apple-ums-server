package com.appleframework.ums.server.core.model;

import java.io.Serializable;

public class ClientData implements Serializable {

	private static final long serialVersionUID = 4035426842020206893L;

	private String platform;
	private String channel;
	private Boolean isMobileDevice;
	private Boolean haveWifi;

	private String imei;
	private String userId;
	private String appKey;
	private String resolution;

	private String network;
	private String version;
	private String osVersion;
	private String deviceId;
	private Boolean haveBt;
	private Integer phoneType;

	private Boolean haveGps;
	private String moduleName;
	private String time;
	private String wifiMac;
	private String deviceName;

	private String mccmnc;
	private String imsi;
	private String language;

	private Boolean haveGravity;
	private String salt;

	private String longitude;
	private String latitude;
	
	private Integer isJailBroken;

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public Boolean getIsMobileDevice() {
		return isMobileDevice;
	}

	public void setIsMobileDevice(Boolean isMobileDevice) {
		this.isMobileDevice = isMobileDevice;
	}

	public Boolean getHaveWifi() {
		return haveWifi;
	}

	public void setHaveWifi(Boolean haveWifi) {
		this.haveWifi = haveWifi;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
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

	public String getOsVersion() {
		return osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public Boolean getHaveBt() {
		return haveBt;
	}

	public void setHaveBt(Boolean haveBt) {
		this.haveBt = haveBt;
	}

	public Integer getPhoneType() {
		return phoneType;
	}

	public void setPhoneType(Integer phoneType) {
		this.phoneType = phoneType;
	}

	public Boolean getHaveGps() {
		return haveGps;
	}

	public void setHaveGps(Boolean haveGps) {
		this.haveGps = haveGps;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getWifiMac() {
		return wifiMac;
	}

	public void setWifiMac(String wifiMac) {
		this.wifiMac = wifiMac;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
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

	public Boolean getHaveGravity() {
		return haveGravity;
	}

	public void setHaveGravity(Boolean haveGravity) {
		this.haveGravity = haveGravity;
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

	public Integer getIsJailBroken() {
		return isJailBroken;
	}

	public void setIsJailBroken(Integer isJailBroken) {
		this.isJailBroken = isJailBroken;
	}

	@Override
	public String toString() {
		return "ClientData [platform=" + platform + ", channel=" + channel + ", isMobileDevice=" + isMobileDevice
				+ ", haveWifi=" + haveWifi + ", imei=" + imei + ", userId=" + userId + ", appKey=" + appKey
				+ ", resolution=" + resolution + ", network=" + network + ", version=" + version + ", osVersion="
				+ osVersion + ", deviceId=" + deviceId + ", haveBt=" + haveBt + ", phoneType=" + phoneType
				+ ", haveGps=" + haveGps + ", moduleName=" + moduleName + ", time=" + time + ", wifiMac=" + wifiMac
				+ ", deviceName=" + deviceName + ", mccmnc=" + mccmnc + ", imsi=" + imsi + ", language=" + language
				+ ", haveGravity=" + haveGravity + ", salt=" + salt + ", longitude=" + longitude + ", latitude="
				+ latitude + "]";
	}

}
