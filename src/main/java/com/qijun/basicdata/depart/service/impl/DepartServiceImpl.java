package com.qijun.basicdata.depart.service.impl;

import com.qijun.basicdata.depart.mapper.TBdDepartMapper;
import com.qijun.basicdata.depart.pojo.TBdDepart;
import com.qijun.basicdata.depart.pojo.TBdDepartExample;
import com.qijun.basicdata.depart.service.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2017/4/21.
 */
@Service
@Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED)
public class DepartServiceImpl implements DepartService{

    @Autowired
    private TBdDepartMapper tBdDepartMapper;

    public List<TBdDepart> selectAll() {
        TBdDepartExample example = new TBdDepartExample();
        List<TBdDepart> tBdDeparts = tBdDepartMapper.selectByExample(example);
        return tBdDeparts;
    }

    public TBdDepart selectByPrimaryKey(Long departId) {
        return tBdDepartMapper.selectByPrimaryKey(departId);
    }

    public int insert(TBdDepart tBdDepart) {
        return tBdDepartMapper.insert(tBdDepart);
    }

    public int update(TBdDepart tBdDepart) {
        return tBdDepartMapper.updateByPrimaryKey(tBdDepart);
    }

    public int deleteByPrimaryKey(Long departId) {
        return tBdDepartMapper.deleteByPrimaryKey(departId);
    }

    public int deleteMulti(Long[] departIds) {
        return 0;
    }
}
