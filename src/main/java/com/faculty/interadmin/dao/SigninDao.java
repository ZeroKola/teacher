package com.faculty.interadmin.dao;

import com.faculty.interadmin.entity.SigninEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SigninDao {
    void insertSignin(SigninEntity signinEntity);
    List<Rt_sign> selectSigninAll();
    List<Rt_sign> selectSigninBydate(String start,String end);
    List<Rt_sign> selectSigninBydatetype(String start,String end,String type);
    List<Rt_sign> selectSigninBydateleft(String start);
    List<Rt_sign> selectSigninBydatelefttype(String start,String type);
    List<Rt_sign> selectSigninBydateright(String end );
    List<Rt_sign> selectSigninBydaterighttype(String end,String type);
    List<Rt_sign>selectSigninBytype(String type);
    void updatesignin(SigninEntity signinEntity);
    void deletesigninById(String id);
}
