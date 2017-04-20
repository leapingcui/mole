package com.qijun.basicdata.person.mapper;

import com.qijun.basicdata.person.pojo.TBdPerson;
import com.qijun.basicdata.person.pojo.TBdPersonExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TBdPersonMapper {
    int countByExample(TBdPersonExample example);

    int deleteByExample(TBdPersonExample example);

    int deleteByPrimaryKey(String tPersonId);

    int insert(TBdPerson record);

    int insertSelective(TBdPerson record);

    List<TBdPerson> selectByExample(TBdPersonExample example);

    TBdPerson selectByPrimaryKey(String tPersonId);

    int updateByExampleSelective(@Param("record") TBdPerson record, @Param("example") TBdPersonExample example);

    int updateByExample(@Param("record") TBdPerson record, @Param("example") TBdPersonExample example);

    int updateByPrimaryKeySelective(TBdPerson record);

    int updateByPrimaryKey(TBdPerson record);
}