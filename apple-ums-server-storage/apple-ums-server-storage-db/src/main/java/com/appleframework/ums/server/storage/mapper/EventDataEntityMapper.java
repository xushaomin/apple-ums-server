package com.appleframework.ums.server.storage.mapper;

import org.springframework.stereotype.Repository;

import com.appleframework.ums.server.core.entity.EventDataEntity;

@Repository
public interface EventDataEntityMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insert(EventDataEntity record);

    int insertSelective(EventDataEntity record);

    EventDataEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EventDataEntity record);

    int updateByPrimaryKey(EventDataEntity record);
}