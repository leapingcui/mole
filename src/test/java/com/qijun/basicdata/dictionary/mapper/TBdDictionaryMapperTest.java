package com.qijun.basicdata.dictionary.mapper;

import com.qijun.basicdata.dictionary.BaseTest;
import com.qijun.basicdata.dictionary.pojo.TBdDictionary;
import com.qijun.basicdata.dictionary.pojo.TBdDictionaryExample;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Administrator on 2017/4/19.
 */
public class TBdDictionaryMapperTest extends BaseTest {


    @Autowired
    private TBdDictionaryMapper tBdDictionaryMapper;

    @Test
    public void testSelectByExample() {


        TBdDictionaryExample example = new TBdDictionaryExample();
        List<TBdDictionary> tBdDictionaries = tBdDictionaryMapper.selectByExample(example);
        for (TBdDictionary tBdDictionary : tBdDictionaries ) {
            System.out.println(tBdDictionary);
        }

    }

}
