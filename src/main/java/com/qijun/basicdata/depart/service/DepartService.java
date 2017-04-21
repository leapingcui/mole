package com.qijun.basicdata.depart.service;

import com.qijun.basicdata.depart.pojo.TBdDepart;

import java.util.List;

/**
 * Created by Administrator on 2017/4/21.
 */
public interface DepartService {

    List<TBdDepart> selectAll();

    TBdDepart selectByPrimaryKey(Long departId);

    int insert(TBdDepart tBdDepart);

    int update(TBdDepart tBdDepart);

    int deleteByPrimaryKey(Long departId);

    int deleteMulti(Long[] departIds);

}
