package com.example.demo.sbww.mapper;

import com.example.demo.sbww.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {
//    public List<User> queryUserList();
//    User selectByPrimaryKey(Integer id);
//    public List<User> selectOne(Integer id);
    public List<User> LoginUser(String user,String password);
    public List<User> ShowUser(int val);
    public boolean InsertUser(String user,String password);
    public boolean DeleteUser(String user);
    boolean UpdatePassword_u(String user,String password);
}
