package com.faculty.interadmin.controller;



import java.util.List;


import com.faculty.interadmin.entity.SigninEntity;
import com.faculty.interadmin.entity.StudentEntity;

import com.faculty.interadmin.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;
import javax.websocket.server.PathParam;





@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping(value = "/student",method = RequestMethod.GET)

public class StudentCon {

    private com.faculty.interadmin.entity.StudentEntity StudentEntity;



    @Autowired

    public StudentService studentService;

    @GetMapping()
    public void addStudent(StudentEntity studentEntity){
        this.studentService.addStudent(studentEntity);
    }


    @PutMapping()
    public void updateStudent(StudentEntity studentEntity) {

        this.studentService.updateStudent(studentEntity);

    }


    @PostMapping()
    public void findSAll(@RequestBody StudentEntity studentEntity) {
        this.studentService.addStudent(studentEntity);
    }

    @PostMapping()
    public void findSById(StudentEntity studentEntity) {
        this.studentService.addStudent(studentEntity);
    }

    @DeleteMapping()
    public void deleteStudent(String s_no) {
        this.studentService.deleteStudent(s_no);

    }

}