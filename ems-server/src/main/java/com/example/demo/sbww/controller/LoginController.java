package com.example.demo.sbww.controller;

import com.example.demo.sbww.Service.EmpService;
import com.example.demo.sbww.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {
    @Autowired
    private UserService userService;
    @Autowired
    private EmpService empService;
    @GetMapping(value = "loginUser")
    @CrossOrigin(origins = {"http://localhost:8080","null"})
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    private Boolean LoginUser(@RequestParam(value ="username",required = false) String user,
                          @RequestParam(value ="password",required = false) String password){
        return userService.LoginUser(user,password);
    }
    @GetMapping(value = "loginEmp")
    @CrossOrigin(origins = {"http://localhost:8080","null"})
    @RequestMapping(value = "/loginEmp",method = RequestMethod.POST)
    @ResponseBody
    private Boolean loginEmp(@RequestParam(value ="username",required = false) String user,
                              @RequestParam(value ="password",required = false) String password){
        return empService.LoginEmp(user,password);
    }
}
