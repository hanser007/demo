package com.yyb.Controller;

import com.yyb.Service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StuController {


        @Autowired
        private StuService stuService;

        @RequestMapping("/login")
        public String login(@RequestParam String username,
                            @RequestParam String password) {
            if (stuService.getPS(username, password)) {
                return "您好，欢迎登录";
            } else {
                return "用户名密码错误，请重试";
            }
        }
}

