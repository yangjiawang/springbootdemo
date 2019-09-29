package com.yangjiawang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YANGJIAWANG
 * @DATE 2019/9/25
 * @TIME 10:35
 **/
@RestController
@ResponseBody
public class DemoController {
    @RequestMapping("/demo")
    public String quick(){
        System.out.println("请求成功");
        return "hello springboot";
    }

}
