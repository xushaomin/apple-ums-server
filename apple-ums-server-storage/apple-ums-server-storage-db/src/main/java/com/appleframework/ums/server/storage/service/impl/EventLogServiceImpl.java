package com.appleframework.ums.server.storage.service.impl;

import java.text.ParseException;
import java.util.Date;

import javax.annotation.Resource;

import org.apache.commons.lang.time.DateUtils;
import org.springframework.stereotype.Service;

import com.appleframework.ums.server.core.entity.EventDataEntity;
import com.appleframework.ums.server.core.entity.EventDefinationEntity;
import com.appleframework.ums.server.core.model.EventLog;
import com.appleframework.ums.server.storage.dao.EventDataEntityDao;
import com.appleframework.ums.server.storage.service.EventDefinationService;
import com.appleframework.ums.server.storage.service.EventLogService;
import com.appleframework.ums.server.storage.utils.Contants;

@Service("eventLogService")
public class EventLogServiceImpl implements EventLogService {
	
	@Resource
	private EventDataEntityDao eventDataEntityDao;
	
	@Resource
	private EventDefinationService eventDefinationService;
		
	
	public void save(EventLog eventLog) {
		try {
			EventDefinationEntity eventDefination 
				= eventDefinationService.gainByProductkeyAndEventIdentifier(eventLog.getAppkey(), eventLog.getEvent_identifier());
			
			
			EventDataEntity record = new EventDataEntity();
			record.setAttachment(eventLog.getAttachment());
			record.setCategory(null);
			try {
				record.setClientdate(DateUtils.parseDate(eventLog.getTime(), Contants.pattern));
			} catch (ParseException e) {
				record.setClientdate(new Date());
			}
			record.setDeviceid(eventLog.getDeviceid());
			record.setEvent(eventLog.getEvent_identifier());
			record.setUseridentifier(eventLog.getUseridentifier());
			record.setLibVersion(eventLog.getLib_version());
			record.setEventId(eventDefination.getEventId());
			record.setSessionId(eventLog.getSession_id());
			//record.setLabel(eventLog.getActivity());
			
			record.setNum(Integer.parseInt(eventLog.getAcc()));
			record.setProductkey(eventLog.getAppkey());
			record.setVersion(eventLog.getVersion());
			
			record.setLabel(eventLog.getLabel());
			
			eventDataEntityDao.save(record);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}