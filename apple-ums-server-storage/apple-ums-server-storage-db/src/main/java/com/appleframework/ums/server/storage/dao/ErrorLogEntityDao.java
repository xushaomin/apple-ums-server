package com.appleframework.ums.server.storage.dao;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.appleframework.ums.server.core.entity.ErrorLogEntityWithBLOBs;
import com.appleframework.ums.server.storage.mapper.ErrorLogEntityMapper;

@Repository("errorLogEntityDao")
public class ErrorLogEntityDao {

	@Resource
	private ErrorLogEntityMapper errorLogEntityMapper;
		
	public void save(ErrorLogEntityWithBLOBs record) {
		record.setInsertdate(new Date());
		errorLogEntityMapper.insert(record);
	}
}
