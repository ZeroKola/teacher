package com.faculty.interadmin.controller;

import java.util.List;

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
    public String listStu (Model model) {
        List<StudentEntity> StudentEntity = StudentService.findAll();
        model.addAttribute("StudentEntitys", StudentEntitys);
        return "listStu";
    }


}
