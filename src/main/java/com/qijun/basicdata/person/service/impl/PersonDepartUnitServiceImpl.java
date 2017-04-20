package com.qijun.basicdata.person.service.impl;

import com.qijun.basicdata.person.mapper.VBdPersonDepartUnitMapper;
import com.qijun.basicdata.person.pojo.VBdPersonDepartUnit;
import com.qijun.basicdata.person.pojo.VBdPersonDepartUnitExample;
import com.qijun.basicdata.person.service.PersonDepartUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2017/4/20.
 */
@Service
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT)
public class PersonDepartUnitServiceImpl implements PersonDepartUnitService {

    @Autowired
    private VBdPersonDepartUnitMapper vBdPersonDepartUnitMapper;

    public List<VBdPersonDepartUnit> selectAll() {
        VBdPersonDepartUnitExample example = new VBdPersonDepartUnitExample();
        List<VBdPersonDepartUnit> vBdPersonDepartUnits = vBdPersonDepartUnitMapper.selectByExample(example);
        return vBdPersonDepartUnits;
    }

    public VBdPersonDepartUnit selectByPrimaryKey(String tPersonId) {
        return vBdPersonDepartUnitMapper.selectByPrimaryKey(tPersonId);
    }
}
