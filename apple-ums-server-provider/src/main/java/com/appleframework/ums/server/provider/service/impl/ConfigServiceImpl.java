package com.appleframework.ums.server.provider.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.appleframework.ums.server.core.entity.ConfigEntity;
import com.appleframework.ums.server.core.service.ConfigService;
import com.appleframework.ums.server.provider.dao.ConfigEntityMapper;

@Service("configService")
public class ConfigServiceImpl implements ConfigService {

	@Resource
	private ConfigEntityMapper configEntityMapper;
	
	public ConfigEntity get(Integer id) {
		return configEntityMapper.selectByPrimaryKey(id);
	}
}
