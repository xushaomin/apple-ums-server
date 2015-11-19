package com.appleframework.ums.server.storage.dao;

import org.springframework.stereotype.Repository;

import com.appleframework.ums.server.core.entity.RegionEntity;

@Repository
public interface RegionEntityMapper {
	
    int deleteByPrimaryKey(Long id);

    int insert(RegionEntity record);

    int insertSelective(RegionEntity record);

    RegionEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RegionEntity record);

    int updateByPrimaryKey(RegionEntity record);
}