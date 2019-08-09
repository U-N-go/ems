package com.example.demo.sbww.controller;

import com.example.demo.sbww.Service.AlarmService;
import com.example.demo.sbww.domain.Alarm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * author:赵赫
 */
@Controller
public class AlarmController {
    @Autowired
    private AlarmService alarmService;

    @GetMapping(value = "ShowAlarm")
    @CrossOrigin(origins = {"http://localhost:8080", "null"})
    @RequestMapping(value = "/ShowAlarm", method = RequestMethod.POST)
    @ResponseBody
    private List<Alarm> ShowAlarm(@RequestParam(value = "emp_name", required = false) String empname) {
        return alarmService.ShowAlarm(empname);
    }

    //管理员查看已经处理过的问题
    @GetMapping(value = "ShowAlarm_u")
    @CrossOrigin(origins = {"http://localhost:8080", "null"})
    @RequestMapping(value = "/ShowAlarm_u", method = RequestMethod.GET)
    @ResponseBody
    private List<Alarm> ShowAlarm_u() {
        return alarmService.ShowAlarm_u();
    }

    //管理员查看未处理过的问题
    @GetMapping(value = "ShowAlarm_u1")
    @CrossOrigin(origins = {"http://localhost:8080", "null"})
    @RequestMapping(value = "/ShowAlarm_u1", method = RequestMethod.POST)
    @ResponseBody
    private List<Alarm> ShowAlarm_u1(@RequestParam(value = "val", required = false) int val) {
        return alarmService.ShowAlarm_u1(val);
    }

    @GetMapping(value = "SubmitAlarm")
    @CrossOrigin(origins = {"http://localhost:8080", "null"})
    @RequestMapping(value = "/SubmitAlarm", method = RequestMethod.POST)
    @ResponseBody
    private boolean SubmitAlarm(@RequestParam(value = "sol_date", required = false) String sol_date,
                                @RequestParam(value = "sol_method", required = false) String sol_method,
                                @RequestParam(value = "ala_id", required = false) String ala_id) {
        return alarmService.SubmitAlarm(sol_date, sol_method, ala_id);
    }

    @GetMapping(value = "CountAlarm")
    @CrossOrigin(origins = {"http://localhost:8080", "null"})
    @RequestMapping(value = "/CountAlarm", method = RequestMethod.GET)
    @ResponseBody
    private String CountAlarm() {
        return alarmService.CountAlarm();
    }

    @GetMapping(value = "CurrentAlarm")
    @CrossOrigin(origins = {"http://localhost:8080", "null"})
    @RequestMapping(value = "/CurrentAlarm", method = RequestMethod.POST)
    @ResponseBody
    private List<Alarm> CurrentAlarm(@RequestParam(value = "val", required = false) int current) {
        System.out.println("我的值时"+current);
        return alarmService.CurrentAlarm(current);
    }
}
