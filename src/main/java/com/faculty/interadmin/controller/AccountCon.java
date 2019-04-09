package com.faculty.interadmin.controller;

import com.faculty.interadmin.entity.AccountEntity;
import com.faculty.interadmin.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/account",method = RequestMethod.GET)
public class AccountCon {

    @Autowired
    private AccountService accountService;
    @RequestMapping("/findAll")
    public List<AccountEntity> findAll(){
        return  accountService.findAll();
    }
    @RequestMapping("/insertAccount")
    public void  insertAccount(AccountEntity accountEntity){
        accountService.insertAccount(accountEntity);
    };

    @RequestMapping("/updateAccount")
    public void  updateAccount(AccountEntity accountEntity){
        accountService.updateAccount(accountEntity);
    };
    @RequestMapping("/deleteAccount")
    public void  deleteAccount(Integer account_id){
        accountService.deleteAccount(account_id);
    };
}
