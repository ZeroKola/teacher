package com.faculty.interadmin.service;
import com.faculty.interadmin.Another.Rt_Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;
import com.faculty.interadmin.entity.StudentEntity;
import java.util.List;

@Mapper
@Service

public interface StudentService {

    void addStudent(StudentEntity studentEntity);

    List<Rt_Student> findSAll();

    List<Rt_Student> findSById(String s_no);

    List<Rt_Student> findSByClass(String s_class, String depart, String profession);

    List<Rt_Student> findSByDepart(String s_depart);

    List<Rt_Student> findSByProfession(String depart, String s_profession);


    void updateStudent(StudentEntity studentEntity);

    void deleteStudent(String s_no);

}