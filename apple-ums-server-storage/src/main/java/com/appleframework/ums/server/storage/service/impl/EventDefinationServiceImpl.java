package com.appleframework.ums.server.storage.service.impl;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.appleframework.ums.server.core.entity.EventDefinationEntity;
import com.appleframework.ums.server.storage.dao.EventDefinationEntityMapper;
import com.appleframework.ums.server.storage.dao.EventDefinationExtendMapper;
import com.appleframework.ums.server.storage.service.EventDefinationService;

@Service("eventDefinationService")
public class EventDefinationServiceImpl implements EventDefinationService {
		
	@Resource
	private EventDefinationEntityMapper eventDefinationEntityMapper;
	
	@Resource
	private EventDefinationExtendMapper eventDefinationExtendMapper;
 
	@Override
	public EventDefinationEntity getByProductkeyAndEventIdentifier(String productkey, String eventIdentifier) {
		return eventDefinationExtendMapper.selectByProductkeyAndEventIdentifier(productkey, eventIdentifier);
	}
	


}
