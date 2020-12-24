package com.hzxy.labmanage.dao;

import com.hzxy.labmanage.model.UserTeam;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserTeamMapper {
    int deleteByPrimaryKey(@Param("tid") String tid, @Param("uid") String uid);

    int insert(UserTeam record);

    int insertSelective(UserTeam record);
}