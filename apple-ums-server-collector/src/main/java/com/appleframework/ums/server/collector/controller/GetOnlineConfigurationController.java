package com.appleframework.ums.server.collector.controller;

import org.apache.log4j.Logger;

import com.appleframework.rest.annotation.ServiceMethod;
import com.appleframework.rest.annotation.ServiceMethodBean;
import com.appleframework.ums.server.collector.request.GetOnlineConfigurationRequest;
import com.appleframework.ums.server.collector.response.GetOnlineConfigurationResponse;

/**
 * <pre>
 * 功能说明：
 * </pre>
 * 
 * @author 徐少敏
 * @version 1.0
 */
@ServiceMethodBean
public class GetOnlineConfigurationController {
	
	private static Logger logger = Logger.getLogger(GetOnlineConfigurationController.class);

	@ServiceMethod(method = "/ums/getOnlineConfiguration")
	public Object getOnlineConfiguration(GetOnlineConfigurationRequest request) {
		GetOnlineConfigurationResponse response = new GetOnlineConfigurationResponse();
		response.setAutogetlocation("1");
		response.setUpdateonlywifi("1");
		response.setSessionmillis("30");
		response.setReportpolicy("1");
		logger.info(request);
		return response;
	}

}