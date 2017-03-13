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
public class UsinglogController extends BaseController {

	//private static Logger logger = Logger.getLogger(UsinglogController.class);

	@ServiceMethod(method = "/ums/usinglog")
	public Object usingLog(AbstractRestRequest request) {
		SuccessResponse response = new SuccessResponse();
		String ip = request.getRestRequestContext().getIp();
		String content = request.getRestRequestContext().getContent();

		messageProducer3.sendText("topic_usinglog", ip, content);
		return response;
	}

}