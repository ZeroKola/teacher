package com.faculty.interadmin.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SigninEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String sign_id;
    private  String s_no;
    private String l_no;
    private  String dt;
    private String sign_type;

    public String getSign_id() {
        return sign_id;
    }

    public void setSign_id(String sign_id) {
        this.sign_id = sign_id;
    }

    public String getS_no() {
        return s_no;
    }

    public void setS_no(String s_no) {
        this.s_no = s_no;
    }

    public String getL_no() {
        return l_no;
    }

    public void setL_no(String l_no) {
        this.l_no = l_no;
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    public String getSign_type() {
        return sign_type;
    }

    public void setSign_type(String sign_type) {
        this.sign_type = sign_type;
    }
}
