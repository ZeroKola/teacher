package com.faculty.interadmin.dao;



import java.util.List;



import org.apache.ibatis.annotations.Delete;

import org.apache.ibatis.annotations.Insert;

import org.apache.ibatis.annotations.Mapper;


import org.apache.ibatis.annotations.Select;

import org.apache.ibatis.annotations.Update;



import org.apache.ibatis.annotations.Mapper;



import com.faculty.interadmin.entity.StudentEntity;


@Mapper

public interface StudentDao{





    @Select("SELECT ID,S_NO,S_DEPART,S_PROFESSION,S_CLASS,S_IMG,S_FEATURE FROM student")
    List<StudentEntity> findSAll();



    @Insert("INSERT INTO SENTENTIAL(ID,S_NO,S_DEPART,S_PROFESSION,S_CLASS,S_IMG,S_FEATURE)VALUES(#{ID}, #{S_NO}, #{S_DEPART},#{S_PROFESSION},#{S_CLASS},#{S_IMG},#{S_FEATURE})")

    void addStudent(StudentEntity studentEntity);



    @Update("UPDATE SENTENTIAL SET ID=#{id}, S_DEPART=#{s_depart}, S_PROFESSION=#{s_profession},S_CLASS=#{s_class},S_IMG=#{s_img},S_FEATURE=#{s_feature} WHERE S_NO=#{s_no}")

    void updateStudent(StudentEntity studentEntity);



    @Delete("DELETE FROM student WHERE S_NO=#{s_no}")

     void deleteStudent(String id);



    @Select("SELECT ID,S_NO,S_DEPART,S_PROFESSION,S_CLASS,S_IMG,S_FEATURE FROM student WHERE S_NO=#{s_no}")

    void findSById(String s_no);
}