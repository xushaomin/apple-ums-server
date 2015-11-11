package com.appleframework.ums.server.collector.controller;

import com.appleframework.rest.annotation.ServiceMethod;
import com.appleframework.rest.annotation.ServiceMethodBean;
import com.appleframework.rest.response.SuccessResponse;
import com.appleframework.ums.server.collector.request.PostUseridRequest;
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
public class PostUseridController extends BaseController {

	@ServiceMethod(method = "/ums/postUserid")
	public Object postEvent(PostUseridRequest request) {
		SuccessResponse response = new SuccessResponse();
		messageProducer.sendObject(Convert.convert(request));
		return response;
	}

}