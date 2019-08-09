package com.example.demo.sbww.Service.impl;

import com.example.demo.sbww.Service.AlarmService;
import com.example.demo.sbww.domain.Alarm;
import com.example.demo.sbww.mapper.AlarmMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * author：赵赫
 */

@Service("alarmService")
public class AlarmServiceImpl implements AlarmService {
    @Autowired
    public AlarmMapper alarmMapper;
    @Override
    public List<Alarm> ShowAlarm(String empname) {
        List<Alarm> list=alarmMapper.ShowAlarm(empname);
        return list;
    }

    @Override
    public List<Alarm> ShowAlarm_u() {
        List<Alarm> list=alarmMapper.ShowAlarm_u();
        return list;
    }
    @Override
    public List<Alarm> ShowAlarm_u1(int val) {
        int a=(val-1)*7;
        List<Alarm> list=alarmMapper.ShowAlarm_u1(a);
        return list;
    }

    @Override
    public boolean SubmitAlarm(String sol_date, String sol_method,String ala_id) {
        return alarmMapper.SubmitAlarm(sol_date,sol_method,ala_id);
    }

    @Override
    public String CountAlarm() {
        return alarmMapper.CountAlarm();
    }

    @Override
    public List<Alarm> CurrentAlarm(int current) {
        //数据库语句不能计算，提前计算好
        int a=(current-1)*7;
        List<Alarm> list=alarmMapper.CurrentAlarm(a);
        return list;
    }
}
