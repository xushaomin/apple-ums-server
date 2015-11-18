package com.appleframework.ums.server.provider.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.appleframework.ums.server.core.entity.ProductEntity;
import com.appleframework.ums.server.core.service.ProductService;
import com.appleframework.ums.server.provider.dao.ProductEntityMapper;
import com.appleframework.ums.server.provider.dao.ProductExtendMapper;

@Service("productService")
public class ProductServiceImpl implements ProductService {
	
	@Resource
	private ProductEntityMapper productEntityMapper;
	
	@Resource
	private ProductExtendMapper productExtendMapper;

	public ProductEntity getByProductKey(String productKey) {
		return productExtendMapper.selectByProductKey(productKey);
	}
}
