package com.qs.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author cc
 * @create 2019-09-11 9:03
 */
@Controller
public class UserController {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello,springboot";
    }
}
