package com.faculty.interadmin.service.impl;



import java.util.List;

import com.faculty.interadmin.dao.TeacherDao;
import com.faculty.interadmin.Another.Rt_teacher;
import com.faculty.interadmin.entity.TeacherEntity;
import com.faculty.interadmin.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TeacherSerImpl implements TeacherService {

    @Autowired
    private TeacherDao teacherDao;


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

    public List<Rt_teacher> findTByTe_id(String T_id) {

        return this.teacherDao.findTByTe_id(T_id);

    }

    @Override

    public List<Rt_teacher> findTByTe_depart(String depart) {

        return this.teacherDao.findTByTe_depart(depart);

    }
}

