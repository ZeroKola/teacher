package com.faculty.interadmin.service.impl;



import java.util.List;



import com.faculty.interadmin.dao.TeacherDao;
<<<<<<< HEAD

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

=======
>>>>>>> dev-fengw
import com.faculty.interadmin.entity.TeacherEntity;

import com.faculty.interadmin.service.TeacherService;
<<<<<<< HEAD
=======



>>>>>>> dev-fengw

import org.springframework.transaction.annotation.Transactional;





@Service
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

    }


<<<<<<< HEAD

    @Transactional

    public void updateTeacher(TeacherDao teacherDao) {

        teacherDao.updateTeacher(teacher);
=======
>>>>>>> dev-fengw

    }


<<<<<<< HEAD

    @Transactional

    public void deleteTeacher(int te_id) {

        teacherDao.deleteTeacher(te_id);
=======
>>>>>>> dev-fengw

    }


<<<<<<< HEAD

    public TeacherDao findTByTe_id(int te_id) { return (TeacherDao) TeacherDao.findTByTe_id(te_id);

    }

=======
>>>>>>> dev-fengw


}