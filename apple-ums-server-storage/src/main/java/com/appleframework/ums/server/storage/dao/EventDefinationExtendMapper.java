package com.appleframework.ums.server.storage.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.appleframework.ums.server.core.entity.EventDefinationEntity;

@Repository
public interface EventDefinationExtendMapper {
	
    EventDefinationEntity selectByProductkeyAndEventIdentifier(@Param("productkey")String productkey, 
			@Param("eventIdentifier")String eventIdentifier);

}