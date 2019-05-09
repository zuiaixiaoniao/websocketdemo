package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName: TestController.java
 * @Description:
 * @author: lihongli
 * @date:  2019-05-09 02:02
 * @version V1.0
 **/
@Controller
public class TestController {


    @ResponseBody
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(){
        return "hellow test";
    }


    @RequestMapping(value = "/testPage",method = RequestMethod.GET)
    public String testPage(){
        return "index";
    }
}
