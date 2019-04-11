package com.faculty.interadmin.service.impl;

import com.faculty.interadmin.entity.StudentEntity;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.faculty.interadmin.dao.StudentDao;
import com.faculty.interadmin.service.StudentService;
import org.springframework.transaction.annotation.Transactional;

<<<<<<< HEAD
=======
import java.util.List;

@Service
public class StudentSerImpl implements StudentService {
    @Autowired
<<<<<<< HEAD
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


<<<<<<< HEAD
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
<<<<<<< HEAD
<<<<<<< HEAD
    public StudentEnity findSById(String id) {
=======
    public StudentEnity findById(String id) {
>>>>>>> dev-pjy
        return StudentDao.findSById(id);
    }





}
