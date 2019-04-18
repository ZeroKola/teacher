package com.faculty.interadmin.service.impl;



import com.faculty.interadmin.entity.StudentEntity;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.faculty.interadmin.dao.StudentDao;

import com.faculty.interadmin.service.StudentService;

import org.springframework.transaction.annotation.Transactional;



import javax.swing.*;

import java.util.List;



@Service

public class StudentSerImpl implements StudentService {

    private com.faculty.interadmin.entity.StudentEntity StudentEntity;



    @Autowired

    public StudentSerImpl(StudentDao studentDao) {

    }



    public List<StudentEntity> findSAll() {

        return  StudentDao.findSAll();

    }



    @Override

    @Transactional

    public void addStudent(StudentEntity studentEntity) {

        StudentDao.addStudent(StudentEntity);

    }





    @Transactional

    public void updateStudent(StudentEntity studentEntity) {

        StudentDao.updateStudent(StudentEntity);

    }



    @Override

    @Transactional

    public void deleteStudent(String s_no) {

        StudentDao.deleteStudent(s_no);

    }



    @Override

    public com.faculty.interadmin.entity.StudentEntity findSById(String s_no) {

        return null;

    }



    @Override

    public StudentDao findById(Spring s_no) {

        return (StudentDao) StudentDao.findSById(s_no);

    }











}