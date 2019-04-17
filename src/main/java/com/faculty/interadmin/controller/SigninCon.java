package com.faculty.interadmin.controller;

import com.faculty.interadmin.entity.SigninEntity;
import com.faculty.interadmin.service.SigninService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)//跨域访问
@RequestMapping(value = "/signin")
public class SigninCon {
    @Autowired
    private SigninService signinService;
    @GetMapping()
        if (start!=null &&end!=null &&sign_type!=null){//按照双时间+type查找
        }else if(start!=null &&end!=null &&sign_type==null){//按照双时间+查找
        }else if(start==null &&end!=null &&sign_type==null){//右时间查找
        }else if(start!=null &&end==null &&sign_type==null){//按照左时间查找
        }else if(start==null &&end==null &&sign_type==null){//查找全部
        }else if(start==null &&end!=null &&sign_type!=null){//左时间+type
        }else if(start!=null &&end==null &&sign_type!=null){//按照右时间+type查找
        }else if(start==null &&end==null &&sign_type!=null){//type查找
        }else{
        }
    }
    @PutMapping()
    public void updateSignin( SigninEntity signinEntity){
        this.signinService.updateSignin(signinEntity);
    }
    @PostMapping()
    public void insertSignin(SigninEntity signinEntity){
        this.signinService.addSignin(signinEntity);
    }
    @DeleteMapping()
    public void deleteById(String sign_id){
        this.signinService.deleteSigninById(sign_id);
    }
}
