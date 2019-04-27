package com.faculty.interadmin.entity;



import javax.persistence.Entity;

import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;

import javax.persistence.Id;



@Entity

public class TeacherEntity {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String id;

    private String te_id;

    private  String te_name;

    private String te_depart;

    private  String te_calendar;





    public String getId() {

        return id;

    }



    public void setId(String id) {

        this.id = id;

    }



    public String getTe_name() {

        return te_name;

    }



    public void setTe_name(String te_name) {

        this.te_name = te_name;

    }



    public String getTe_depart() {

        return te_depart;

    }



    public void setTe_depart(String te_depart) {

        this.te_depart = te_depart;

    }



    public String getTe_calendar() {

        return te_calendar;

    }



    public void setTe_calendar(String te_calendar) {

        this.te_calendar = te_calendar;

    }



    public String getTe_id() { return te_id; }



    public void setTe_id(String te_id) { this.te_id = te_id; }



}