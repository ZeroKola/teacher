package com.faculty.interadmin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import org.apache.ibatis.annotations.Mapper;

import com.faculty.interadmin.entity.StudentEntity;

import javax.swing.*;


@Mapper
public interface StudentDao{


    @Select("SELECT ID,S_NO,S_DEPART,S_PROFESSION,S_CLASS,S_IMG FROM STUDENT")

    List<StudentEntity> findSAll();

    @Insert("INSERT INTO STUDENTENTITY(ID,S_NO,S_DEPART,S_PROFESSON,S_CLASS,S_IMG)VALUES(#{ID}, #{S_NO}, #{S_DEPART},#{S_PROFESSON},#{S_CLASS},#{S_IMG})")
    void addStudent(StudentEntity studentEntity);

    @Update("UPDATE STUDENTENTITY SET S_NO=#{s_no}, S_DEPART=#{s_depart}, S_PROFESSON=#{s_professon},S_CLASS=#{s_class},S_IMG=#{s_img} WHERE ID=#{id}")
    void updateStudent(StudentEntity studentEntity);

    @Delete("DELETE FROM STUDENTENTITY WHERE ID=#{id}")
    void deleteStudent(String id);

    @Select("SELECT ID,S_NO,S_DEPART,S_PROFESSON,S_CLASS,S_IMG FROM STUDENTENTITY WHERE ID=#{id}")
    StudentEntity findSById(@Param("id") String id);


}
