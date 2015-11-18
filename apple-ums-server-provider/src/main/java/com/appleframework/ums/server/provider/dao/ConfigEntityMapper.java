package com.appleframework.ums.server.provider.dao;

import org.springframework.stereotype.Repository;

import com.appleframework.ums.server.core.entity.ConfigEntity;

@Repository
public interface ConfigEntityMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insert(ConfigEntity record);

    int insertSelective(ConfigEntity record);

    ConfigEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ConfigEntity record);

    int updateByPrimaryKey(ConfigEntity record);
}