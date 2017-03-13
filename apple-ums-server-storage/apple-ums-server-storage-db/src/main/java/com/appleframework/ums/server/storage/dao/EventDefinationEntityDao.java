package com.appleframework.ums.server.storage.dao;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.appleframework.ums.server.core.entity.EventDefinationEntity;
import com.appleframework.ums.server.storage.mapper.EventDefinationEntityMapper;
import com.appleframework.ums.server.storage.mapper.EventDefinationExtendMapper;

@Repository("eventDefinationEntityDao")
public class EventDefinationEntityDao {

	@Resource
	private EventDefinationEntityMapper eventDefinationEntityMapper;
	
	@Resource
	private EventDefinationExtendMapper eventDefinationExtendMapper;
 
	public EventDefinationEntity getByProductkeyAndEventIdentifier(String productkey, String eventIdentifier) {
		return eventDefinationExtendMapper.selectByProductkeyAndEventIdentifier(productkey, eventIdentifier);
	}
	
	public void save(EventDefinationEntity record) {
		record.setCreateDate(new Date());
		eventDefinationEntityMapper.insert(record);
	}
}
