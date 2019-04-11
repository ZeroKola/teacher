package com.faculty.interadmin.service;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import com.faculty.interadmin.entity.StudentEntity;

import java.util.List;


@Service
@Mapper
public interface StudentService {
<<<<<<< HEAD
    List<StudentEntity> findSAll();

    void addStudent(StudentEntity studentEntity);

    void updateStudent(StudentEntity studentEntity);

    void deleteStudent(String id);

    StudentEntity findSById(String id);

}
