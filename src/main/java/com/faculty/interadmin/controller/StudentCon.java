package com.faculty.interadmin.controller;



import java.util.List;


import com.faculty.interadmin.Another.Msg;
import com.faculty.interadmin.Another.ResultUtil;
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

    private com.faculty.interadmin.entity.StudentEntity studentEntity;



    @Autowired

    public StudentService studentService;

    @GetMapping()
    public Msg<StudentEntity> findAllSBy(@PathParam("s_no") String s_no, @PathParam("s_depart") String s_depart, @PathParam("s_profession") String s_profession,
                                         @PathParam("s_class") String s_class)
    {
        if(s_class==null && s_depart==null && s_profession==null && s_no!=null){
            return ResultUtil.success(this.studentService.findSById(s_no));
        }
        else if (s_class !=null && s_depart!=null && s_profession!=null && s_no==null){
            return ResultUtil.success(this.studentService.findSByClass(s_class));
        }
        else if (s_class ==null && s_depart!=null && s_profession==null && s_no==null){
            return ResultUtil.success(this.studentService.findSByDepart(s_depart));
        }
        else if (s_class ==null && s_depart!=null && s_profession!=null && s_no==null){
            return ResultUtil.success(this.studentService.findSByProfession(s_profession));
        }
        else if(s_class !=null && s_depart!=null && s_profession!=null && s_no !=null){
            return ResultUtil.success(this.studentService.findSAll());
        }
        else
        {
            return ResultUtil.success(null);
        }
    }

    @PutMapping()
    public void updateStudent(StudentEntity studentEntity) {
        this.studentService.updateStudent(studentEntity);

    }

    @PostMapping()
    public void addStudent(@RequestBody StudentEntity studentEntity) {
        this.studentService.addStudent(studentEntity);

    }

    @DeleteMapping()
    public void deleteStudent(String s_no) {
        this.studentService.deleteStudent(s_no);

    }

}