package com.appleframework.ums.server.storage.dao;

import org.springframework.stereotype.Repository;

import com.appleframework.ums.server.core.entity.ChannelEntity;

@Repository
public interface ChannelEntityMapper {
	
    int deleteByPrimaryKey(Integer channelId);

    int insert(ChannelEntity record);

    int insertSelective(ChannelEntity record);

    ChannelEntity selectByPrimaryKey(Integer channelId);

    int updateByPrimaryKeySelective(ChannelEntity record);

    int updateByPrimaryKey(ChannelEntity record);
}