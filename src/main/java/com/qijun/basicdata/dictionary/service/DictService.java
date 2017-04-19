package com.qijun.basicdata.dictionary.service;

import com.qijun.basicdata.dictionary.pojo.TBdDictionary;

import java.util.List;

/**
 * Created by Administrator on 2017/4/19.
 */
public interface DictService {

    List<TBdDictionary> selectAll();

    TBdDictionary selectByPrimaryKey(Long dictionaryId);

    int insert(TBdDictionary tBdDictionary);

    int update(TBdDictionary tBdDictionary);

    int deleteByPrimaryKey(Long dictionaryId);

    int deleteMulti(Long[] dictionaryIds);
}
