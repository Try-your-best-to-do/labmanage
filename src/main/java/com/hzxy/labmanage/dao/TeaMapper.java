package com.hzxy.labmanage.dao;

import com.hzxy.labmanage.model.Tea;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TeaMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tea record);

    int insertSelective(Tea record);

    Tea selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tea record);

    int updateByPrimaryKey(Tea record);
}