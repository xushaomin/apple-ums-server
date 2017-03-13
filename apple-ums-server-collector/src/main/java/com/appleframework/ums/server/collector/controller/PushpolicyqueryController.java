package com.appleframework.ums.server.collector.controller;

import org.apache.log4j.Logger;

import com.appleframework.rest.annotation.ServiceMethod;
import com.appleframework.rest.annotation.ServiceMethodBean;
import com.appleframework.rest.response.SuccessResponse;
import com.appleframework.ums.server.collector.request.PushpolicyqueryRequest;

/**
 * <pre>
 * 功能说明：
 * </pre>
 * 
 * @author 徐少敏
 * @version 1.0
 */
@ServiceMethodBean
public class PushpolicyqueryController extends BaseController {

	private static Logger logger = Logger.getLogger(UsinglogController.class);

	@ServiceMethod(method = "/ums/pushpolicyquery")
	public Object pushpolicyquery(PushpolicyqueryRequest request) {
		SuccessResponse response = new SuccessResponse();
		//String ip = request.getRestRequestContext().getIp();
		String content = request.getAppKey();

		logger.error(content);
		//messageProducer3.sendText("topic_usinglog", ip, content);
		return response;
	}

}