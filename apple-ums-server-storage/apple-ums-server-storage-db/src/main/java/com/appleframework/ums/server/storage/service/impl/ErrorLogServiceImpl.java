package com.appleframework.ums.server.storage.service.impl;

import java.text.ParseException;
import java.util.Date;

import javax.annotation.Resource;

import org.apache.commons.lang.time.DateUtils;
import org.springframework.stereotype.Service;

import com.appleframework.ums.server.core.entity.ErrorLogEntityWithBLOBs;
import com.appleframework.ums.server.core.model.ErrorLog;
import com.appleframework.ums.server.storage.dao.ErrorLogEntityDao;
import com.appleframework.ums.server.storage.service.ErrorLogService;
import com.appleframework.ums.server.storage.utils.Contants;

@Service("errorLogService")
public class ErrorLogServiceImpl implements ErrorLogService {
		
	@Resource
	private ErrorLogEntityDao errorLogEntityDao;
	
	public void save(ErrorLog errorLog) {
		try {
			
			ErrorLogEntityWithBLOBs record = new ErrorLogEntityWithBLOBs();
			record.setErrorType(Integer.parseInt(errorLog.getError_type()));
			record.setSessionId(errorLog.getSession_id());
			record.setUseridentifier(errorLog.getUseridentifier());
			record.setActivity(errorLog.getActivity());
			record.setAppkey(errorLog.getAppkey());
			record.setDeviceid(errorLog.getDeviceid());
			record.setDevice(errorLog.getDevicename());
			record.setLibVersion(errorLog.getLib_version());
			
			record.setOsVersion(errorLog.getOs_version());
			
			try {
				record.setTime(DateUtils.parseDate(errorLog.getTime(), Contants.pattern));
			} catch (ParseException e) {
				record.setTime(new Date());
			}
			record.setVersion(errorLog.getVersion());
			
			record.setIsfix(0);
			String stackTrace = errorLog.getStacktrace();
			record.setStacktrace(stackTrace);
			String[] stackTraces = stackTrace.split("\n");
			if(stackTraces.length > 0) {
				record.setTitle(stackTraces[0]);
			}
			else {
				record.setTitle(stackTrace);
			}
			errorLogEntityDao.save(record);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}