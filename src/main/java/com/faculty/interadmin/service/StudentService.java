package com.faculty.interadmin.service;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import com.faculty.interadmin.entity.StudentEntity;

@Service
@Mapper
public interface StudentService {
    List<StudentEntity> findAll();

    boolean addStudent(StudentEntity studentEntity);

    boolean updateStudent(StudentEntity studentEntity);

    boolean deleteStudent(String id);

    StudentEntity findById(String id);

}
