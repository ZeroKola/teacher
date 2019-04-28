package com.faculty.interadmin.service;
<<<<<<< HEAD



import com.faculty.interadmin.dao.StudentDao;

=======
>>>>>>> dev-fengw
import org.apache.ibatis.annotations.Mapper;

import org.springframework.stereotype.Service;
<<<<<<< HEAD



import com.faculty.interadmin.entity.StudentEntity;

import org.springframework.transaction.annotation.Transactional;



import javax.swing.*;

import java.util.List;





@Service


public interface StudentService {





    static void studentService(StudentEntity studentEntity) {

    }





    static List<StudentEntity> findSAll() {

        return null;

    }



    @Transactional

    void addStudent(StudentEntity studentEntity);



    static void updateStudent() {

        updateStudent();

    }



    @Transactional

    void deleteStudent(String s_no);



    StudentEntity findSById(String s_no);



    StudentDao findById(Spring s_no);

=======
>>>>>>> dev-fengw
}