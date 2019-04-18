package com.faculty.interadmin.controller;



import java.util.List;



import com.faculty.interadmin.entity.StudentEntity;

import com.faculty.interadmin.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;



import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;



import javax.swing.*;





@RestController

@RequestMapping(value = "/student",method = RequestMethod.GET)

public class StudentCon {

    private final StudentService studentService;

    private com.faculty.interadmin.entity.StudentEntity StudentEntity;



    @Autowired

    public StudentCon(StudentService studentService) {

        this.studentService = studentService;

    }



    @RequestMapping("/listStu")

    public String listStu(Model model) {

        List<StudentEntity> StudentEntity = (List<com.faculty.interadmin.entity.StudentEntity>) StudentService.findSAll();

        model.addAttribute("StudentEntity", StudentEntity);

        return "listStu";

    }



    @RequestMapping("/toAdd")

    public String toAdd() {

        return "/addStudent";

    }



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

}