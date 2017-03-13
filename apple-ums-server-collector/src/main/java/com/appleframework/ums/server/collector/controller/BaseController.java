package com.appleframework.ums.server.collector.controller;

import javax.annotation.Resource;

import com.appleframework.jms.core.producer.MessageProducer3;
import com.appleframework.rest.annotation.ServiceMethodBean;

/**
 * <pre>
 * 功能说明：
 * </pre>
 * 
 * @author 徐少敏
 * @version 1.0
 */
@ServiceMethodBean
public class BaseController {

	/*@Resource
	protected MessageProducer2 messageProducer2;*/
	
	@Resource
	protected MessageProducer3 messageProducer3;
	
}