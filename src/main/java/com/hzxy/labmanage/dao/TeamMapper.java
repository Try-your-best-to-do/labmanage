package com.hzxy.labmanage.dao;

import com.hzxy.labmanage.model.Team;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TeamMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Team record);

    int insertSelective(Team record);

    Team selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Team record);

    int updateByPrimaryKey(Team record);
}