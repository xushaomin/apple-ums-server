package com.appleframework.ums.server.core.entity;

import java.io.Serializable;
import java.util.Date;

public class ClientDataEntity implements Serializable {
    private Integer id;

    private String serviceversion;

    private String name;

    private String version;

    private String platform;

    private String osversion;

    private String osaddtional;

    private String language;

    private String resolution;

    private String ismobiledevice;

    private String devicename;

    private String deviceid;

    private String defaultbrowser;

    private String javasupport;

    private String flashversion;

    private String modulename;

    private String imei;

    private String imsi;

    private String salt;

    private String havegps;

    private String havebt;

    private String havewifi;

    private String havegravity;

    private String wifimac;

    private String latitude;

    private String longitude;

    private Date date;

    private String clientip;

    private String productkey;

    private String serviceSupplier;

    private String country;

    private String region;

    private String city;

    private String street;

    private String streetno;

    private String postcode;

    private String network;

    private Integer isjailbroken;

    private Date insertdate;

    private String useridentifier;

    private String sessionId;

    private String libVersion;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getServiceversion() {
        return serviceversion;
    }

    public void setServiceversion(String serviceversion) {
        this.serviceversion = serviceversion == null ? null : serviceversion.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform == null ? null : platform.trim();
    }

    public String getOsversion() {
        return osversion;
    }

    public void setOsversion(String osversion) {
        this.osversion = osversion == null ? null : osversion.trim();
    }

    public String getOsaddtional() {
        return osaddtional;
    }

    public void setOsaddtional(String osaddtional) {
        this.osaddtional = osaddtional == null ? null : osaddtional.trim();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution == null ? null : resolution.trim();
    }

    public String getIsmobiledevice() {
        return ismobiledevice;
    }

    public void setIsmobiledevice(String ismobiledevice) {
        this.ismobiledevice = ismobiledevice == null ? null : ismobiledevice.trim();
    }

    public String getDevicename() {
        return devicename;
    }

    public void setDevicename(String devicename) {
        this.devicename = devicename == null ? null : devicename.trim();
    }

    public String getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(String deviceid) {
        this.deviceid = deviceid == null ? null : deviceid.trim();
    }

    public String getDefaultbrowser() {
        return defaultbrowser;
    }

    public void setDefaultbrowser(String defaultbrowser) {
        this.defaultbrowser = defaultbrowser == null ? null : defaultbrowser.trim();
    }

    public String getJavasupport() {
        return javasupport;
    }

    public void setJavasupport(String javasupport) {
        this.javasupport = javasupport == null ? null : javasupport.trim();
    }

    public String getFlashversion() {
        return flashversion;
    }

    public void setFlashversion(String flashversion) {
        this.flashversion = flashversion == null ? null : flashversion.trim();
    }

    public String getModulename() {
        return modulename;
    }

    public void setModulename(String modulename) {
        this.modulename = modulename == null ? null : modulename.trim();
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei == null ? null : imei.trim();
    }

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi == null ? null : imsi.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public String getHavegps() {
        return havegps;
    }

    public void setHavegps(String havegps) {
        this.havegps = havegps == null ? null : havegps.trim();
    }

    public String getHavebt() {
        return havebt;
    }

    public void setHavebt(String havebt) {
        this.havebt = havebt == null ? null : havebt.trim();
    }

    public String getHavewifi() {
        return havewifi;
    }

    public void setHavewifi(String havewifi) {
        this.havewifi = havewifi == null ? null : havewifi.trim();
    }

    public String getHavegravity() {
        return havegravity;
    }

    public void setHavegravity(String havegravity) {
        this.havegravity = havegravity == null ? null : havegravity.trim();
    }

    public String getWifimac() {
        return wifimac;
    }

    public void setWifimac(String wifimac) {
        this.wifimac = wifimac == null ? null : wifimac.trim();
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude == null ? null : latitude.trim();
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getClientip() {
        return clientip;
    }

    public void setClientip(String clientip) {
        this.clientip = clientip == null ? null : clientip.trim();
    }

    public String getProductkey() {
        return productkey;
    }

    public void setProductkey(String productkey) {
        this.productkey = productkey == null ? null : productkey.trim();
    }

    public String getServiceSupplier() {
        return serviceSupplier;
    }

    public void setServiceSupplier(String serviceSupplier) {
        this.serviceSupplier = serviceSupplier == null ? null : serviceSupplier.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street == null ? null : street.trim();
    }

    public String getStreetno() {
        return streetno;
    }

    public void setStreetno(String streetno) {
        this.streetno = streetno == null ? null : streetno.trim();
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network == null ? null : network.trim();
    }

    public Integer getIsjailbroken() {
        return isjailbroken;
    }

    public void setIsjailbroken(Integer isjailbroken) {
        this.isjailbroken = isjailbroken;
    }

    public Date getInsertdate() {
        return insertdate;
    }

    public void setInsertdate(Date insertdate) {
        this.insertdate = insertdate;
    }

    public String getUseridentifier() {
        return useridentifier;
    }

    public void setUseridentifier(String useridentifier) {
        this.useridentifier = useridentifier == null ? null : useridentifier.trim();
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId == null ? null : sessionId.trim();
    }

    public String getLibVersion() {
        return libVersion;
    }

    public void setLibVersion(String libVersion) {
        this.libVersion = libVersion == null ? null : libVersion.trim();
    }
}