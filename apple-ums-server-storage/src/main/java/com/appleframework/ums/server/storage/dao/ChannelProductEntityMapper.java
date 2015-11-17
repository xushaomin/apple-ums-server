package com.appleframework.ums.server.storage.dao;

import org.springframework.stereotype.Repository;

import com.appleframework.ums.server.core.entity.ChannelProductEntity;

@Repository
public interface ChannelProductEntityMapper {
	
    int deleteByPrimaryKey(Integer cpId);

    int insert(ChannelProductEntity record);

    int insertSelective(ChannelProductEntity record);

    ChannelProductEntity selectByPrimaryKey(Integer cpId);

    int updateByPrimaryKeySelective(ChannelProductEntity record);

    int updateByPrimaryKey(ChannelProductEntity record);
}