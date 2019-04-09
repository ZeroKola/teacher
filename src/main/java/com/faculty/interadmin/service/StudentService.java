package com.faculty.interadmin.service;

import com.faculty.interadmin.dao.StudentDao;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import com.faculty.interadmin.entity.StudentEntity;
import org.springframework.transaction.annotation.Transactional;

import javax.swing.*;
import java.util.List;


@Service
@Mapper
public interface StudentService {


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
    void deleteStudent(String id);

    StudentEntity findSById(String id);

    StudentDao findById(Spring id);
}
