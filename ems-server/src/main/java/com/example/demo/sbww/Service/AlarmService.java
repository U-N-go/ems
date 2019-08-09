package com.example.demo.sbww.Service;

import com.example.demo.sbww.domain.Alarm;

import java.util.List;

/**
 * author：赵赫
 */

public interface AlarmService {
    List<Alarm> ShowAlarm(String empname);
    List<Alarm> ShowAlarm_u();
    List<Alarm> ShowAlarm_u1(int val);
    boolean SubmitAlarm(String sol_date,String sol_method,String ala_id);
    String CountAlarm();
    List<Alarm> CurrentAlarm(int current);
}
