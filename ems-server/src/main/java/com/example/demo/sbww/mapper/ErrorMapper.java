package com.example.demo.sbww.mapper;

import java.util.List;

public interface ErrorMapper {
    public boolean InsertErr(String code,String info);
    public boolean DeleteErr(String code);
    public List<Error> ShowErr();
}
