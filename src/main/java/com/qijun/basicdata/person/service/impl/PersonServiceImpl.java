package com.qijun.basicdata.person.service.impl;

import com.qijun.basicdata.person.mapper.TBdPersonMapper;
import com.qijun.basicdata.person.pojo.TBdPerson;
import com.qijun.basicdata.person.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2017/4/20.
 */
@Service
@Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED)
public class PersonServiceImpl implements PersonService {

    @Autowired
    private TBdPersonMapper tBdPersonMapper;

    public int insert(TBdPerson tBdPerson) {
        return tBdPersonMapper.insert(tBdPerson);
    }

    public int update(TBdPerson tBdPerson) {
        return tBdPersonMapper.updateByPrimaryKey(tBdPerson);
    }

    public int deleteByPrimaryKey(String tPersonId) {
        return tBdPersonMapper.deleteByPrimaryKey(tPersonId);
    }

    public int deleteMulti(String[] tPersonIds) {
        return 0;
    }
}
