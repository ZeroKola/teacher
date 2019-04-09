package com.faculty.interadmin.controller;

import com.faculty.interadmin.Another.Msg;
import com.faculty.interadmin.Another.ResultUtil;
import com.faculty.interadmin.Another.Rt_sign;
import com.faculty.interadmin.entity.SigninEntity;
import com.faculty.interadmin.service.SigninService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)//跨域访问
@RequestMapping(value = "/signin")
public class SigninCOn {
    @Autowired
    private SigninService signinService;
    @GetMapping()
    public Msg<Rt_sign> findAllsigninByTypeAndDate(String start, String end, String sign_type){
        if (start!=null &&end!=null &&sign_type!=null){//按照双时间+type查找
            return ResultUtil.success(this.signinService.selectSigninBydatetype(start, end, sign_type));
        }else if(start!=null &&end!=null &&sign_type==null){//按照双时间+查找
            return ResultUtil.success(this.signinService.selectSigninBydate(start, end));
        }else if(start==null &&end!=null &&sign_type==null){//右时间查找
            return ResultUtil.success(this.signinService.selectSigninBydateright( end));
        }else if(start!=null &&end==null &&sign_type==null){//按照左时间查找
            return ResultUtil.success(this.signinService.selectSigninBydateleft(start));
        }else if(start==null &&end==null &&sign_type==null){//查找全部
            return ResultUtil.success(this.signinService.findSigninAll());
        }else if(start==null &&end!=null &&sign_type!=null){//左时间+type
            return ResultUtil.success(this.signinService.selectSigninBydatelefttype(start,sign_type));
        }else if(start!=null &&end==null &&sign_type!=null){//按照右时间+type查找
            return ResultUtil.success(this.signinService.selectSigninBydaterighttype( end,sign_type));
        }else if(start==null &&end==null &&sign_type!=null){//type查找
            return ResultUtil.success(this.signinService.findSigninByType(sign_type));
        }else{
            return ResultUtil.success(null);
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
