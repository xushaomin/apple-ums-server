package com.appleframework.ums.server.storage.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.appleframework.ums.server.core.entity.RegionEntity;

@Repository
public interface RegionExtendMapper {
	
	public List<RegionEntity> selectByLevelType(Short levelType);

	public List<RegionEntity> selectByParentId(Long parentId);

	public List<RegionEntity> selectByShortName(String shortName);
}