package com.appleframework.ums.server.storage.dao;

import org.springframework.stereotype.Repository;

import com.appleframework.ums.server.core.entity.NetworkTypeEntity;

@Repository
public interface NetworkTypeEntityMapper {
	
    int insert(NetworkTypeEntity record);

    int insertSelective(NetworkTypeEntity record);
}