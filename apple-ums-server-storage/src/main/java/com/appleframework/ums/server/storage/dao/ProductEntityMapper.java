package com.appleframework.ums.server.storage.dao;

import org.springframework.stereotype.Repository;

import com.appleframework.ums.server.core.entity.ProductEntity;

@Repository
public interface ProductEntityMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insert(ProductEntity record);

    int insertSelective(ProductEntity record);

    ProductEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProductEntity record);

    int updateByPrimaryKey(ProductEntity record);
}