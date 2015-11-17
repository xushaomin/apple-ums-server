package com.appleframework.ums.server.storage.service.impl;

import java.text.ParseException;
import java.util.Date;

import javax.annotation.Resource;

import org.apache.commons.lang.time.DateUtils;
import org.springframework.stereotype.Service;

import com.appleframework.ums.server.core.entity.EventDataEntity;
import com.appleframework.ums.server.core.entity.EventDefinationEntity;
import com.appleframework.ums.server.core.model.EventLog;
import com.appleframework.ums.server.storage.dao.EventDataEntityMapper;
import com.appleframework.ums.server.storage.service.EventDataService;
import com.appleframework.ums.server.storage.service.EventDefinationService;
import com.appleframework.ums.server.storage.utils.Contants;

@Service("eventDataService")
public class EventDataServiceImpl implements EventDataService {
	
	@Resource
	private EventDataEntityMapper eventDataEntityMapper;
	
	@Resource
	private EventDefinationService eventDefinationService;
	
	private void save(EventDataEntity record) {
		record.setInsertdate(new Date());
		eventDataEntityMapper.insert(record);
	}
	
	public void save(EventLog eventLog) {
		try {
			EventDefinationEntity eventDefination 
				= eventDefinationService.getByProductkeyAndEventIdentifier(eventLog.getAppKey(), eventLog.getEventIdentifier());
			
			if(null == eventDefination)
				return;
			EventDataEntity record = new EventDataEntity();
			record.setAttachment(eventLog.getAttachment());
			
			try {
				record.setClientdate(DateUtils.parseDate(eventLog.getTime(), Contants.pattern));
			} catch (ParseException e) {
				record.setClientdate(new Date());
			}
			record.setDeviceid(eventLog.getDeviceId());
			record.setEvent(eventLog.getActivity());
			record.setEventId(eventDefination.getEventId());
			
			record.setNum(eventLog.getAcc());
			record.setProductkey(eventLog.getAppKey());
			record.setVersion(eventLog.getVersion());
			
			record.setCategory(null);
			
			record.setLabel(null);
			this.save(record);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
