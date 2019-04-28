package com.faculty.interadmin.service.impl;



import java.util.List;



import com.faculty.interadmin.dao.TeacherDao;
<<<<<<< HEAD
<<<<<<< HEAD

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

=======
>>>>>>> dev-fengw
=======
>>>>>>> dev-pjy
import com.faculty.interadmin.entity.TeacherEntity;

import com.faculty.interadmin.service.TeacherService;
<<<<<<< HEAD
<<<<<<< HEAD
=======



>>>>>>> dev-fengw
=======
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;

>>>>>>> dev-pjy

import org.springframework.transaction.annotation.Transactional;





@Service
<<<<<<< HEAD
<<<<<<< HEAD

public class TeacherSerImpl {

    @Resource

    private TeacherDao teacherDao;

    private TeacherEntity teacher;



    public List<TeacherDao> findTAll() {

        return (List<TeacherDao>) TeacherDao.findTAll();

    }



    @Transactional

    public void addTeacher(TeacherDao teacherDao) {

        teacherDao.addTeacher(teacher);
=======
>>>>>>> dev-fengw
=======
@Transactional
class TeacherSerlmpl implements TeacherService {

    private com.faculty.interadmin.entity.TeacherEntity teacherEntity;


    @Autowired

    public TeacherDao teacherDao;


    @Override
    public void teacherService(com.faculty.interadmin.entity.TeacherEntity teacherEntity) {

    }

    public List<TeacherEntity> findTAll() {
        System.out.println(this.teacherDao.findTAll());
        return this.teacherDao.findTAll();

    }


    @Override

    public void addTeacher(TeacherEntity teacherEntity) {

        this.teacherDao.addTeacher(teacherEntity);
>>>>>>> dev-pjy

    }


<<<<<<< HEAD
<<<<<<< HEAD

    @Transactional

    public void updateTeacher(TeacherDao teacherDao) {

        teacherDao.updateTeacher(teacher);
=======
>>>>>>> dev-fengw
=======
    @Override
    public void updateTeacher(TeacherEntity teacherEntity) {

        this.teacherDao.updateTeacher(teacherEntity);
>>>>>>> dev-pjy

    }


<<<<<<< HEAD
<<<<<<< HEAD

    @Transactional

    public void deleteTeacher(int te_id) {

        teacherDao.deleteTeacher(te_id);
=======
>>>>>>> dev-fengw
=======
    @Override

    public void deleteTeacher(String te_id) {

        this.teacherDao.deleteTeacher(te_id);
>>>>>>> dev-pjy

    }


<<<<<<< HEAD
<<<<<<< HEAD

    public TeacherDao findTByTe_id(int te_id) { return (TeacherDao) TeacherDao.findTByTe_id(te_id);

    }

=======
>>>>>>> dev-fengw

=======
    @Override

    public List<TeacherEntity> findTByTe_id(String te_id) {

        return this.teacherDao.findTByTe_id(te_id);

    }

    @Override

    public List<TeacherEntity> findTByTe_depart(String te_depart) {

        return this.teacherDao.findTByTe_depart(te_depart);

    }
}
>>>>>>> dev-pjy

}