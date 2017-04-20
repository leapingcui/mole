package com.qijun.basicdata.dictionary.controller;

import com.qijun.basicdata.dictionary.pojo.TBdDictionary;
import com.qijun.basicdata.dictionary.service.DictService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Administrator on 2017/4/19.
 */
@Controller
@RequestMapping("/dictController")
public class DictController {

    private static final Logger LOGGER = Logger.getLogger(DictController.class);

    @Autowired
    private DictService dictService;

    @RequestMapping("/showDict.do")
    public String showDict(Model model) {
        LOGGER.info("哈哈");
        List<TBdDictionary> tBdDictionaries = dictService.selectAll();
        model.addAttribute("tBdDictionaries", tBdDictionaries);
        return "view/basicdata/dictionary/dict";
    }

    @RequestMapping("/insertUI.do")
    public String insertUI() {
        LOGGER.info("嘿嘿");
        return "view/basicdata/dictionary/insertDict";
    }

    @RequestMapping("/insert.do")
    public String insert( TBdDictionary tBdDictionary) throws Exception{
        LOGGER.info("接受到的数据:" + tBdDictionary);
        dictService.insert(tBdDictionary);
        return "redirect:showDict.do";
    }

    @RequestMapping("/updateUI.do")
    public String updateUI(Model model,Long dictionaryId) {
        TBdDictionary tBdDictionary = dictService.selectByPrimaryKey(dictionaryId);
        model.addAttribute("tBdDictionary", tBdDictionary);
        return "view/basicdata/dictionary/updateDict";
    }

    @RequestMapping("/update.do")
    public String update(TBdDictionary tBdDictionary){
        LOGGER.info("接收到的参数对象：" + tBdDictionary);
        dictService.update(tBdDictionary);
        return "redirect:showDict.do";
    }

    @RequestMapping("/delete.do")
    public String delete(Long dictionaryId) {
        LOGGER.info("接收到的id:" + dictionaryId);
        dictService.deleteByPrimaryKey(dictionaryId);
        return "redirect:showDict.do";
    }
}
