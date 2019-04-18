package com.faculty.interadmin.service;

import com.faculty.interadmin.Another.Rt_sign;
import com.faculty.interadmin.entity.SigninEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
public interface SigninService {
    public void addSignin(SigninEntity signinEntity);
    List<Rt_sign> findSigninAll();
    List<Rt_sign> findSigninByType(String type);
    //date
    List<Rt_sign> selectSigninBydate(String start,String end);
    List<Rt_sign> selectSigninBydatetype(String start,String end,String type);
    List<Rt_sign> selectSigninBydateleft(String start);
    List<Rt_sign> selectSigninBydatelefttype(String start,String type);
    List<Rt_sign> selectSigninBydateright(String end );
    List<Rt_sign> selectSigninBydaterighttype(String end,String type);
    //
    void updateSignin(SigninEntity signinEntity);
    void deleteSigninById(String id);
}
