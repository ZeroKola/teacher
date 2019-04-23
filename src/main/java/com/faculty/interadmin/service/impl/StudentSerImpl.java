package com.faculty.interadmin.service.impl;


import com.faculty.interadmin.entity.StudentEntity;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.faculty.interadmin.dao.StudentDao;

import com.faculty.interadmin.service.StudentService;

import org.springframework.transaction.annotation.Transactional;




import java.util.List;



@Service
@Transactional
public class StudentSerImpl implements StudentService {

    private com.faculty.interadmin.entity.StudentEntity StudentEntity;



    @Autowired

    public StudentDao studentDao;


    @Override
    public void studentService(com.faculty.interadmin.entity.StudentEntity studentEntity) {

    }

    public List<StudentEntity> findSAll() {

        return  this.studentDao.findSAll();

    }



    @Override

    public void addStudent(StudentEntity studentEntity) {

        this.studentDao.addStudent(StudentEntity);

    }






    @Override
    public void updateStudent(StudentEntity studentEntity) {

        this.studentDao.updateStudent(StudentEntity);

    }



    @Override

    public void deleteStudent(String s_no) {

        this.studentDao.deleteStudent(s_no);

    }



    @Override

    public void findSById(String s_no) {

        this.studentDao.findSById(s_no);

    }














}