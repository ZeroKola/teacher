package com.faculty.interadmin.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class LessonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String l_no;
    private  String l_name;
    private String l_time;
    private  String l_classroom;
    private String l_teacher;
    private  String l_programe;
    private String l_class;
    private  String l_sdw;

    public String getL_no() {
        return l_no;
    }

    public void setL_no(String l_no) {
        this.l_no = l_no;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public String getL_time() {
        return l_time;
    }

    public void setL_time(String l_time) {
        this.l_time = l_time;
    }

    public String getL_classroom() {
        return l_classroom;
    }

    public void setL_classroom(String l_classroom) {
        this.l_classroom = l_classroom;
    }

    public String getL_teacher() {
        return l_teacher;
    }

    public void setL_teacher(String l_teacher) {
        this.l_teacher = l_teacher;
    }

    public String getL_programe() {
        return l_programe;
    }

    public void setL_programe(String l_programe) {
        this.l_programe = l_programe;
    }

    public String getL_class() {
        return l_class;
    }

    public void setL_class(String l_class) {
        this.l_class = l_class;
    }

    public String getL_sdw() {
        return l_sdw;
    }

    public void setL_sdw(String l_sdw) {
        this.l_sdw = l_sdw;
    }
}
