package com.example.demo.sbww.domain;

/**
 * author：赵赫
 * 错误类型表
 */
public class Error {
    private int err_id; //错误id
    private String err_code; //错误码
    private String err_info; //错误信息

    public int getErr_id() {
        return err_id;
    }

    public void setErr_id(int err_id) {
        this.err_id = err_id;
    }

    public String getErr_code() {
        return err_code;
    }

    public void setErr_code(String err_code) {
        this.err_code = err_code;
    }

    public String getErr_info() {
        return err_info;
    }

    public void setErr_info(String err_info) {
        this.err_info = err_info;
    }
}
