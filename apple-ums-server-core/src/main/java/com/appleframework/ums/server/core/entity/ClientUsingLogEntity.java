package com.appleframework.ums.server.core.entity;

import java.io.Serializable;
import java.util.Date;

public class ClientUsingLogEntity implements Serializable {
	
    private Integer id;

    private String sessionId;

    private Date startMillis;

    private Date endMillis;

    private Integer duration;

    private String activities;

    private String appkey;

    private String version;

    private String deviceid;

    private String useridentifier;

    private String libVersion;

    private Date insertdate;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId == null ? null : sessionId.trim();
    }

    public Date getStartMillis() {
        return startMillis;
    }

    public void setStartMillis(Date startMillis) {
        this.startMillis = startMillis;
    }

    public Date getEndMillis() {
        return endMillis;
    }

    public void setEndMillis(Date endMillis) {
        this.endMillis = endMillis;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getActivities() {
        return activities;
    }

    public void setActivities(String activities) {
        this.activities = activities == null ? null : activities.trim();
    }

    public String getAppkey() {
        return appkey;
    }

    public void setAppkey(String appkey) {
        this.appkey = appkey == null ? null : appkey.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(String deviceid) {
        this.deviceid = deviceid == null ? null : deviceid.trim();
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

    public Date getInsertdate() {
        return insertdate;
    }

    public void setInsertdate(Date insertdate) {
        this.insertdate = insertdate;
    }
}