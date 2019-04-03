package com.faculty.interadmin.service;

import java.util.List;

import com.faculty.interadmin.dao.TeacherDao;
import com.faculty.interadmin.entity.TeacherEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

@Service
@Mapper
public interface TeacherService {
    List<TeacherEntity> findAll();

    void addTeacher(TeacherDao teacherDao);

    void updateTeacher(TeacherDao teacherDao);

    void deleteTeacher(int id);

    void TeacherDao findById(int id);
}