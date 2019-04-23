package com.faculty.interadmin.service;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Mapper
public interface LessonService<credit, team, name, number, classroom> {
    /*public void addLesson(String[] args);
    Scanner in=new Scanner(System.in);

    System.out.println("请输入课程编号");
    int number =in.nextInt();

    System.out.println("请输入课程名称");
    String name =in.nextLine();

   System.out.println("请输入学期");
    int team =in.nextInt();

   System.out.println("请输入学分");
    int credit =in.nextInt();

   System.out.println("请输入教室");
    String calssroom =in.nextLine();

    System.out.println("请输入任课教师");
    String teacher =in.nextLine();

*/
    public void addNo();
    List<Lesson> selectNonall();
    List<Lesson> selectNoBydateAll(String start,String end);
    List<Lesson> selectNoBydatetype(String start,int end,String type);
    List<Lesson> selectNoBydate(String start);
    List<Lesson> selectNoBydatetype(String start,String type);
    List<Lesson>selectNoBytype(String type);
    void updateNo();
    void deleteNo();

    public void addName();
    List<Lesson> selectNamenall();
    List<Lesson> selectNameBydateAll(String start,String end);
    List<Lesson> selectNameBydatetype(String start,String end,String type);
    List<Lesson> selectNameBydate(String start);
    List<Lesson> selectNameBydatetype(String start,String type);
    List<Lesson>selectNameBytype(String type);
    void updateName();
    void deleteName();

    public void addTime();
    List<Lesson> selectTimenall();
    List<Lesson> selectTimeBydateAll(String start,String end);
    List<Lesson> selectTimeBydatetype(String start,String end,String type);
    List<Lesson> selectTimeBydate(String start);
    List<Lesson> selectTimeBydatetype(String start,String type);
    List<Lesson>selectTimeBytype(String type);
    void updateTime();
    void deleteTime();

    public void addClassroom();
    List<Lesson> selectClassroomnall();
    List<Lesson> selectClassroomBydateAll(String start,String end);
    List<Lesson> selectClassroomBydatetype(String start,String end,String type);
    List<Lesson> selectClassroomBydate(String start);
    List<Lesson> selectClassroomBydatetype(String start,String type);
    List<Lesson>selectClassroomBytype(String type);
    void updateClassroom();
    void deleteClassroom();

    public void addTeacher();
    List<Lesson> selectTeachernall();
    List<Lesson> selectTeacherBydateAll(String start,String end);
    List<Lesson> selectTeacherBydatetype(String start,String end,String type);
    List<Lesson> selectTeacherBydate(String start);
    List<Lesson> selectTeacherBydatetype(String start,String type);
    List<Lesson>selectTeacherBytype(String type);
    void updateTeacher();
    void deleteTeacher();

    public void addPrograme();
    List<Lesson> selectProgramenall();
    List<Lesson> selectProgrameBydateAll(String start,String end);
    List<Lesson> selectProgrameBydatetype(String start,String end,String type);
    List<Lesson> selectProgrameBydate(String start);
    List<Lesson> selectProgrameBydatetype(String start,String type);
    List<Lesson>selectProgrameBytype(String type);
    void updatePrograme();
    void deletePrograme();

    public void addClass();
    List<Lesson> selectClassnall();
    List<Lesson> selectClassBydateAll(String start,String end);
    List<Lesson> selectClassBydatetype(String start,String end,String type);
    List<Lesson> selectClassBydate(String start);
    List<Lesson> selectClassBydatetype(String start,String type);
    List<Lesson>selectClassBytype(String type);
    void updateClass();
    void deleteClass();

    public void addSdw();
    List<Lesson> selectSdwnall();
    List<Lesson> selectSdwBydateAll(String start,String end);
    List<Lesson> selectSdwBydatetype(String start,String end,String type);
    List<Lesson> selectSdwBydate(String start);
    List<Lesson> selectSdwBydatetype(String start,String type);
    List<Lesson>selectSdwBytype(String type);
    void updateSdw();
    void deleteSdw();
}









