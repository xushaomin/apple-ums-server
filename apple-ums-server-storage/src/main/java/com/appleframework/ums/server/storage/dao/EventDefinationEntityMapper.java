package com.appleframework.ums.server.storage.dao;

import org.springframework.stereotype.Repository;

import com.appleframework.ums.server.core.entity.EventDefinationEntity;

@Repository
public interface EventDefinationEntityMapper {
	
    int deleteByPrimaryKey(Integer eventId);

    int insert(EventDefinationEntity record);

    int insertSelective(EventDefinationEntity record);

    EventDefinationEntity selectByPrimaryKey(Integer eventId);

    int updateByPrimaryKeySelective(EventDefinationEntity record);

    int updateByPrimaryKey(EventDefinationEntity record);
}