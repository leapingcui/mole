package com.qijun.basicdata.depart.mapper;

import com.qijun.basicdata.depart.pojo.TBdDepart;
import com.qijun.basicdata.depart.pojo.TBdDepartExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TBdDepartMapper {
    int countByExample(TBdDepartExample example);

    int deleteByExample(TBdDepartExample example);

    int deleteByPrimaryKey(Long departId);

    int insert(TBdDepart record);

    int insertSelective(TBdDepart record);

    List<TBdDepart> selectByExample(TBdDepartExample example);

    TBdDepart selectByPrimaryKey(Long departId);

    int updateByExampleSelective(@Param("record") TBdDepart record, @Param("example") TBdDepartExample example);

    int updateByExample(@Param("record") TBdDepart record, @Param("example") TBdDepartExample example);

    int updateByPrimaryKeySelective(TBdDepart record);

    int updateByPrimaryKey(TBdDepart record);
}