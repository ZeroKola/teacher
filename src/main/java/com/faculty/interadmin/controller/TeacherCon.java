package com.faculty.interadmin.controller;



import java.util.List;



import com.faculty.interadmin.dao.TeacherDao;

import com.faculty.interadmin.entity.StudentEntity;
import com.faculty.interadmin.entity.TeacherEntity;

import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;



import com.faculty.interadmin.service.TeacherService;



@RestController

@CrossOrigin(origins = "*", maxAge = 3600)

@RequestMapping(value = "/teacher",method = RequestMethod.GET)

public class TeacherCon {

    @Autowired

    private TeacherService teacherService;

    @GetMapping()
    public void addTeacher(TeacherEntity teacherEntity){
        this.teacherService.addTeacher(teacherEntity);
    }


    @PutMapping()
    public void updateTeacher(TeacherEntity teacherEntity) {

        this.teacherService.updateTeacher(teacherEntity);

    }


    @PostMapping()
    public void findTAll(@RequestBody TeacherEntity teacherEntity) {
        this.teacherService.addTeacher(teacherEntity);
    }

    @PostMapping()
    public void findTByTe_id(TeacherEntity teacherEntity) {
        this.teacherService.addTeacher(teacherEntity);
    }

    @DeleteMapping()
    public void deleteTeacher(String te_id) {
        this.teacherService.deleteTeacher(te_id);

    }







}