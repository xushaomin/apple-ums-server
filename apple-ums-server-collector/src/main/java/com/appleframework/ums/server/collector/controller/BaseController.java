package com.appleframework.ums.server.collector.controller;

import javax.annotation.Resource;

import com.appleframework.jms.core.producer.MessageProducer;
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

	@Resource
	protected MessageProducer messageProducer;
	
}