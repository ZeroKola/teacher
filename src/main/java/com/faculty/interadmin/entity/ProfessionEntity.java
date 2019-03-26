package com.faculty.interadmin.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProfessionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String p_no;
    private  String p_name;
    private String depart_no;

    public String getP_no() {
        return p_no;
    }

    public void setP_no(String p_no) {
        this.p_no = p_no;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public String getDepart_no() {
        return depart_no;
    }

    public void setDepart_no(String depart_no) {
        this.depart_no = depart_no;
    }
}
