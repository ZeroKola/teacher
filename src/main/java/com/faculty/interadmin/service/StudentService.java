package com.faculty.interadmin.service;

import com.faculty.interadmin.dao.StudentDao;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import com.faculty.interadmin.entity.StudentEntity;
import org.springframework.transaction.annotation.Transactional;

import javax.swing.*;
import java.util.List;


import java.util.List;


@Service
@Mapper
public interface StudentService {
<<<<<<< HEAD
    List<StudentEntity> findSAll();

    void addStudent(StudentEntity studentEntity);

    void updateStudent(StudentEntity studentEntity);

=======


    static void studentService(StudentEntity studentEntity) {
    }


    static List<StudentEntity> findSAll() {
        return null;
    }

    @Transactional
    void addStudent(StudentEntity studentEntity);

     static void updateStudent() {
        updateStudent();
    }

    @Transactional
>>>>>>> dev-fengw
    void deleteStudent(String id);

    StudentEntity findSById(String id);

    StudentDao findById(Spring id);
}
