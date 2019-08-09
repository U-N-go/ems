package com.example.demo.sbww.controller;

import com.example.demo.sbww.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MybatisController {
    @Autowired
    private UserMapper userMapper;
//    @GetMapping(value = "queryUserList")
//    @CrossOrigin(origins = {"http://localhost:8080","null"})
//    @RequestMapping(value = "/query1",method = RequestMethod.GET)
//    @ResponseBody
//    public  List<User> queryUserList(){
//        List<User> users=userMapper.queryUserList();
//        return users;
//    }
//    @GetMapping(value = "selectOne")
//    @CrossOrigin(origins = {"http://localhost:8080","null"})
//    @RequestMapping(value = "/query2",method = RequestMethod.POST)
//    @ResponseBody
//    public List<User> selectOne(@RequestParam(value ="param1",required = false) String aa){
//
//        if(aa==null){
//            System.out.println("出错了"+aa);
//            List<User> users=userMapper.selectOne(Integer.valueOf(1).intValue());
//            return users;
//        }else {
//            System.out.println(aa);
//            List<User> users = userMapper.selectOne(Integer.valueOf(aa));
//            return users;
//        }
//    }

}
