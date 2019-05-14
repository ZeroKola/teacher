package com.faculty.interadmin.dao;
import java.util.List;

import com.faculty.interadmin.Another.Rt_Student;
import org.apache.ibatis.annotations.*;
import com.faculty.interadmin.entity.StudentEntity;


@Mapper

public interface StudentDao{
    List<Rt_Student> findSAll();

    void addStudent(StudentEntity studentEntity);

    void updateStudent(StudentEntity studentEntity);

    void deleteStudent(String id);

    List<Rt_Student> findSById(String s_no);
    List<Rt_Student> findSByClass(String s_class,String s_depart,String s_profession);
    List<Rt_Student> findSByDepart(String s_depart);
    List<Rt_Student> findSByProfession(String s_profession,String s_depart);
}