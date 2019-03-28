package com.tedu.cn.demo.controller;

import com.tedu.cn.demo.bo.IfindByPageBo;
import com.tedu.cn.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    IfindByPageBo ifindByPageBo;
    @RequestMapping(value = "/login.do",method = RequestMethod.POST)
    public String showLogin(ModelMap modelMap){
        try {
            List<User> personList = ifindByPageBo.findByPage();
            modelMap.addAttribute("personList",personList);
            return  "index";
        }catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
