package com.example.demo.sbww;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class sbww {
    @RequestMapping(value = "/quick",method = RequestMethod.GET)
    @ResponseBody
    public String quick() {
        return "hello world";
    }
}
