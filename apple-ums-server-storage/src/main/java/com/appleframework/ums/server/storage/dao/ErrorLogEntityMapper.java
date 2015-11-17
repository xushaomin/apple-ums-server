package com.appleframework.ums.server.storage.dao;

import org.springframework.stereotype.Repository;

import com.appleframework.ums.server.core.entity.ErrorLogEntity;
import com.appleframework.ums.server.core.entity.ErrorLogEntityWithBLOBs;

@Repository
public interface ErrorLogEntityMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insert(ErrorLogEntityWithBLOBs record);

    int insertSelective(ErrorLogEntityWithBLOBs record);

    ErrorLogEntityWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ErrorLogEntityWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ErrorLogEntityWithBLOBs record);

    int updateByPrimaryKey(ErrorLogEntity record);
}