package com.example.demo.sbww.Service.impl;

import com.example.demo.sbww.Service.UserService;
import com.example.demo.sbww.domain.User;
import com.example.demo.sbww.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/*
* 赵赫
* */

@SuppressWarnings("SpringJavaAutowiringInspection")
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    //用户登录
    @Override
    public Boolean LoginUser(String user, String password) {
        List<User> user1=userMapper.LoginUser(user,password);//根据是否查到值向前端返回数据
        if(user1.isEmpty()){
            return false;
        }else {
            return true;
        }
    }
    //用户查询
    @Override
    public List<User> ShowUser(int val){
        int a=(val-1)*7;
        List<User> user=userMapper.ShowUser(a);
        return user;
    }
    //用户添加
    @Override
    public boolean InsertUser(String user,String password) {
        //因为给用户名设置了唯一性约束，同名会报错，所以如果同名直接返回false
        try {
            if(userMapper.InsertUser(user,password)) {
                return true;
            }else{
                return false;
            }
        }catch (Exception e){
            System.out.println("用户名相同");
            return false;
        }
    }
    //用户删除
    @Override
    public boolean DeleteUser(String user) {
        if(userMapper.DeleteUser(user)) {
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean UpdatePassword_u(String user, String password) {
        if(userMapper.UpdatePassword_u(user,password)) {
            return true;
        }else{
            return false;
        }
    }
}
