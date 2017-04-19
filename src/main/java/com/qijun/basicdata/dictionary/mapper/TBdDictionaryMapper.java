package com.qijun.basicdata.dictionary.mapper;

import com.qijun.basicdata.dictionary.pojo.TBdDictionary;
import com.qijun.basicdata.dictionary.pojo.TBdDictionaryExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface TBdDictionaryMapper {
    int countByExample(TBdDictionaryExample example);

    int deleteByExample(TBdDictionaryExample example);

    int deleteByPrimaryKey(Long dictionaryId);

    int insert(TBdDictionary record);

    int insertSelective(TBdDictionary record);

    List<TBdDictionary> selectByExample(TBdDictionaryExample example);

    TBdDictionary selectByPrimaryKey(Long dictionaryId);

    int updateByExampleSelective(@Param("record") TBdDictionary record, @Param("example") TBdDictionaryExample example);

    int updateByExample(@Param("record") TBdDictionary record, @Param("example") TBdDictionaryExample example);

    int updateByPrimaryKeySelective(TBdDictionary record);

    int updateByPrimaryKey(TBdDictionary record);
}