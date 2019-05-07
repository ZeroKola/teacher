package com.faculty.interadmin.controller;



import java.util.List;


<<<<<<< HEAD
<<<<<<< HEAD

=======
>>>>>>> dev-fengw
=======
>>>>>>> dev-pjy
import com.faculty.interadmin.entity.StudentEntity;

import com.faculty.interadmin.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
<<<<<<< HEAD

import org.springframework.ui.Model;



=======


>>>>>>> dev-fengw
=======


>>>>>>> dev-pjy
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;






<<<<<<< HEAD


import javax.swing.*;
=======
>>>>>>> dev-fengw





@RestController
<<<<<<< HEAD
<<<<<<< HEAD

=======
>>>>>>> dev-fengw
=======
>>>>>>> dev-pjy
@RequestMapping(value = "/student",method = RequestMethod.GET)

public class StudentCon {

<<<<<<< HEAD
<<<<<<< HEAD
    private final StudentService studentService;

    private com.faculty.interadmin.entity.StudentEntity StudentEntity;
=======


>>>>>>> dev-fengw
=======
>>>>>>> dev-pjy



    @Autowired
<<<<<<< HEAD
<<<<<<< HEAD

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
=======
>>>>>>> dev-pjy

    }


<<<<<<< HEAD

    @RequestMapping("/update")

    public String updateStudent(StudentEntity studentEntity) {

        StudentService.updateStudent();

        return "redirect:/listStu";

    }



    @RequestMapping("/delete")

    public String deleteStudent(com.faculty.interadmin.entity.StudentEntity s_no) {

        StudentService.studentService(s_no);

        return "redirect:/listStu";
=======
>>>>>>> dev-fengw




=======
>>>>>>> dev-pjy

    }

}