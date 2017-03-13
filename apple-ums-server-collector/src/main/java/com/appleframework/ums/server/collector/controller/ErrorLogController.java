package com.appleframework.ums.server.collector.controller;

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
public class ErrorLogController extends BaseController {

	//private static Logger logger = Logger.getLogger(ErrorLogController.class);

	@ServiceMethod(method = "/ums/errorlog")
	public Object eventLog(AbstractRestRequest request) {
		SuccessResponse response = new SuccessResponse();
		String ip = request.getRestRequestContext().getIp();
		String content = request.getRestRequestContext().getContent();
		messageProducer3.sendText("topic_errorlog", ip, content);
		return response;
	}

}