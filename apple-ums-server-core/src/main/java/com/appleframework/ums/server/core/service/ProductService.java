package com.appleframework.ums.server.core.service;

import com.appleframework.ums.server.core.entity.ProductEntity;

public interface ProductService {

	public ProductEntity getByProductKey(String productKey);
	
}
