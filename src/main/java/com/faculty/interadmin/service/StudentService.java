package com.faculty.interadmin.service;


import org.apache.ibatis.annotations.Mapper;

import org.springframework.stereotype.Service;



import com.faculty.interadmin.entity.StudentEntity;


import java.util.List;





@Mapper


public interface StudentService {





    public void studentService(StudentEntity studentEntity);





     List<StudentEntity> findSAll();




    void addStudent(StudentEntity studentEntity);



     void updateStudent(StudentEntity studentEntity);




     void deleteStudent(String s_no);



    void findSById(String s_no);



}