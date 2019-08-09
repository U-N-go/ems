package com.example.demo.sbww.Service;

import java.util.List;

public interface ErrorService {
    public boolean InsertErr(String code,String info);
    public boolean DeleteErr(String code);
    List<Error> ShowErr();
}
