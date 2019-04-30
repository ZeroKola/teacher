package com.faculty.interadmin.service;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;
import com.faculty.interadmin.entity.StudentEntity;
import java.util.List;

@Mapper


public interface StudentService {

    public void addStudent(StudentEntity studentEntity);

    List<StudentEntity> findSAll();

    List<StudentEntity> findSById(String s_no);

    List<StudentEntity> findSByClass(String s_class);

    List<StudentEntity> findSByDepart(String s_depart);

    List<StudentEntity> findSByProfession(String s_profession);


    void updateStudent(StudentEntity studentEntity);

    void deleteStudent(String s_no);

}