package com.appleframework.ums.server.core.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

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
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		StringBuffer buffer = new StringBuffer();
		buffer.append("").append(","); //serviceversion
		buffer.append("").append(","); //name
		buffer.append(version).append(",");
		buffer.append(platform).append(",");
		buffer.append(os_version).append(","); //os_version
		buffer.append("").append(","); //osaddtional
		buffer.append(language).append(",");
		buffer.append(resolution).append(",");
		buffer.append(ismobiledevice).append(",");
		buffer.append(devicename).append(",");
		buffer.append(deviceid).append(",");
		buffer.append("unknown").append(","); //defaultbrowser
		buffer.append("unknown").append(","); //javasupport
		buffer.append("unknown").append(","); //flashversion
		buffer.append(modulename).append(",");
		buffer.append("unknown").append(",");//imei
		buffer.append(imsi).append(",");
		buffer.append(salt).append(",");
		buffer.append(havegps).append(",");
		buffer.append(havebt).append(",");
		buffer.append(havewifi).append(",");
		buffer.append(havegravity).append(",");
		buffer.append(wifimac).append(",");
		buffer.append("unknown").append(","); //latitude
		buffer.append("unknown").append(","); //longitude
		buffer.append(time).append(","); //time
		buffer.append("").append(","); //clientip
		buffer.append(appkey).append(","); //productkey
		buffer.append(mccmnc).append(","); //service_supplier
		buffer.append("unknown").append(","); //country
		buffer.append("unknown").append(","); //region
		buffer.append("unknown").append(","); //city
		buffer.append("unknown").append(","); //street
		buffer.append("unknown").append(","); //streetno
		buffer.append("unknown").append(","); //postcode
		buffer.append(network).append(",");
		buffer.append("0").append(","); //isjailbroken
		buffer.append(sdf.format(new Date()));// insertdate
		buffer.append(useridentifier).append(",");
		buffer.append(session_id).append(",");
		buffer.append(lib_version).append(",");
		return buffer.toString();
	}
	
	public String toString(String clientip, String country, String region, String city) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		StringBuffer buffer = new StringBuffer();
		buffer.append("").append(","); //serviceversion
		buffer.append("").append(","); //name
		buffer.append(version).append(",");
		buffer.append(platform).append(",");
		buffer.append(os_version).append(","); //os_version
		buffer.append("").append(","); //osaddtional
		buffer.append(language).append(",");
		buffer.append(resolution).append(",");
		buffer.append(ismobiledevice).append(",");
		buffer.append(devicename).append(",");
		buffer.append(deviceid).append(",");
		buffer.append("unknown").append(","); //defaultbrowser
		buffer.append("unknown").append(","); //javasupport
		buffer.append("unknown").append(","); //flashversion
		buffer.append(modulename).append(",");
		buffer.append("unknown").append(",");//imei
		buffer.append(imsi).append(",");
		buffer.append(salt).append(",");
		buffer.append(havegps).append(",");
		buffer.append(havebt).append(",");
		buffer.append(havewifi).append(",");
		buffer.append(havegravity).append(",");
		buffer.append(wifimac).append(",");
		buffer.append("unknown").append(","); //latitude
		buffer.append("unknown").append(","); //longitude
		buffer.append(time).append(","); //time
		buffer.append(clientip).append(",");
		buffer.append(appkey).append(",");
		buffer.append(mccmnc).append(","); //service_supplier
		buffer.append(country).append(","); //country
		buffer.append(region).append(","); //region
		buffer.append(city).append(","); //city
		buffer.append("unknown").append(","); //street
		buffer.append("unknown").append(","); //streetno
		buffer.append("unknown").append(","); //postcode
		buffer.append(network).append(",");
		buffer.append("0").append(","); //isjailbroken
		buffer.append(sdf.format(new Date()));// insertdate
		buffer.append(useridentifier).append(",");
		buffer.append(session_id).append(",");
		buffer.append(lib_version);
		return buffer.toString();
	}
}
