package com.appleframework.ums.server.collector.controller;

import org.apache.log4j.Logger;

import com.appleframework.rest.AbstractRestRequest;
import com.appleframework.rest.annotation.ServiceMethod;
import com.appleframework.rest.annotation.ServiceMethodBean;
import com.appleframework.rest.response.SuccessResponse;

/**
 * <pre>
 * 功能说明：
 * </pre>
 * 
 * @author 徐少敏
 * @version 1.0
 */
@ServiceMethodBean
public class GetAllpratmetersController extends BaseController {

	private static Logger logger = Logger.getLogger(UsinglogController.class);

	@ServiceMethod(method = "/ums/getAllparameters")
	public Object usingLog(AbstractRestRequest request) {
		SuccessResponse response = new SuccessResponse();
		//String ip = request.getRestRequestContext().getIp();
		String content = request.getRestRequestContext().getContent();

		//messageProducer3.sendText("topic_usinglog", ip, content);
		
		logger.error(content);
		return response;
	}

}