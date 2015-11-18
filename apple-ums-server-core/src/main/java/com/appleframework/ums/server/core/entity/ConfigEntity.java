package com.appleframework.ums.server.core.entity;

import java.io.Serializable;

public class ConfigEntity implements Serializable {
	
    private Integer id;

    private Boolean autogetlocation;

    private Boolean updateonlywifi;

    private Integer productId;

    private Integer sessionmillis;

    private Integer reportpolicy;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getAutogetlocation() {
        return autogetlocation;
    }

    public void setAutogetlocation(Boolean autogetlocation) {
        this.autogetlocation = autogetlocation;
    }

    public Boolean getUpdateonlywifi() {
        return updateonlywifi;
    }

    public void setUpdateonlywifi(Boolean updateonlywifi) {
        this.updateonlywifi = updateonlywifi;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getSessionmillis() {
        return sessionmillis;
    }

    public void setSessionmillis(Integer sessionmillis) {
        this.sessionmillis = sessionmillis;
    }

    public Integer getReportpolicy() {
        return reportpolicy;
    }

    public void setReportpolicy(Integer reportpolicy) {
        this.reportpolicy = reportpolicy;
    }
}