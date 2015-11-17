package com.appleframework.ums.server.storage.service.impl;

import java.text.ParseException;
import java.util.Date;

import javax.annotation.Resource;

import org.apache.commons.lang.time.DateUtils;
import org.springframework.stereotype.Service;

import com.appleframework.ums.server.core.entity.ErrorLogEntityWithBLOBs;
import com.appleframework.ums.server.core.model.ErrorInfo;
import com.appleframework.ums.server.storage.dao.ErrorLogEntityMapper;
import com.appleframework.ums.server.storage.service.ErrorLogService;
import com.appleframework.ums.server.storage.utils.Contants;

@Service("errorLogService")
public class ErrorLogServiceImpl implements ErrorLogService {
		
	@Resource
	private ErrorLogEntityMapper errorLogEntityMapper;
	
	private void save(ErrorLogEntityWithBLOBs record) {
		record.setInsertdate(new Date());
		errorLogEntityMapper.insert(record);
	}
	
	public void save(ErrorInfo errorInfo) {
		try {
			ErrorLogEntityWithBLOBs record = new ErrorLogEntityWithBLOBs();
			record.setActivity(errorInfo.getActivity());
			record.setAppkey(errorInfo.getAppKey());
			record.setDevice(errorInfo.getDeviceId());
			
			record.setOsVersion(errorInfo.getOsVersion());
			
			try {
				record.setTime(DateUtils.parseDate(errorInfo.getTime(), Contants.pattern));
			} catch (ParseException e) {
				record.setTime(new Date());
			}
			record.setVersion(errorInfo.getVersion());
			
			record.setIsfix(0);
			String stackTrace = errorInfo.getStackTrace();
			record.setStacktrace(stackTrace);
			String[] stackTraces = stackTrace.split("\n");
			if(stackTraces.length > 0) {
				record.setTitle(stackTraces[0]);
			}
			else {
				record.setTitle(stackTrace);
			}
			this.save(record);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
