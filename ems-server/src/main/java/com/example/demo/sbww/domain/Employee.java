package com.example.demo.sbww.domain;
/*
* 员工表
* author：赵赫
*/
public class Employee {
    private int emp_id; //员工id
    private String emp_name; //员工姓名
    private String password; //员工密码
    private String emp_phone; //员工电话
    private int equ_id; //设备id
    private String take_date; //领取时间

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmp_phone() {
        return emp_phone;
    }

    public void setEmp_phone(String emp_phone) {
        this.emp_phone = emp_phone;
    }

    public int getEqu_id() {
        return equ_id;
    }

    public void setEqu_id(int equ_id) {
        this.equ_id = equ_id;
    }

    public String getTake_date() {
        return take_date;
    }

    public void setTake_date(String take_date) {
        this.take_date = take_date;
    }

}
