package com.tedu.cn.demo.controller;

import com.tedu.cn.demo.domain.Girl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class HelloController {
    @RequestMapping(value = "/hello.do",method = RequestMethod.GET)
    public String say(@RequestParam(value = "age",required = true,defaultValue = "10") Integer age){
        System.out.println("--->>>"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        Girl girls = new Girl();
        girls.setAge(age);
        girls.setName("tt");
        return  "china"+girls.getName()+girls.getAge()+"+++++++++++++++++++++++++++++"+girls.getAge();
    }
}
