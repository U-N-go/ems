package com.example.demo.sbww.domain;

/**
 * author：赵赫
 * 错误信息表
 */
public class Alarm {
    private int ala_id; //报警id
    private int equ_id; //设备id
    private int err_id; //错误id
    private String ala_intro; //问题简介
    private String sub_date; //提交日期
    private String sol_date; //解决日期
    private String sol_method; //解决方法
    private Equipment equipment; //外键连接设备表
    private Error error; //外键连接错误类型表

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }

    public String getAla_intro() {
        return ala_intro;
    }

    public void setAla_intro(String ala_intro) {
        this.ala_intro = ala_intro;
    }

    public int getAla_id() {
        return ala_id;
    }

    public void setAla_id(int ala_id) {
        this.ala_id = ala_id;
    }

    public int getEqu_id() {
        return equ_id;
    }

    public void setEqu_id(int equ_id) {
        this.equ_id = equ_id;
    }

    public int getErr_id() {
        return err_id;
    }

    public void setErr_id(int err_id) {
        this.err_id = err_id;
    }

    public String getSub_date() {
        return sub_date;
    }

    public void setSub_date(String sub_date) {
        this.sub_date = sub_date;
    }

    public String getSol_date() {
        return sol_date;
    }

    public void setSol_date(String sol_date) {
        this.sol_date = sol_date;
    }

    public String getSol_method() {
        return sol_method;
    }

    public void setSol_method(String sol_method) {
        this.sol_method = sol_method;
    }
}
