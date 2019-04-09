package com.faculty.interadmin.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class ClassroomEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String r_no;
    private  String r_name;
    private String r_address;
    private  String r_size;

    public String getR_no() {
        return r_no;
    }

    public void setR_no(String r_no) {
        this.r_no = r_no;
    }

    public String getR_name() {
        return r_name;
    }

    public void setR_name(String r_name) {
        this.r_name = r_name;
    }

    public String getR_address() {
        return r_address;
    }

    public void setR_address(String r_address) {
        this.r_address = r_address;
    }

    public String getR_size() {
        return r_size;
    }

    public void setR_size(String r_size) {
        this.r_size = r_size;
    }
}
