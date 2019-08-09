package com.example.demo.sbww.controller;

import com.example.demo.sbww.Service.EqmService;
import com.example.demo.sbww.domain.Employee;
import com.example.demo.sbww.domain.Equipment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * author:赵赫
 */
@Controller
public class EqmController {
    @Autowired
    private EqmService eqmService;
    @GetMapping(value = "loginUser")
    @CrossOrigin(origins = {"http://localhost:8080","null"})
    @RequestMapping(value = "/ShowEqu",method = RequestMethod.GET)
    @ResponseBody
    public List<Equipment> ShowEqu(){
        return eqmService.ShowEqu();
    }
}
