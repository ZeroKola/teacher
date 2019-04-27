package com.faculty.interadmin.service;

import java.util.List;

import com.faculty.interadmin.dao.TeacherDao;

import com.faculty.interadmin.entity.TeacherEntity;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TeacherService {
    public void teacherService(TeacherEntity teacherEntity);
    List<TeacherDao> findTAll();
    void addTeacher(TeacherEntity teacherEntity);
    void updateTeacher(TeacherEntity teacherEntity);
    void deleteTeacher(String te_id);
    void findTByTe_id(String te_id);
}