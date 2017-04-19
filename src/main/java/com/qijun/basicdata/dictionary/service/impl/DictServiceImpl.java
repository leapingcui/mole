package com.qijun.basicdata.dictionary.service.impl;

import com.qijun.basicdata.dictionary.mapper.TBdDictionaryMapper;
import com.qijun.basicdata.dictionary.pojo.TBdDictionary;
import com.qijun.basicdata.dictionary.pojo.TBdDictionaryExample;
import com.qijun.basicdata.dictionary.service.DictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2017/4/19.
 */
@Service
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT)
public class DictServiceImpl implements DictService {


    @Autowired
    private TBdDictionaryMapper tBdDictionaryMapper;

    public List<TBdDictionary> selectAll() {

        TBdDictionaryExample example = new TBdDictionaryExample();
//        example.setOrderByClause("dictionary_detail_cata,dictionary_order");
        List<TBdDictionary> tBdDictionaries = tBdDictionaryMapper.selectByExample(example);
        return tBdDictionaries;
    }

    public TBdDictionary selectByPrimaryKey(Long dictionaryId) {
        return null;
    }

    public int insert(TBdDictionary tBdDictionary) {
        return 0;
    }

    public int update(TBdDictionary tBdDictionary) {
        return 0;
    }

    public int deleteByPrimaryKey(Long dictionaryId) {
        return 0;
    }

    public int deleteMulti(Long[] dictionaryIds) {
        return 0;
    }
}
