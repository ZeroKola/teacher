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

    public List<TeacherDao> findTAll() {
        return (List<TeacherDao>) TeacherDao.findTAll();
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
    public void deleteTeacher(int te_id) {
        teacherDao.deleteTeacher(te_id);
    }

    public TeacherDao findTByTe_id(int te_id) { return (TeacherDao) TeacherDao.findTByTe_id(te_id);
    }

}

