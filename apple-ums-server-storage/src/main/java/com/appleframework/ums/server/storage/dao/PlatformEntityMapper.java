package com.appleframework.ums.server.storage.dao;

import org.springframework.stereotype.Repository;

import com.appleframework.ums.server.core.entity.PlatformEntity;

@Repository
public interface PlatformEntityMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insert(PlatformEntity record);

    int insertSelective(PlatformEntity record);

    PlatformEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PlatformEntity record);

    int updateByPrimaryKey(PlatformEntity record);
}