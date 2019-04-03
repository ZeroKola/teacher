package com.faculty.interadmin.service.impl;

import com.faculty.interadmin.entity.StudentEntity;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.faculty.interadmin.dao.StudentDao;
import com.faculty.interadmin.service.StudentService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentSerImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;
    private Object StudentEntity;

    @Override
    public List<StudentEntity> findSAll() {
        return  StudentDao.findSAll();
    }

    @Override
    @Transactional
    public void addStudent(StudentEntity studentEntity) {
        StudentDao.addStudent(StudentEntity);
    }


    @Override
    @Transactional
    public void updateStudent(StudentEntity studentEntity) {
        StudentDao.updateStudent(StudentEntity);
    }

    @Override
    @Transactional
    public void deleteStudent(String id) {
        StudentDao.deleteStudent(id);
    }


    @Override
    public StudentEnity findById(String id) {
        return StudentDao.findSById(id);
    }





}
