/*package com.appleframework.ums.server.storage.service.impl;

import java.util.Date;

import javax.annotation.Resource;

import org.apache.commons.lang.time.DateUtils;
import org.springframework.stereotype.Service;

import com.appleframework.ums.server.core.entity.ClientUsingLogEntity;
import com.appleframework.ums.server.core.model.ActivityLog;
import com.appleframework.ums.server.storage.mapper.ClientUsingLogEntityMapper;
import com.appleframework.ums.server.storage.service.ClientUsingLogService;
import com.appleframework.ums.server.storage.utils.Contants;

@Service("clientUsingLogService")
public class ClientUsingLogServiceImpl implements ClientUsingLogService {
		
	@Resource
	private ClientUsingLogEntityMapper clientUsingLogEntityMapper;
	
	private void save(ClientUsingLogEntity record) {
		record.setInsertdate(new Date());
		clientUsingLogEntityMapper.insert(record);
	}
	
	public void save(ActivityLog activityLog) {
		try {
			ClientUsingLogEntity record = new ClientUsingLogEntity();
			record.setActivities(activityLog.getActivities());
			record.setAppkey(activityLog.getAppKey());
			record.setDuration(Integer.parseInt(activityLog.getDuration()));
			record.setSessionId(activityLog.getSessionId());
			record.setStartMillis(DateUtils.parseDate(activityLog.getStartMillis(), Contants.pattern));
			record.setEndMillis(DateUtils.parseDate(activityLog.getEndMillis(), Contants.pattern));		
			record.setVersion(activityLog.getVersion());
			this.save(record);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
*/