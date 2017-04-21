package com.qijun.basicdata.depart.controller;

import com.qijun.basicdata.depart.pojo.TBdDepart;
import com.qijun.basicdata.depart.service.DepartService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Administrator on 2017/4/21.
 */
@Controller
@RequestMapping("/departController")
public class DepartController {

    private static final Logger LOGGER = Logger.getLogger(DepartController.class);

    @Autowired
    private DepartService departService;

    @RequestMapping("/showDeparts.do")
    public String showDeparts(Model model) {
        List<TBdDepart> tBdDeparts = departService.selectAll();
        model.addAttribute("tBdDeparts", tBdDeparts);
        return "view/basicdata/depart/depart";
    }

    @RequestMapping("/loadDepart.do")
    public String loadDepart(Model model,Long departId) {
        LOGGER.info("到这");
        TBdDepart tBdDepart = departService.selectByPrimaryKey(departId);
        model.addAttribute("tBdDepart", tBdDepart);
        return "view/basicdata/depart/detailDepart";
    }

    @RequestMapping("/insertUI.do")
    public String insertUI() {
        return "view/basicdata/depart/insertDepart";
    }

    @RequestMapping("/insert.do")
    public String insert(TBdDepart tBdDepart) {
        departService.insert(tBdDepart);
        return "redirect:showDeparts.do";
    }

    @RequestMapping("/updateUI.do")
    public String updateUI(Model model,Long departId) {
        TBdDepart tBdDepart = departService.selectByPrimaryKey(departId);
        model.addAttribute("tBdDepart", tBdDepart);
        return "view/basicdata/depart/updateDepart";
    }

    @RequestMapping("/update.do")
    public String update(TBdDepart tBdDepart) {
        departService.update(tBdDepart);
        return "redirect:showDeparts.do";
    }

    @RequestMapping("/delete.do")
    public String delete(Long departId) {
        departService.deleteByPrimaryKey(departId);
        return "redirect:showDeparts.do";
    }


}
