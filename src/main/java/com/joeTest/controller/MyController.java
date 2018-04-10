package com.joeTest.controller;

import com.joeTest.service.MyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/my")
public class MyController {
    private Logger logger= LoggerFactory.getLogger(MyController.class);
    @Autowired
    private MyService myService;

    @RequestMapping("/hello")
    public String getmode(){
        String mes=myService.getInfo("tome");
        logger.info(mes);
        return "hello";
    }
}
