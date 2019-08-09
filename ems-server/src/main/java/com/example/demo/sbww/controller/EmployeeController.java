package com.example.demo.sbww.controller;

import com.example.demo.sbww.Service.EmpService;
import com.example.demo.sbww.domain.Employee;
import com.example.demo.sbww.domain.Equipment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * author：赵赫
 * 对员工表进行添加删除等功能
 */
@Controller
public class EmployeeController {
    @Autowired
    private EmpService empService;
    @GetMapping(value = "InsertEmp")
    @CrossOrigin(origins = {"http://localhost:8080","null"})
    @RequestMapping(value = "/InsertEmp",method = RequestMethod.POST)
    @ResponseBody
    public boolean InsertEmp(@RequestParam(value ="username",required = false) String user,
                             @RequestParam(value ="password",required = false) String password,
                             @RequestParam(value ="phone",required = false) String phone){
        System.out.println(user);

        if(user==null){//判断是否传入两个值
            System.out.println("出错了"+user);
            return false;
        }else {
            return empService.InsertEmp(user,password,phone);
        }
    }
    @GetMapping(value = "DeleteEmp")
    @CrossOrigin(origins = {"http://localhost:8080","null"})
    @RequestMapping(value = "/DeleteEmp",method = RequestMethod.POST)
    @ResponseBody
    private boolean DeleteEmp(@RequestParam(value ="username",required = false) String user){
        return empService.DeleteEmp(user);
    }
    @GetMapping(value = "ShowEmp")
    @CrossOrigin(origins = {"http://localhost:8080","null"})
    @RequestMapping(value = "/ShowEmp",method = RequestMethod.GET)
    @ResponseBody
    private List<Employee> ShowEmp(){
        return empService.ShowEmp();
    }
    @GetMapping(value = "UpdatePassword")
    @CrossOrigin(origins = {"http://localhost:8080","null"})
    @RequestMapping(value = "/UpdatePassword",method = RequestMethod.POST)
    @ResponseBody
    private boolean UpdatePassword(@RequestParam(value ="emp_name",required = false) String name,
                                   @RequestParam(value ="password",required = false) String password){
        System.out.println(name+"+"+password);
        return empService.UpdatePassword(name,password);
    }

}
