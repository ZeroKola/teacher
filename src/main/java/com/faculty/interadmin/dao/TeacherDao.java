package com.faculty.interadmin.dao;



import java.util.List;



import org.apache.ibatis.annotations.Mapper;

import org.apache.ibatis.annotations.Delete;

import org.apache.ibatis.annotations.Insert;

import org.apache.ibatis.annotations.Param;

import org.apache.ibatis.annotations.Select;

import org.apache.ibatis.annotations.Update;



import com.faculty.interadmin.entity.TeacherEntity;



@Mapper

public interface TeacherDao {


    List<TeacherEntity> findTAll();
    List<TeacherEntity> findTByTe_id(String te_id);
    List<TeacherEntity> findTByTe_depart(String te_depart);

    void addTeacher (TeacherEntity teacherEntity);

    void updateTeacher(TeacherEntity teacherEntity);

    void deleteTeacher(String te_id);


}