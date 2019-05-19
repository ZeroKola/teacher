package com.faculty.interadmin.service.impl;
import com.faculty.interadmin.Another.Rt_Student;
import com.faculty.interadmin.entity.StudentEntity;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.faculty.interadmin.dao.StudentDao;
import com.faculty.interadmin.service.StudentService;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;



@Service
@Transactional
public class StudentSerImpl implements StudentService {


    private final StudentDao studentDao;

    @Autowired
    public StudentSerImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public List<Rt_Student> findSAll() {
        System.out.println(this.studentDao.findSAll());
        return this.studentDao.findSAll();

    }

    @Override
    public List<Rt_Student> findSById(String s_no) {
        return this.studentDao.findSById(s_no);
    }

    @Override
    public List<Rt_Student> findSByClass(String s_class, String depart, String profession) {
        return this.studentDao.findSByClass(s_class,depart,profession);
    }

    @Override
    public List<Rt_Student> findSByDepart(String s_depart) {
        return this.studentDao.findSByDepart(s_depart);
    }

    @Override
    public List<Rt_Student> findSByProfession(String depart, String s_profession) {
        return this.studentDao.findSByProfession(depart,s_profession);
    }

    @Override

    public void addStudent(StudentEntity studentEntity) {

        this.studentDao.addStudent(studentEntity);

    }
    @Override
    public void updateStudent(StudentEntity studentEntity) {

        this.studentDao.updateStudent(studentEntity);

    }
    @Override

    public void deleteStudent(String s_no) {

        this.studentDao.deleteStudent(s_no);

    }
}