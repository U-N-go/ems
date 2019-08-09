package com.example.demo.sbww.Service.impl;

import com.example.demo.sbww.Service.EmpService;
import com.example.demo.sbww.domain.Employee;
import com.example.demo.sbww.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * author:赵赫
 */
@Service("empService")
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;
    @Override
    public boolean InsertEmp(String user, String password,String phone) {
        //因为给emp_name设置了唯一性约束，同名会报错，所以如果同名直接返回false
        try {
            if(empMapper.InsertEmp(user,password,phone)){
                return true;
            }else {
                return false;
            }
        }catch (Exception e){
            System.out.println("用户名相同");
            return false;
        }
    }

    @Override
    public boolean DeleteEmp(String user) {
        if(empMapper.DeleteEmp(user)) {
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean LoginEmp(String user, String password) {
        if(empMapper.LoginEmp(user,password).isEmpty()){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public List<Employee> ShowEmp() {
        List<Employee> list=empMapper.ShowEmp();
        return list;
    }

    @Override
    public boolean UpdatePassword(String name,String password) {
        if(empMapper.UpdatePassword(name,password)){
            return true;
        }else{
            return false;
        }
    }
}
