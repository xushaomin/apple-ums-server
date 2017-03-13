package com.appleframework.ums.server.storage.service;

import com.appleframework.ums.server.core.entity.EventDefinationEntity;

public interface EventDefinationService {

	public EventDefinationEntity getByProductkeyAndEventIdentifier(String productkey, String eventIdentifier);
	
	public EventDefinationEntity gainByProductkeyAndEventIdentifier(String productkey, String eventIdentifier);

}
