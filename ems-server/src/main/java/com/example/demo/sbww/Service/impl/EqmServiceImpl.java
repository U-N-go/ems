package com.example.demo.sbww.Service.impl;

import com.example.demo.sbww.Service.EqmService;
import com.example.demo.sbww.domain.Equipment;
import com.example.demo.sbww.domain.User;
import com.example.demo.sbww.mapper.EqmMapper;
import com.example.demo.sbww.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/*
* author：赵赫
*/
@Service("eqmService")
public class EqmServiceImpl implements EqmService {
    @Autowired
    private EqmMapper eqmMapper;

    public List<Equipment> ShowEqu(){
        List<Equipment> user=eqmMapper.ShowEqu(); //接收查询出来的设备信息
        return user;
    }
}
