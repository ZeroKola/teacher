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
<<<<<<< HEAD


    static List<TeacherDao> findTAll();


    List<TeacherDao> findTAll();


    @Insert("insert into teacher(id,te_name,te_calendar,te_depart) values(#{id},#{te_name},#{te_calendar},#{te_depart})")
=======
>>>>>>> dev-pjy
    void addTeacher (TeacherEntity teacherEntity);

    void updateTeacher(TeacherEntity teacherEntity);


<<<<<<< HEAD
    @Select("select * from teacher where id=#{id},te_name=#{te_name}, te_calendar=#{te_calendar},te_depart=#{te_calendar}")


    static TeacherEntity findTById(@Param("id") int id);
=======
>>>>>>> dev-pjy



}
