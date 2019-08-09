package com.example.demo.sbww.domain;
/*
*设备表
* author：赵赫
 */
public class Equipment {
    private int equ_id; //设备id
    private String equ_type; //设备型号
    private String equ_code; //设备码
    private String equ_positon;  //设备位置
    private String producer; //生产厂家
    private String buy_date; //购买日期
    private String warranty_date; //保修结束日期
    private String aftersales_manager; //售后负责人
    private int aftersales_hotline; //售后电话
    private Employee emp; //员工信息

    public String getBuy_date() {
        return buy_date;
    }

    public void setBuy_date(String buy_date) {
        this.buy_date = buy_date;
    }

    public String getEqu_positon() {
        return equ_positon;
    }

    public void setEqu_positon(String equ_positon) {
        this.equ_positon = equ_positon;
    }



    public Employee getEmp() {
        return emp;
    }

    public String getEqu_code() {
        return equ_code;
    }

    public void setEqu_code(String equ_code) {
        this.equ_code = equ_code;
    }

    public void setEmp(Employee emp) {
        this.emp = emp;
    }

    public int getEqu_id() {
        return equ_id;
    }

    public void setEqu_id(int equ_id) {
        this.equ_id = equ_id;
    }

    public String getEqu_type() {
        return equ_type;
    }

    public void setEqu_type(String equ_type) {
        this.equ_type = equ_type;
    }


    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }


    public String getWarranty_date() {
        return warranty_date;
    }

    public void setWarranty_date(String warranty_date) {
        this.warranty_date = warranty_date;
    }

    public String getAftersales_manager() {
        return aftersales_manager;
    }

    public void setAftersales_manager(String aftersales_manager) {
        this.aftersales_manager = aftersales_manager;
    }

    public int getAftersales_hotline() {
        return aftersales_hotline;
    }

    public void setAftersales_hotline(int aftersales_hotline) {
        this.aftersales_hotline = aftersales_hotline;
    }
}
