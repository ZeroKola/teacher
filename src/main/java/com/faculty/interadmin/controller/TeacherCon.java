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
    @SuppressWarnings("unchecked")
    @GetMapping(value = "/find")
    public Msg<Rt_teacher>findTByTe_idAndTe_depart(@PathParam("T_id") String T_id, @PathParam("depart") String depart){
        if (T_id==null&&depart!=null){
            return ResultUtil.success(this.teacherService.findTByTe_id(T_id));
        }else if(T_id!=null&&depart==null){
            return ResultUtil.success(this.teacherService.findTByTe_depart(depart));
        }else if(T_id==null&&depart==null){
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