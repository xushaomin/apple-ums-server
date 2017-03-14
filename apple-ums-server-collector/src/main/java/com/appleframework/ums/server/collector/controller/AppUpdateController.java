package com.appleframework.ums.server.collector.controller;

import com.appleframework.rest.annotation.ServiceMethod;
import com.appleframework.rest.annotation.ServiceMethodBean;
import com.appleframework.ums.server.collector.request.AppUpdateRequest;
import com.appleframework.ums.server.collector.response.ApplicationUpdate;
import com.appleframework.ums.server.collector.response.ApplicationUpdateResponse;

/**
 * <pre>
 * 功能说明：
 * </pre>
 * 
 * @author 徐少敏
 * @version 1.0
 */
@ServiceMethodBean
public class AppUpdateController extends BaseController {

	//private static Logger logger = Logger.getLogger(UsinglogController.class);

	@ServiceMethod(method = "/ums/appupdate")
	public Object appupdate(AppUpdateRequest request) {
		ApplicationUpdateResponse response = new ApplicationUpdateResponse();
		ApplicationUpdate reply = new ApplicationUpdate();
		reply.setDescription("test");
		reply.setVersionName("2.0.0");
		reply.setFileUrl("222222222222222222");
		reply.setFlag(0);
		response.setReply(reply);
		return response;
	}

}