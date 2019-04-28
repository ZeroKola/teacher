package com.faculty.interadmin.dao;
<<<<<<< HEAD



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

=======

>>>>>>> dev-fengw




@Mapper
<<<<<<< HEAD

public interface StudentDao{
=======
>>>>>>> dev-fengw


<<<<<<< HEAD



    @Select("SELECT ID,S_NO,S_DEPART,S_PROFESSION,S_CLASS,S_IMG,S_FEATURE FROM student")

    static List<StudentEntity> findSAll() {

        return null;

    }



    @Insert("INSERT INTO SENTENTIAL(ID,S_NO,S_DEPART,S_PROFESSION,S_CLASS,S_IMG,S_FEATURE)VALUES(#{ID}, #{S_NO}, #{S_DEPART},#{S_PROFESSION},#{S_CLASS},#{S_IMG},#{S_FEATURE})")

    static void addStudent(StudentEntity studentEntity) {



    }



    @Update("UPDATE SENTENTIAL SET ID=#{id}, S_DEPART=#{s_depart}, S_PROFESSION=#{s_profession},S_CLASS=#{s_class},S_IMG=#{s_img},S_FEATURE=#{s_feature} WHERE S_NO=#{s_no}")

    static void updateStudent(StudentEntity studentEntity) {



    }



    @Delete("DELETE FROM student WHERE S_NO=#{s_no}")

    static void deleteStudent(String id) {



    }



    @Select("SELECT ID,S_NO,S_DEPART,S_PROFESSION,S_CLASS,S_IMG,S_FEATURE FROM student WHERE S_NO=#{s_no}")

    static StudentEntity findSById(@Param("s_no") Spring s_no) {

        return null;

    }



=======
>>>>>>> dev-fengw
}