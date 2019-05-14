package com.faculty.interadmin.controller;



import com.faculty.interadmin.entity.Msg;
import com.faculty.interadmin.entity.ResultUtil;
import com.faculty.interadmin.entity.TeacherEntity;
import com.faculty.interadmin.Another.Rt_teacher;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;


import com.faculty.interadmin.service.TeacherService;

import javax.websocket.server.PathParam;


@RestController

@CrossOrigin(origins = "*", maxAge = 3600)

@RequestMapping(value = "/teacher",method = RequestMethod.GET)

public class TeacherCon {

    @Autowired

    private TeacherService teacherService;
    @GetMapping()
    public Msg<Rt_teacher>findTAllByTe_noAndTe_depart(@PathParam("te_id") String te_id, @PathParam("te_depart") String te_depart){
        if (te_id==null&&te_depart!=null){
            return ResultUtil.success(this.teacherService.findTByTe_id(te_id));
        }else if(te_id!=null&&te_depart==null){
            return ResultUtil.success(this.teacherService.findTByTe_depart(te_depart));
        }else if(te_id==null&&te_depart==null){
            return ResultUtil.success(this.teacherService.findTAll());
        }else{
            return ResultUtil.success(null);
        }
    }

    @PostMapping
    public void insertTeacher(@RequestBody TeacherEntity teacherEntity){
        this.teacherService.addTeacher(teacherEntity);
    }


    @PutMapping()
    public void updateTeacher(TeacherEntity teacherEntity) {

        this.teacherService.updateTeacher(teacherEntity);
    }

    @DeleteMapping()
    public void deleteTeacher(String te_id) {
        this.teacherService.deleteTeacher(te_id);

    }



}