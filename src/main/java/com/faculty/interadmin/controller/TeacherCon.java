package com.faculty.interadmin.controller;



import java.util.List;


<<<<<<< HEAD

import com.faculty.interadmin.dao.TeacherDao;

<<<<<<< HEAD
import com.faculty.interadmin.entity.TeacherEntity;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;
=======
>>>>>>> dev-fengw
=======
>>>>>>> dev-pjy

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;



import com.faculty.interadmin.service.TeacherService;

<<<<<<< HEAD
=======
>>>>>>> dev-pjy


@RestController

<<<<<<< HEAD
<<<<<<< HEAD
=======

>>>>>>> dev-fengw
=======

>>>>>>> dev-pjy
@RequestMapping(value = "/teacher",method = RequestMethod.GET)

public class TeacherCon {

    @Autowired
<<<<<<< HEAD

    private TeacherService teacherService;

<<<<<<< HEAD


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
=======
>>>>>>> dev-fengw
=======

    }


>>>>>>> dev-pjy
<<<<<<< HEAD
<<<<<<< HEAD

    @RequestMapping("/toUpdate")

    public String toUpdate(Model model, int te_id) {

        TeacherEntity teacherEntity = (TeacherEntity) teacherService.findTByTe_id(te_id);

        model.addAttribute("TeacherEntity", teacherEntity);

        return "/updateTeacher";

    }



    @RequestMapping("/update")

    public String updateTeacher(TeacherEntity teacherEntity) {

        teacherService.updateTeacher((TeacherDao) teacherEntity);

        return "redirect:/listTeacher";

    }



    @RequestMapping("/delete")

    public String deleteTeacher(int te_id) {

        teacherService.deleteTeacher(te_id);

        return "redirect:/listTeacher";
=======
>>>>>>> dev-fengw
=======

    @PostMapping()
    public void findTByTe_id(TeacherEntity teacherEntity) {
        this.teacherService.addTeacher(teacherEntity);
    }

>>>>>>> dev-pjy







<<<<<<< HEAD
<<<<<<< HEAD


=======
>>>>>>> dev-fengw
=======
>>>>>>> dev-pjy
}