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



    @Select("select * from teacher")
    static List<TeacherDao> findTAll();



    @Insert("insert into teacher(id,te_id,te_name,te_calendar,te_depart) values(#{id},#{te_id},#{te_name},#{te_calendar},#{te_depart})")

    void addTeacher (TeacherEntity teacherEntity);



    @Update("update teacher set id=#{id},te_id=#{te_id,}, te_name=#{te_name}, te_calendar=#{te_calendar},te_depart=#{te_calendar} where te_id=#{te_id}")

    void updateTeacher(TeacherEntity teacherEntity);



    @Delete("delect from teacher where te_id=#{te_id}")

    void deleteTeacher(int te_id);



    @Select("select * from teacher where te_id=#{te_id,}")

    TeacherEntity findTByTe_id(@Param("te_id") int te_id);



}