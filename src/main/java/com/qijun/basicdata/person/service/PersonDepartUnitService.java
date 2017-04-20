package com.qijun.basicdata.person.service;

import com.qijun.basicdata.person.pojo.VBdPersonDepartUnit;

import java.util.List;

/**
 * Created by Administrator on 2017/4/20.
 */
public interface PersonDepartUnitService {

    List<VBdPersonDepartUnit> selectAll();

    VBdPersonDepartUnit selectByPrimaryKey(String tPersonId);

}
