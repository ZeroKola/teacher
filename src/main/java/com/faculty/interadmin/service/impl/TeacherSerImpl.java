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

    public List<TeacherDao> findAll() {
        return TeacherDao.findAll();
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

    public TeacherDao findById(int id) {
        return TeacherDao.findById(id);
    }

}

