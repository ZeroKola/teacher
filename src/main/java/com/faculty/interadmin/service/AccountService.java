package com.faculty.interadmin.service;

import com.faculty.interadmin.entity.AccountEntity;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface AccountService {
    List<AccountEntity> findAccAll();
    AccountEntity getAccountByAccount_id(Integer account_id);
    void insertAccount(AccountEntity account);
    void updateAccount(AccountEntity accountEntity);
    void deleteAccount(Integer id);

}
