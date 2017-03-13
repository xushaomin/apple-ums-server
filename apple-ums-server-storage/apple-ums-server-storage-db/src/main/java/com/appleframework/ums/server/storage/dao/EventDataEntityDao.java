package com.appleframework.ums.server.storage.dao;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.appleframework.ums.server.core.entity.EventDataEntity;
import com.appleframework.ums.server.storage.mapper.EventDataEntityMapper;

@Repository("eventDataEntityDao")
public class EventDataEntityDao {

	@Resource
	private EventDataEntityMapper eventDataEntityMapper;
		
	public void save(EventDataEntity record) {
		record.setInsertdate(new Date());
		eventDataEntityMapper.insert(record);
	}
}
