package com.qijun.basicdata.person.service;

import com.qijun.basicdata.person.pojo.TBdPerson;

/**
 * Created by Administrator on 2017/4/20.
 */
public interface PersonService {

    int insert(TBdPerson tBdPerson);

    int update(TBdPerson tBdPerson);

    int deleteByPrimaryKey(String tPersonId);

    int deleteMulti(String[] tPersonIds);
}
