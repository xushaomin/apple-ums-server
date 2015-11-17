package com.appleframework.ums.server.storage.dao;

import org.springframework.stereotype.Repository;

import com.appleframework.ums.server.core.entity.DeviceTagEntity;

@Repository
public interface DeviceTagEntityMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insert(DeviceTagEntity record);

    int insertSelective(DeviceTagEntity record);

    DeviceTagEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DeviceTagEntity record);

    int updateByPrimaryKey(DeviceTagEntity record);
}