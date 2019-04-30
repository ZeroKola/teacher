package com.faculty.interadmin.service.impl;
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


    @Autowired

    public StudentDao studentDao;

    public List<StudentEntity> findSAll() {
        System.out.println(this.studentDao.findSAll());
        return this.studentDao.findSAll();

    }

    @Override
    public List<StudentEntity> findSById(String s_no) {
        return this.studentDao.findSById(s_no);
    }

    @Override
    public List<StudentEntity> findSByClass(String s_class) {
        return this.studentDao.findSByClass(s_class);
    }

    @Override
    public List<StudentEntity> findSByDepart(String s_depart) {
        return this.studentDao.findSByDepart(s_depart);
    }

    @Override
    public List<StudentEntity> findSByProfession(String s_profession) {
        return this.studentDao.findSByProfession(s_profession);
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
