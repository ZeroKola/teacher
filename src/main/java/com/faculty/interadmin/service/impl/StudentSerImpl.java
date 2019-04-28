package com.faculty.interadmin.service.impl;
<<<<<<< HEAD


<<<<<<< HEAD

=======
>>>>>>> dev-fengw
=======
>>>>>>> dev-pjy
import com.faculty.interadmin.entity.StudentEntity;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.faculty.interadmin.dao.StudentDao;

import com.faculty.interadmin.service.StudentService;

import org.springframework.transaction.annotation.Transactional;
<<<<<<< HEAD



import javax.swing.*;

<<<<<<< HEAD
=======
>>>>>>> dev-fengw
=======



>>>>>>> dev-pjy
import java.util.List;



@Service
<<<<<<< HEAD
<<<<<<< HEAD

public class StudentSerImpl implements StudentService {

    private com.faculty.interadmin.entity.StudentEntity StudentEntity;
=======

>>>>>>> dev-fengw
=======
>>>>>>> dev-pjy



    @Autowired
<<<<<<< HEAD

<<<<<<< HEAD
    public StudentSerImpl(StudentDao studentDao) {

    }
=======
>>>>>>> dev-fengw



    public List<StudentEntity> findSAll() {
<<<<<<< HEAD

        return  StudentDao.findSAll();
=======
>>>>>>> dev-fengw
=======
>>>>>>> dev-pjy

    }



    @Override
<<<<<<< HEAD
<<<<<<< HEAD

    @Transactional

    public void addStudent(StudentEntity studentEntity) {

        StudentDao.addStudent(StudentEntity);

=======
>>>>>>> dev-fengw
    }


<<<<<<< HEAD



    @Transactional

    public void updateStudent(StudentEntity studentEntity) {

        StudentDao.updateStudent(StudentEntity);

=======
>>>>>>> dev-fengw
=======
>>>>>>> dev-pjy
    }



    @Override
<<<<<<< HEAD
<<<<<<< HEAD

    @Transactional

    public void deleteStudent(String s_no) {

        StudentDao.deleteStudent(s_no);

=======
>>>>>>> dev-fengw
=======
>>>>>>> dev-pjy
    }



<<<<<<< HEAD
    @Override

<<<<<<< HEAD
    public com.faculty.interadmin.entity.StudentEntity findSById(String s_no) {

        return null;
=======

    }






    @Override
>>>>>>> dev-fengw

    }




<<<<<<< HEAD
    public StudentDao findById(Spring s_no) {

        return (StudentDao) StudentDao.findSById(s_no);
=======
>>>>>>> dev-fengw
=======
>>>>>>> dev-pjy

    }











<<<<<<< HEAD
<<<<<<< HEAD
=======





>>>>>>> dev-fengw
=======



>>>>>>> dev-pjy
}