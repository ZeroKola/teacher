package com.faculty.interadmin.service.impl;

import com.faculty.interadmin.entity.StudentEntity;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.faculty.interadmin.dao.StudentDao;
import com.faculty.interadmin.service.StudentService;
import org.springframework.transaction.annotation.Transactional;

<<<<<<< HEAD
=======
import javax.swing.*;
>>>>>>> dev-fengw
import java.util.List;

@Service
public class StudentSerImpl implements StudentService {
    private com.faculty.interadmin.entity.StudentEntity StudentEntity;

    @Autowired
<<<<<<< HEAD
    private StudentDao studentDao;
    private Object StudentEntity;

    @Override
=======
    public StudentSerImpl(StudentDao studentDao) {
    }

>>>>>>> dev-fengw
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
=======
>>>>>>> dev-fengw
    @Transactional
    public void updateStudent(StudentEntity studentEntity) {
        StudentDao.updateStudent(StudentEntity);
    }

    @Override
    @Transactional
    }


    @Override
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    public StudentEnity findSById(String id) {
=======
    public StudentEnity findById(String id) {
>>>>>>> dev-pjy
        return StudentDao.findSById(id);
=======
    public com.faculty.interadmin.entity.StudentEntity findSById(String id) {
=======
>>>>>>> dev-fengw
        return null;
    }

    @Override
<<<<<<< HEAD
    public StudentDao findById(Spring id) {
        return (StudentDao) StudentDao.findSById(id);
>>>>>>> dev-fengw
=======
>>>>>>> dev-fengw
    }





}
