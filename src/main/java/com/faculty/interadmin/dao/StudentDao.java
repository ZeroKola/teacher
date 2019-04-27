package com.faculty.interadmin.dao;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.faculty.interadmin.entity.StudentEntity;


@Mapper

public interface StudentDao{
    List<StudentEntity> findSAll();

    void addStudent(StudentEntity studentEntity);

    void updateStudent(StudentEntity studentEntity);

     void deleteStudent(String id);

    List<StudentEntity> findSById(String s_no);
    List<StudentEntity> findSByClass(String s_class);
    List<StudentEntity> findSByDepart(String s_depart);
    List<StudentEntity> findSByProfession(String s_profession);
}