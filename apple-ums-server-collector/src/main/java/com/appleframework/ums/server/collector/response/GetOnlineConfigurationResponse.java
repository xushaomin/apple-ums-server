package com.appleframework.ums.server.collector.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.appleframework.rest.response.SuccessResponse;

/**
 * <pre>
 * 功能说明：
 * </pre>
 * 
 * @author 徐少敏
 * @version 1.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "getOnlineConfigurationResponse")
public class GetOnlineConfigurationResponse extends SuccessResponse {

	/*
	 * { 
	 * 	"flag": 1, 
	 * 	"msg": "ok", 
	 * 	"autogetlocation": "1", 
	 * 	"updateonlywifi": "1",
	 * 	"sessionmillis": "30", 
	 * 	"reportpolicy": "1" 
	 * }
	 */

	private String autogetlocation;
	private String updateonlywifi;
	private String sessionmillis;
	private String reportpolicy;

	public String getAutogetlocation() {
		return autogetlocation;
	}

	public void setAutogetlocation(String autogetlocation) {
		this.autogetlocation = autogetlocation;
	}

	public String getUpdateonlywifi() {
		return updateonlywifi;
	}

	public void setUpdateonlywifi(String updateonlywifi) {
		this.updateonlywifi = updateonlywifi;
	}

	public String getSessionmillis() {
		return sessionmillis;
	}

	public void setSessionmillis(String sessionmillis) {
		this.sessionmillis = sessionmillis;
	}

	public String getReportpolicy() {
		return reportpolicy;
	}

	public void setReportpolicy(String reportpolicy) {
		this.reportpolicy = reportpolicy;
	}

}
