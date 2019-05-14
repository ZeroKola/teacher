package com.faculty.interadmin.service;

import java.util.List;

import com.faculty.interadmin.dao.TeacherDao;
import com.faculty.interadmin.Another.Rt_teacher;
import com.faculty.interadmin.entity.TeacherEntity;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TeacherService {
    List<Rt_teacher> findTAll();
    List<Rt_teacher> findTByTe_id(String te_id);
    List<Rt_teacher> findTByTe_depart(String te_depart);
    void addTeacher(TeacherEntity teacherEntity);
    void updateTeacher(TeacherEntity teacherEntity);
    void deleteTeacher(String te_id);
}