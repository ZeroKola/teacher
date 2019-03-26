package com.faculty.interadmin.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DocumentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String d_no;
    private  String d_title;
    private String d_uploader;
    private  String d_url;
    private  String d_intro;

    public String getD_no() {
        return d_no;
    }

    public void setD_no(String d_no) {
        this.d_no = d_no;
    }

    public String getD_title() {
        return d_title;
    }

    public void setD_title(String d_title) {
        this.d_title = d_title;
    }

    public String getD_uploader() {
        return d_uploader;
    }

    public void setD_uploader(String d_uploader) {
        this.d_uploader = d_uploader;
    }

    public String getD_url() {
        return d_url;
    }

    public void setD_url(String d_url) {
        this.d_url = d_url;
    }

    public String getD_intro() {
        return d_intro;
    }

    public void setD_intro(String d_intro) {
        this.d_intro = d_intro;
    }
}
