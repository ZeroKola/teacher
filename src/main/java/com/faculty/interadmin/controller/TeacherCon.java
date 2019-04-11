package com.faculty.interadmin.controller;

import java.util.List;

import com.faculty.interadmin.dao.TeacherDao;
import com.faculty.interadmin.entity.TeacherEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.faculty.interadmin.service.TeacherService;

@RestController
@RequestMapping(value = "/teacher",method = RequestMethod.GET)
public class TeacherCon {
<<<<<<< HEAD
    @Autowired
    private TeacherService teacherService;

    @RequestMapping("/listTeacher")
    public String listUser(Model model) {
        List<TeacherEntity> teacherEntities = (List<com.faculty.interadmin.entity.TeacherEntity>)teacherService.findTAll();
        model.addAttribute("TeacherEntity", teacherEntities);
        return "listTeacher";
    }

    @RequestMapping("/toAdd")
    public String toAdd() {
        return "/addTeacher";
    }

    @RequestMapping("/add")
    public String addUser(TeacherEntity teacherEntity) {
        teacherService.addTeacher((TeacherDao) teacherEntity);
        return "redirect:/listTeacher";
    }

    @RequestMapping("/toUpdate")
    public String toUpdate(Model model, int id) {
        TeacherEntity teacherEntity = (TeacherEntity) teacherService.findTById(id);
        model.addAttribute("TeacherEntity", teacherEntity);
        return "/updateTeacher";
    }

    @RequestMapping("/update")
    public String updateTeacher(TeacherEntity teacherEntity) {
        teacherService.updateTeacher((TeacherDao) teacherEntity);
        return "redirect:/listTeacher";
    }

    @RequestMapping("/delete")
    public String deleteTeacher(int id) {
        teacherService.deleteTeacher(id);
        return "redirect:/listTeacher";
    }




}
