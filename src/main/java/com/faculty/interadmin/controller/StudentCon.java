package com.faculty.interadmin.controller;

import java.util.List;

import com.faculty.interadmin.entity.StudentEntity;
import com.faculty.interadmin.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/student",method = RequestMethod.GET)
public class StudentCon {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/listStu")
<<<<<<< HEAD
    public String listStu (Model model) {
        List<StudentEntity> StudentEntity = StudentService.findSAll();
        model.addAttribute( "StudentEntity",StudentEntity);
        return "listStu";
    }


<<<<<<< HEAD
=======
    @RequestMapping("/add")
    public String addStudent(StudentEntity studentEntity) {
        StudentService.studentService((com.faculty.interadmin.entity.StudentEntity) StudentEntity);
        return "redirect:/listStu";
    }

    @RequestMapping("/toUpdate")
    public String toUpdate(Model model, Spring s_no) {
        StudentEntity studentEntity = (com.faculty.interadmin.entity.StudentEntity) studentService.findById(s_no);
        model.addAttribute("StudentEntity", StudentEntity);
        return "/updateStudent";
    }

    @RequestMapping("/update")
    public String updateStudent(StudentEntity studentEntity) {
        StudentService.updateStudent();
        return "redirect:/listStu";
    }

    @RequestMapping("/delete")
    public String deleteStudent(com.faculty.interadmin.entity.StudentEntity s_no) {
        StudentService.studentService(s_no);
        return "redirect:/listStu";


    }
>>>>>>> dev-fengw
}
