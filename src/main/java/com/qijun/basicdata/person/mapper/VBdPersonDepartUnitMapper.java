package com.qijun.basicdata.person.mapper;

import com.qijun.basicdata.person.pojo.VBdPersonDepartUnit;
import com.qijun.basicdata.person.pojo.VBdPersonDepartUnitExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VBdPersonDepartUnitMapper {
    int countByExample(VBdPersonDepartUnitExample example);

    int deleteByExample(VBdPersonDepartUnitExample example);

    int insert(VBdPersonDepartUnit record);

    int insertSelective(VBdPersonDepartUnit record);

    List<VBdPersonDepartUnit> selectByExample(VBdPersonDepartUnitExample example);

    VBdPersonDepartUnit selectByPrimaryKey(String tPersonId);

    int updateByExampleSelective(@Param("record") VBdPersonDepartUnit record, @Param("example") VBdPersonDepartUnitExample example);

    int updateByExample(@Param("record") VBdPersonDepartUnit record, @Param("example") VBdPersonDepartUnitExample example);
}