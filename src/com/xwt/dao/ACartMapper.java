package com.qfedu.dao;

import com.qfedu.entity.ACart;

public interface ACartMapper {
    int deleteByPrimaryKey(Integer cId);

    int insert(ACart record);

    int insertSelective(ACart record);

    ACart selectByPrimaryKey(Integer cId);

    int updateByPrimaryKeySelective(ACart record);

    int updateByPrimaryKey(ACart record);
}