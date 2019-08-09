package com.example.demo.sbww.Service.impl;

import com.example.demo.sbww.Service.ErrorService;
import com.example.demo.sbww.mapper.ErrorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * author:赵赫
 */
@Service("errorService")
public class ErrorServiceImpl implements ErrorService {
    @Autowired
    private ErrorMapper errorMapper;
    @Override
    public boolean InsertErr(String code, String info) {
        try {
            if(errorMapper.InsertErr(code,info)){
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
    public boolean DeleteErr(String code) {
        if(errorMapper.DeleteErr(code)) {
            return true;
        }else{
            return false;
        }
    }

    @Override
    public List<Error> ShowErr() {
        List<Error> list=errorMapper.ShowErr();
        return list;
    }

//    @Override
//    public List<Error> ShowErr() {
//        List<Error> list=errorMapper.ShowErr();
//        return list;
//    }

}
