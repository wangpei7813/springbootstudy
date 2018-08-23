package com.springboot.study.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: wp
 * @Date: 2018/5/5 15:07
 * @Description:
 */
@RestController
public class HelloController {
    
    @RequestMapping("/hello")
    public String index() {

        return "Hello world123";
    }
}
