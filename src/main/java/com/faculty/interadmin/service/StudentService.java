package com.faculty.interadmin.service;
<<<<<<< HEAD


<<<<<<< HEAD

import com.faculty.interadmin.dao.StudentDao;

=======
>>>>>>> dev-fengw
=======
>>>>>>> dev-pjy
import org.apache.ibatis.annotations.Mapper;

import org.springframework.stereotype.Service;
<<<<<<< HEAD





import com.faculty.interadmin.entity.StudentEntity;

<<<<<<< HEAD
import org.springframework.transaction.annotation.Transactional;



import javax.swing.*;
=======
>>>>>>> dev-pjy

import java.util.List;





<<<<<<< HEAD
@Service
=======
@Mapper
>>>>>>> dev-pjy


public interface StudentService {





<<<<<<< HEAD
    static void studentService(StudentEntity studentEntity) {

    }
=======
    public void studentService(StudentEntity studentEntity);

>>>>>>> dev-pjy




<<<<<<< HEAD

    static List<StudentEntity> findSAll() {

        return null;

    }



    @Transactional
=======
     List<StudentEntity> findSAll();



>>>>>>> dev-pjy

    void addStudent(StudentEntity studentEntity);



<<<<<<< HEAD
    static void updateStudent() {

        updateStudent();

    }



    @Transactional

    void deleteStudent(String s_no);



    StudentEntity findSById(String s_no);



    StudentDao findById(Spring s_no);

=======
>>>>>>> dev-fengw
=======
     void updateStudent(StudentEntity studentEntity);




     void deleteStudent(String s_no);



    void findSById(String s_no);



>>>>>>> dev-pjy
}