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
    static List<TeacherDao> findTAll() {
        return null;
    }


    @Insert("insert into teacher(id,te_id,te_name,te_calendar,te_depart) values(#{id},#{te_id},#{te_name},#{te_calendar},#{te_depart})")

<<<<<<< HEAD
=======


>>>>>>> dev-fengw
    void addTeacher (TeacherEntity teacherEntity);



    @Update("update teacher set id=#{id},te_id=#{te_id,}, te_name=#{te_name}, te_calendar=#{te_calendar},te_depart=#{te_calendar} where te_id=#{te_id}")

    void updateTeacher(TeacherEntity teacherEntity);



    @Delete("delete from teacher where te_id=#{te_id}")

<<<<<<< HEAD
    void deleteTeacher(int te_id);


    @Select("select * from teacher where te_id=#{te_id,}")
    static TeacherEntity findTByTe_id(@Param("te_id") int te_id) {
        return null;
    }

=======
>>>>>>> dev-fengw

}