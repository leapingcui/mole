package com.qijun.basicdata.person.controller;

import com.qijun.basicdata.person.pojo.VBdPersonDepartUnit;
import com.qijun.basicdata.person.service.PersonDepartUnitService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Administrator on 2017/4/20.
 */
@Controller
@RequestMapping("/personDepartUnitController")
public class PersonDepartUnitController {

    private static final Logger LOGGER = Logger.getLogger(PersonDepartUnitController.class);

    @Autowired
    private PersonDepartUnitService personDepartUnitService;

    @RequestMapping("/showPersonDepartUnit.do")
    public String showPersonDepartUnit(Model model) {
        List<VBdPersonDepartUnit> vBdPersonDepartUnits = personDepartUnitService.selectAll();
        model.addAttribute("vBdPersonDepartUnits", vBdPersonDepartUnits);
        return "view/basicdata/person/person";
    }

    @RequestMapping("/loadPersonDepartUnit.do")
    public String loadPersonDepartUnit(Model model,String tPersonId) {
        VBdPersonDepartUnit vBdPersonDepartUnit = personDepartUnitService.selectByPrimaryKey(tPersonId);
        model.addAttribute("vBdPersonDepartUnit", vBdPersonDepartUnit);
        return "view/basicdata/person/detailPerson";
    }


}
