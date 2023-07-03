package com.example.demopoject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class indexController {

    @RequestMapping
    @ResponseBody
    public String index() throws Exception {


        System.out.println("Test");
        System.out.println("Holle Word.");
        System.out.println("Test");
        return "测试数据连接:新增总行数 = ";
    }



}
