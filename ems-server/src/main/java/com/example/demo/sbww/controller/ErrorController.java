package com.example.demo.sbww.controller;

import com.example.demo.sbww.Service.ErrorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * author:赵赫
 */
@Controller
public class ErrorController {
    @Autowired
    private ErrorService errorService;
    @GetMapping(value = "InsertErr")
    @CrossOrigin(origins = {"http://localhost:8080","null"})
    @RequestMapping(value = "/InsertErr",method = RequestMethod.POST)
    @ResponseBody
    public boolean InsertErr(@RequestParam(value ="err_code",required = false) String code,
                             @RequestParam(value ="err_info",required = false) String info){
        System.out.println(code);

        if(code==null||info==null){//判断是否传入两个值
            System.out.println("出错了");
            return false;
        }else {
            return errorService.InsertErr(code,info);
        }
    }
    @GetMapping(value = "DeleteErr")
    @CrossOrigin(origins = {"http://localhost:8080","null"})
    @RequestMapping(value = "/DeleteErr",method = RequestMethod.POST)
    @ResponseBody
    public boolean DeleteErr(@RequestParam(value ="err_code",required = false) String code){
        System.out.println(code);

        if(code==null){//判断是否传入code值
            System.out.println("出错了");
            return false;
        }else {
            return errorService.DeleteErr(code);
        }
    }
    @GetMapping(value = "ShowErr")
    @CrossOrigin(origins = {"http://localhost:8080","null"})
    @RequestMapping(value = "/ShowErr",method = RequestMethod.GET)
    @ResponseBody
    public List<Error> ShowErr(){
            return errorService.ShowErr();
    }
}
