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


@Mapper
public interface StudentDao{

    @Select("SELECT ID,S_NO,S_DEPART,S_PROFESSION,S_CLASS,S_IMG FROM STUDENT")
    List<StudentEntity> findAll();

    @Insert("INSERT INTO STUDENTENTITY(ID,S_NO,S_DEPART,S_PROFESSON,S_CLASS,S_IMG)VALUES(#{ID}, #{S_NO}, #{S_DEPART},#{S_PROFESSON},#{S_CLASS},#{S_IMG})")
    void addStu(StudentEntity studentEntity);

    @Update("UPDATE STUDENTENTITY SET S_NO=#{s_no}, S_DEPART=#{s_depart}, S_PROFESSON=#{s_professon},S_CLASS=#{s_class},S_IMG=#{s_img} WHERE ID=#{id}")
    void updateStu(StudentEntity studentEntity);

    @Delete("DELETE FROM STUDENTENTITY WHERE ID=#{id}")
    void deleteStu(String id);

    @Select("SELECT ID,S_NO,S_DEPART,S_PROFESSON,S_CLASS,S_IMG FROM STUDENTENTITY WHERE ID=#{id}")
    StudentEntity findById(@Param("id")String id);

}
