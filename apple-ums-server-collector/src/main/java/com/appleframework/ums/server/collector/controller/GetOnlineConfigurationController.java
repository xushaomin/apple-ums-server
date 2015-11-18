package com.appleframework.ums.server.collector.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

import com.appleframework.rest.annotation.ServiceMethod;
import com.appleframework.rest.annotation.ServiceMethodBean;
import com.appleframework.ums.server.collector.request.GetOnlineConfigurationRequest;
import com.appleframework.ums.server.collector.response.GetOnlineConfigurationResponse;
import com.appleframework.ums.server.core.entity.ConfigEntity;
import com.appleframework.ums.server.core.entity.ProductEntity;
import com.appleframework.ums.server.core.service.ConfigService;
import com.appleframework.ums.server.core.service.ProductService;

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
	
	@Resource
	private ProductService productService;
	
	@Resource
	private ConfigService configService;

	@ServiceMethod(method = "/ums/getOnlineConfiguration")
	public Object getOnlineConfiguration(GetOnlineConfigurationRequest request) {
		GetOnlineConfigurationResponse response = new GetOnlineConfigurationResponse();
		String appKey = request.getAppkey();
		ProductEntity product = productService.getByProductKey(appKey);
		if(null != product) {
			ConfigEntity config = configService.get(product.getId());
			if(null != config) {
				response.setAutogetlocation(config.getAutogetlocation() == true ? "1":"0");
				response.setUpdateonlywifi(config.getUpdateonlywifi() == true ? "1":"0");
				response.setSessionmillis(config.getSessionmillis().toString());
				response.setReportpolicy(config.getReportpolicy().toString());
				return response;
			}
		}
		response.setAutogetlocation("1");
		response.setUpdateonlywifi("1");
		response.setSessionmillis("30");
		response.setReportpolicy("1");
		logger.info(request);
		return response;
	}

}