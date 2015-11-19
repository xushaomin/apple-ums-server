package com.appleframework.ums.server.storage.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.appleframework.ums.server.core.entity.RegionEntity;
import com.appleframework.ums.server.core.service.RegionService;
import com.appleframework.ums.server.storage.dao.RegionEntityMapper;
import com.appleframework.ums.server.storage.dao.RegionExtendMapper;

@Service("regionService")
public class RegionServiceImpl implements RegionService {
	
	@Resource
	private RegionEntityMapper regionEntityMapper;
	
	@Resource
	private RegionExtendMapper regionExtendMapper;

	@Override
	public RegionEntity get(Long id) {
		return regionEntityMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<RegionEntity> findByLevelType(Short levelType) {
		return regionExtendMapper.selectByLevelType(levelType);
	}

	@Override
	public List<RegionEntity> findByParentId(Long parentId) {
		return regionExtendMapper.selectByParentId(parentId);
	}

	@Override
	public void update(RegionEntity record) {
		regionEntityMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<RegionEntity> findByShortName(String shortName) {
		return regionExtendMapper.selectByShortName(shortName);
	}

}
