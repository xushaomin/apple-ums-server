package com.appleframework.ums.server.collector.controller;

import java.util.List;

import org.apache.log4j.Logger;

import com.appleframework.rest.annotation.ServiceMethod;
import com.appleframework.rest.annotation.ServiceMethodBean;
import com.appleframework.rest.response.SuccessResponse;
import com.appleframework.ums.server.collector.model.ClientDataVo;
import com.appleframework.ums.server.collector.model.ErrorInfoVo;
import com.appleframework.ums.server.collector.request.UploadLogRequest;
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
public class UploadLogController extends BaseController {

	private static Logger logger = Logger.getLogger(UploadLogController.class);

	@ServiceMethod(method = "/ums/uploadLog")
	public Object postEvent(UploadLogRequest request) {
		SuccessResponse response = new SuccessResponse();
		logger.info(request);
		List<ErrorInfoVo> errorInfoList = request.getErrorInfo();
		List<ClientDataVo> clientDataList = request.getClientData();
		if(null != errorInfoList) {
			for (ErrorInfoVo errorInfo : errorInfoList) {
				messageProducer.sendObject(Convert.convert(errorInfo));
				
			}
		}
		if(null != clientDataList) {
			for (ClientDataVo clientDataVo : clientDataList) {
				messageProducer.sendObject(Convert.convert(clientDataVo));
			}
		}
		return response;
	}

}