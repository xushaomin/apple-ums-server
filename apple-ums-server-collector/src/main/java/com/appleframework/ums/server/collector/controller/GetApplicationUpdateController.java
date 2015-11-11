package com.appleframework.ums.server.collector.controller;

import com.appleframework.rest.annotation.ServiceMethod;
import com.appleframework.rest.annotation.ServiceMethodBean;
import com.appleframework.ums.server.collector.request.GetApplicationUpdateRequest;
import com.appleframework.ums.server.collector.response.GetApplicationUpdateResponse;

/**
 * <pre>
 * 功能说明：
 * </pre>
 * 
 * @author 徐少敏
 * @version 1.0
 */
@ServiceMethodBean
public class GetApplicationUpdateController {

	@ServiceMethod(method = "/ums/getApplicationUpdate")
	public Object getApplicationUpdate(GetApplicationUpdateRequest request) {
		GetApplicationUpdateResponse response = new GetApplicationUpdateResponse();
		response.setFlag(-7);
		response.setMsg("no new version");
		System.out.println(request.toString());
		return response;
	}

}