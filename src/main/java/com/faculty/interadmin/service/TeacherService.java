package com.faculty.interadmin.service;



import java.util.List;



import com.faculty.interadmin.dao.TeacherDao;

import com.faculty.interadmin.entity.TeacherEntity;

import org.apache.ibatis.annotations.Mapper;
<<<<<<< HEAD
<<<<<<< HEAD

import org.springframework.stereotype.Service;



@Service



public interface TeacherService {

    List<TeacherEntity> findTAll();



    void addTeacher(TeacherDao teacherDao);



    void updateTeacher(TeacherDao teacherDao);



    void deleteTeacher(int te_id);



    TeacherDao findTByTe_id(int te_id);

=======
>>>>>>> dev-fengw
=======

@Mapper
public interface TeacherService {
    public void teacherService(TeacherEntity teacherEntity);
    List<TeacherEntity> findTAll();
    List<TeacherEntity> findTByTe_id(String te_id);
    List<TeacherEntity> findTByTe_depart(String te_depart);
    void addTeacher(TeacherEntity teacherEntity);
    void updateTeacher(TeacherEntity teacherEntity);
    void deleteTeacher(String te_id);
>>>>>>> dev-pjy
}