package com.faculty.interadmin.entity;



import javax.persistence.Entity;

import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;

import javax.persistence.Id;



@Entity

public class StudentEntity {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String id;

    private  String s_no;

    private String name;

    private String s_depart;

    private  String s_profession;

    private String s_class;

    private String s_img;

    private String s_feature;



    public String getName() {

        return name;

    }



    public void setName(String name) {

        this.name = name;

    }

    public String getId() {

        return id;

    }



    public void setId(String id) {

        this.id = id;

    }



    public String getS_no() {

        return s_no;

    }



    public void setS_no(String s_no) {

        this.s_no = s_no;

    }



    public String getS_depart() {

        return s_depart;

    }



    public void setS_depart(String s_depart) {

        this.s_depart = s_depart;

    }



    public String getS_profession() {

        return s_profession;

    }



    public void setS_profession(String s_profession) {

        this.s_profession = s_profession;

    }



    public String getS_class() {

        return s_class;

    }



    public void setS_class(String s_class) {

        this.s_class = s_class;

    }



    public String getS_img() {

        return s_img;

    }



    public void setS_img(String s_img) {

        this.s_img = s_img;

    }



    public String getS_feature() {

        return s_feature;

    }



    public void setS_feature(String s_feature) {

        this.s_feature = s_feature;

    }





}