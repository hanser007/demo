package com.hanser.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test1 {
    @Value("${xuexiao}")
    private String xuexiao;


    @RequestMapping("/getyd")
    @ResponseBody
    public String yd(){
        return "你好世界！"+xuexiao;
    }
}
