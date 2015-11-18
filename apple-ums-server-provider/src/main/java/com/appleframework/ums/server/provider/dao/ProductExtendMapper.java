package com.appleframework.ums.server.provider.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.appleframework.ums.server.core.entity.ProductEntity;

@Repository
public interface ProductExtendMapper {
	
    ProductEntity selectByProductKey(@Param("productKey") String productKey);

}