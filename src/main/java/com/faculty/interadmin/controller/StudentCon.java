package com.faculty.interadmin.controller;



import com.faculty.interadmin.Another.Msg;
import com.faculty.interadmin.Another.ResultUtil;
import com.faculty.interadmin.Another.Rt_sign;
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

    private final StudentService studentService;

    @Autowired
    public StudentCon(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(value = "/find")
    public Msg<Rt_sign> findAllSBy(@PathParam("s_no") String s_no, @PathParam("depart") String depart, @PathParam("s_profession") String profession,
                                   @PathParam("classroom") String classroom)
    {
        if(classroom==null && depart==null && profession==null && s_no!=null){
            return ResultUtil.success(this.studentService.findSById(s_no));
        }
        else if (classroom !=null && depart!=null && profession!=null && s_no==null){
            return ResultUtil.success(this.studentService.findSByClass(classroom,depart,profession));
        }
        else if (classroom ==null && depart!=null && profession==null && s_no==null){
            return ResultUtil.success(this.studentService.findSByDepart(depart));
        }
        else if (classroom ==null && depart!=null && profession!=null && s_no==null){
            return ResultUtil.success(this.studentService.findSByProfession(depart,profession));
        }
        else if(classroom != null && depart != null && profession != null && s_no!=null){
            return ResultUtil.success(this.studentService.findSAll());
        }
        else
        {
            return ResultUtil.success(null);
        }
    }

    @PutMapping(value = "/update")
    public void updateStudent(StudentEntity studentEntity) {
        this.studentService.updateStudent(studentEntity);

    }

    @PostMapping(value = "/add")
    public void addStudent(@RequestBody StudentEntity studentEntity) {
        this.studentService.addStudent(studentEntity);

    }

    @DeleteMapping("/delete")
    public void deleteStudent(String s_no) {
        this.studentService.deleteStudent(s_no);

    }


}