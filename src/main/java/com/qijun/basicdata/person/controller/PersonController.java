package com.qijun.basicdata.person.controller;

import com.qijun.basicdata.person.pojo.TBdPerson;
import com.qijun.basicdata.person.pojo.VBdPersonDepartUnit;
import com.qijun.basicdata.person.service.PersonDepartUnitService;
import com.qijun.basicdata.person.service.PersonService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/4/20.
 */
@Controller
@RequestMapping("/personController")
public class PersonController {

    private static final Logger LOGGER = Logger.getLogger(PersonDepartUnitController.class);

    @Autowired
    private PersonService personService;

    @Autowired
    private PersonDepartUnitService personDepartUnitService;

    @RequestMapping("/insertUI.do")
    public String insertUI() {
        return "view/basicdata/person/insertPerson";
    }

    @RequestMapping("/insert.do")
    public String insert(TBdPerson tBdPerson) {
        LOGGER.info("接收到的对象:" + tBdPerson);
        personService.insert(tBdPerson);
        return "redirect:/personDepartUnitController/showPersonDepartUnit.do";
    }

    @RequestMapping("/updateUI.do")
    public String updateUI(Model model,String tPersonId) {
        VBdPersonDepartUnit vBdPersonDepartUnit = personDepartUnitService.selectByPrimaryKey(tPersonId);
        model.addAttribute("vBdPersonDepartUnit", vBdPersonDepartUnit);
        return "view/basicdata/person/updatePerson";
    }

    @RequestMapping("/update.do")
    public String update(TBdPerson tBdPerson) {
        personService.update(tBdPerson);
        return "redirect:/personDepartUnitController/showPersonDepartUnit.do";
    }

    @RequestMapping("/delete.do")
    public String delete(String tPersonId) {
        personService.deleteByPrimaryKey(tPersonId);
        return "redirect:/personDepartUnitController/showPersonDepartUnit.do";
    }

}
