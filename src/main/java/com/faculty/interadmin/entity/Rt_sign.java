package com.faculty.interadmin.entity;

public class Rt_sign {
    private String dt;
    private String s_name;
    private  String sign_type;

    public String getDate() {
        return dt;
    }

    public void setDate(String dt) {
        this.dt = dt;
    }

    public String getName() {
        return s_name;
    }

    public void setName(String s_name) {
        this.s_name = s_name;
    }

    public String getType() {
        return sign_type;
    }

    public void setType(String sign_type) {
        this.sign_type = sign_type;
    }
    @Override
    public String toString(){
        return this.dt+"xxxxx"+this.s_name+"";
    }
}
