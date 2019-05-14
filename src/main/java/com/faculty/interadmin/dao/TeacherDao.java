package com.faculty.interadmin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import com.faculty.interadmin.Another.Rt_teacher;
import com.faculty.interadmin.entity.TeacherEntity;



@Mapper

public interface TeacherDao {


    List<Rt_teacher> findTAll();
    List<Rt_teacher> findTByTe_id(String te_id);
    List<Rt_teacher> findTByTe_depart(String te_depart);

    void insertTeacher (TeacherEntity teacherEntity);

    void updateTeacher(TeacherEntity teacherEntity);

    void deleteTeacher(String te_id);


}