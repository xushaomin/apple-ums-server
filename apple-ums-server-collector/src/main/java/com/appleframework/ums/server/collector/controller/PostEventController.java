package com.appleframework.ums.server.collector.controller;

import com.appleframework.rest.annotation.ServiceMethod;
import com.appleframework.rest.annotation.ServiceMethodBean;
import com.appleframework.rest.response.SuccessResponse;
import com.appleframework.ums.server.collector.request.PostEventRequest;
import com.appleframework.ums.server.collector.utils.Convert;


/**
 * <pre>
 * 功能说明：
 * </pre>
 * 
 * @author 徐少敏
 * @version 1.0
 */
@ServiceMethodBean
public class PostEventController extends BaseController {

	@ServiceMethod(method = "/ums/postEvent")
	public Object postEvent(PostEventRequest request) {
		SuccessResponse response = new SuccessResponse();
		messageProducer.sendObject(Convert.convert(request));
		return response;
	}

}