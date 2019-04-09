package com.faculty.interadmin.controller;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lesson",method = RequestMethod.GET)
public class LessonCon {
     @Autowired
    private UserService userservice;
     @RequestMapping(value="/delete",method ={RequestMethod.GET,RequestMethod.POST})
    public String delete(int no){
         int result=userservice.delete(id);
         if (result>=1){
             return "删除成功";
         }
         else {
             return "删除失败";
         }
     }
     @RequestMapping(value = "/update",method = RequestMethod.POST)
    public User insert(User user){
         return  userservice.insertUser(user);
     }
     @RequestMapping("/ListUser")
    @ResponseBody
    public List<User>ListUser() {
         return userservice.ListUser();
     }
}
