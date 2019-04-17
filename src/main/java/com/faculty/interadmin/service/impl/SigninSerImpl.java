package com.faculty.interadmin.service.impl;

import com.faculty.interadmin.dao.SigninDao;
import com.faculty.interadmin.entity.SigninEntity;
import com.faculty.interadmin.service.SigninService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SigninSerImpl implements SigninService {
    @Autowired
    private SigninDao signinDao;

    @Override
    public void addSignin(SigninEntity signinEntity) {
        this.signinDao.insertSignin(signinEntity);
    }

    @Override
    public List<Rt_sign> findSigninAll() {
        return  this.signinDao.selectSigninAll();
    }

    @Override
    public List<Rt_sign> findSigninByType(String type) {
        return this.signinDao.selectSigninBytype(type);
    }

    @Override
    public List<Rt_sign> selectSigninBydate(String start, String end) {
        return this.signinDao.selectSigninBydate(start, end);
    }

    @Override
    public List<Rt_sign> selectSigninBydatetype(String start, String end, String type) {
        return this.signinDao.selectSigninBydatetype(start, end, type);
    }

    @Override
    public List<Rt_sign> selectSigninBydateleft(String start) {
        return this.signinDao.selectSigninBydateleft(start);
    }

    @Override
    public List<Rt_sign> selectSigninBydatelefttype(String start, String type) {
        return this.signinDao.selectSigninBydatelefttype(start, type);
    }

    @Override
    public List<Rt_sign> selectSigninBydateright(String end) {
        return this.selectSigninBydateright(end);
    }

    @Override
    public List<Rt_sign> selectSigninBydaterighttype(String end, String type) {
        return this.signinDao.selectSigninBydaterighttype(end, type);
    }

    @Override
    public void updateSignin(SigninEntity signinEntity) {
        this.signinDao.updatesignin(signinEntity);
    }

    @Override
    public void deleteSigninById(String id) {
        this.signinDao.deletesigninById(id);
    }
}
