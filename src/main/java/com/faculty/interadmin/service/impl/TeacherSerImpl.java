package com.faculty.interadmin.service.impl;

import java.util.List;

import com.faculty.interadmin.dao.TeacherDao;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.faculty.interadmin.entity.TeacherEntity;
import com.faculty.interadmin.service.TeacherService;
import org.springframework.transaction.annotation.Transactional;


@Service
public class TeacherSerImpl {
    @Resource
    private TeacherDao teacherDao;
    private TeacherEntity teacher;

    public List<TeacherDao> findAll() {
<<<<<<< HEAD
<<<<<<< HEAD
        return TeacherDao.findTAll();
=======
        return (List<TeacherDao>) TeacherDao.findTAll();
>>>>>>> dev-pjy
=======
        return TeacherDao.findTAll();
>>>>>>> dev-fengw
    }

    @Transactional
    public void addTeacher(TeacherDao teacherDao) {
        teacherDao.addTeacher(teacher);
    }

    @Transactional
    public void updateTeacher(TeacherDao teacherDao) {
        teacherDao.updateTeacher(teacher);
    }

    @Transactional
    public void deleteTeacher(int id) {
        teacherDao.deleteTeacher(id);
    }

<<<<<<< HEAD
<<<<<<< HEAD
    public TeacherDao findTById(int id) {
        return (TeacherDao) TeacherDao.findTById(id);
=======
    public TeacherDao findTById(int id) { return (TeacherDao) TeacherDao.findTById(id);
>>>>>>> dev-pjy
=======
    public TeacherDao findTById(int id) {
        return (TeacherDao) TeacherDao.findTById(id);
>>>>>>> dev-fengw
    }

}

