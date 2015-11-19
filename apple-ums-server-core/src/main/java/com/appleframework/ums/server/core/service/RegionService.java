package com.appleframework.ums.server.core.service;

import java.util.List;

import com.appleframework.ums.server.core.entity.RegionEntity;

public interface RegionService {

	public RegionEntity get(Long id);
	
	public List<RegionEntity> findByLevelType(Short levelType);
	
	public List<RegionEntity> findByParentId(Long parentId);
		
	public void update(RegionEntity record);
	
	public List<RegionEntity> findByShortName(String shortName);

}
