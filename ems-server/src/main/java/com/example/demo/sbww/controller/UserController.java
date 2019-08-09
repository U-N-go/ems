package com.example.demo.sbww.controller;

import com.example.demo.sbww.Service.UserService;
import com.example.demo.sbww.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * author：赵赫
 * 查询用户的信息，注册用户
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    //显示
    @GetMapping(value = "ShowUser")
    @CrossOrigin(origins = {"http://localhost:8080","null"})
    @RequestMapping(value = "/ShowUser",method = RequestMethod.POST)
    @ResponseBody
    public List<User> ShowUser(@RequestParam(value ="val",required = false) int val){
        return userService.ShowUser(val);
    }
    //添加管理员
    @GetMapping(value = "zhuce")
    @CrossOrigin(origins = {"http://localhost:8080","null"})
    @RequestMapping(value = "/zhuce",method = RequestMethod.POST)
    @ResponseBody
    public boolean InsertUser(@RequestParam(value ="username",required = false) String user,
                              @RequestParam(value ="password",required = false) String password){
        if(user==null||password==null){//判断是否传入两个值
            System.out.println("出错了"+user+password);
            return false;
        }else {
            return userService.InsertUser(user, password);
        }
    }
    //删除用户
    @GetMapping(value = "DeleteUser")
    @CrossOrigin(origins = {"http://localhost:8080","null"})
    @RequestMapping(value = "/DeleteUser",method = RequestMethod.POST)
    @ResponseBody
    public boolean DeleteUser(@RequestParam(value ="username",required = false) String user){
        if(user==null){//判断是否传入值
            System.out.println("出错了"+user);
            return false;
        }else {
            return userService.DeleteUser(user);
        }
    }
    @GetMapping(value = "UpdatePassword_u")
    @CrossOrigin(origins = {"http://localhost:8080","null"})
    @RequestMapping(value = "/UpdatePassword_u",method = RequestMethod.POST)
    @ResponseBody
    public boolean UpdatePassword_u(@RequestParam(value ="username",required = false) String user,
                                    @RequestParam(value ="password",required = false) String password){
        if(user==null||password==null){//判断是否传入值
            System.out.println("出错了"+user);
            return false;
        }else {
            return userService.UpdatePassword_u(user,password);
        }
    }
}
