package com.faculty.interadmin.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class CalendarEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String cal_no;
    private  String holiday;
    private String paid_leave;

    public String getCal_no() {
        return cal_no;
    }

    public void setCal_no(String cal_no) {
        this.cal_no = cal_no;
    }

    public String getHoliday() {
        return holiday;
    }

    public void setHoliday(String holiday) {
        this.holiday = holiday;
    }

    public String getPaid_leave() {
        return paid_leave;
    }

    public void setPaid_leave(String paid_leave) {
        this.paid_leave = paid_leave;
    }
}
