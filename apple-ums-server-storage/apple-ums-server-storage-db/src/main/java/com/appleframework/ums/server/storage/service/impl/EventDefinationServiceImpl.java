package com.appleframework.ums.server.storage.service.impl;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.appleframework.ums.server.core.entity.EventDefinationEntity;
import com.appleframework.ums.server.storage.dao.EventDefinationEntityDao;
import com.appleframework.ums.server.storage.service.EventDefinationService;

@Service("eventDefinationService")
public class EventDefinationServiceImpl implements EventDefinationService {
		
	@Resource
	private EventDefinationEntityDao eventDefinationEntityDao;
	 
	@Override
	public EventDefinationEntity getByProductkeyAndEventIdentifier(String productkey, String eventIdentifier) {
		return eventDefinationEntityDao.getByProductkeyAndEventIdentifier(productkey, eventIdentifier);
	}
	
	@Override
	public EventDefinationEntity gainByProductkeyAndEventIdentifier(String productkey, String eventIdentifier) {
		EventDefinationEntity entity = eventDefinationEntityDao.getByProductkeyAndEventIdentifier(productkey, eventIdentifier);
		if(null == entity) {
			entity = new EventDefinationEntity();
			entity.setActive(0);
			entity.setProductkey(productkey);
			entity.setEventIdentifier(eventIdentifier);
			entity.setEventName(eventIdentifier);
			entity.setChannelId(0);
			entity.setProductId(0);
			entity.setUserId(0);
			eventDefinationEntityDao.save(entity);
		}
		return entity;
	}

}