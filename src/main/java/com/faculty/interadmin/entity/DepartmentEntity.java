package com.faculty.interadmin.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class DepartmentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String depart_no;
    private  String depart_name;

    public String getDepart_no() {
        return depart_no;
    }

    public void setDepart_no(String depart_no) {
        this.depart_no = depart_no;
    }

    public String getDepart_name() {
        return depart_name;
    }

    public void setDepart_name(String depart_name) {
        this.depart_name = depart_name;
    }
}
