package com.faculty.interadmin.service.impl;



import java.util.List;

import com.faculty.interadmin.dao.TeacherDao;
import com.faculty.interadmin.Another.Rt_teacher;
import com.faculty.interadmin.entity.TeacherEntity;
import com.faculty.interadmin.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class TeacherSerImpl implements TeacherService {

    @Autowired

    public TeacherDao teacherDao;


    public List<Rt_teacher> findTAll() {
        System.out.println(this.teacherDao.findTAll());
        return this.teacherDao.findTAll();

    }


    @Override

    public void addTeacher(TeacherEntity teacherEntity) {

        this.teacherDao.insertTeacher(teacherEntity);

    }


    @Override
    public void updateTeacher(TeacherEntity teacherEntity) {

        this.teacherDao.updateTeacher(teacherEntity);

    }


    @Override

    public void deleteTeacher(String te_id) {

        this.teacherDao.deleteTeacher(te_id);

    }


    @Override

    public List<Rt_teacher> findTByTe_id(String te_id) {

        return this.teacherDao.findTByTe_id(te_id);

    }

    @Override

    public List<Rt_teacher> findTByTe_depart(String te_depart) {

        return this.teacherDao.findTByTe_depart(te_depart);

    }
}

