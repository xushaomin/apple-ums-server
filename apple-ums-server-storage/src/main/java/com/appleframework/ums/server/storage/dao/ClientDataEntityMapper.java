package com.appleframework.ums.server.storage.dao;

import org.springframework.stereotype.Repository;

import com.appleframework.ums.server.core.entity.ClientDataEntity;

@Repository
public interface ClientDataEntityMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insert(ClientDataEntity record);

    int insertSelective(ClientDataEntity record);

    ClientDataEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ClientDataEntity record);

    int updateByPrimaryKey(ClientDataEntity record);
}