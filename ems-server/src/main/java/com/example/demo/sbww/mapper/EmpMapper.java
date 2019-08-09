package com.example.demo.sbww.mapper;

import com.example.demo.sbww.domain.Employee;
import com.example.demo.sbww.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * author：赵赫
 */
@Mapper
public interface EmpMapper {
    boolean InsertEmp(String user,String password,String phone);
    boolean DeleteEmp(String user);
    List<Employee> LoginEmp(String user, String password);
    List<Employee> ShowEmp();
    boolean UpdatePassword(String name,String password);
}
