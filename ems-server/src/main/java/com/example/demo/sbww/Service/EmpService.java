package com.example.demo.sbww.Service;

import com.example.demo.sbww.domain.Employee;

import java.util.List;

/**
 * author：赵赫
 */
public interface EmpService {
    boolean InsertEmp(String user,String password,String phone);
    boolean DeleteEmp(String user);
    boolean LoginEmp(String user, String password);
    List<Employee> ShowEmp();
    boolean UpdatePassword(String name,String password);
}
