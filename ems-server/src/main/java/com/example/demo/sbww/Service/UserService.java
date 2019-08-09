package com.example.demo.sbww.Service;

import com.example.demo.sbww.domain.User;

import java.util.List;

public interface UserService {
//    User selectByPrimaryKey(Integer id);
    Boolean LoginUser(String user,String password);
    List<User> ShowUser(int val);
    public boolean InsertUser(String user,String password);
    public boolean DeleteUser(String user);
    boolean UpdatePassword_u(String user,String password);
}
