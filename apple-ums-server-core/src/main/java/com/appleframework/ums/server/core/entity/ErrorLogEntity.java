package com.appleframework.ums.server.core.entity;

import java.io.Serializable;
import java.util.Date;

public class ErrorLogEntity implements Serializable {
    private Integer id;

    private String appkey;

    private String device;

    private String osVersion;

    private String activity;

    private Date time;

    private String version;

    private Integer isfix;

    private Integer errorType;

    private String sessionId;

    private String useridentifier;

    private String libVersion;

    private String deviceid;

    private String dsymid;

    private String cpt;

    private String bim;

    private Date insertdate;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAppkey() {
        return appkey;
    }

    public void setAppkey(String appkey) {
        this.appkey = appkey == null ? null : appkey.trim();
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device == null ? null : device.trim();
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion == null ? null : osVersion.trim();
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity == null ? null : activity.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public Integer getIsfix() {
        return isfix;
    }

    public void setIsfix(Integer isfix) {
        this.isfix = isfix;
    }

    public Integer getErrorType() {
        return errorType;
    }

    public void setErrorType(Integer errorType) {
        this.errorType = errorType;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId == null ? null : sessionId.trim();
    }

    public String getUseridentifier() {
        return useridentifier;
    }

    public void setUseridentifier(String useridentifier) {
        this.useridentifier = useridentifier == null ? null : useridentifier.trim();
    }

    public String getLibVersion() {
        return libVersion;
    }

    public void setLibVersion(String libVersion) {
        this.libVersion = libVersion == null ? null : libVersion.trim();
    }

    public String getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(String deviceid) {
        this.deviceid = deviceid == null ? null : deviceid.trim();
    }

    public String getDsymid() {
        return dsymid;
    }

    public void setDsymid(String dsymid) {
        this.dsymid = dsymid == null ? null : dsymid.trim();
    }

    public String getCpt() {
        return cpt;
    }

    public void setCpt(String cpt) {
        this.cpt = cpt == null ? null : cpt.trim();
    }

    public String getBim() {
        return bim;
    }

    public void setBim(String bim) {
        this.bim = bim == null ? null : bim.trim();
    }

    public Date getInsertdate() {
        return insertdate;
    }

    public void setInsertdate(Date insertdate) {
        this.insertdate = insertdate;
    }
}