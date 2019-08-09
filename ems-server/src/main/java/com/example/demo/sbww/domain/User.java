package com.example.demo.sbww.domain;


public class User {
    private int userid;
    private String user_name;
    private String password;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

//    public String toString(){
//        return "user:"+user_id+"name:"+user_name+"password:"+user_password+"email"+user_email;
//    }
}
