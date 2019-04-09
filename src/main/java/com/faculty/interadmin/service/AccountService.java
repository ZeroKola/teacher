package com.faculty.interadmin.service;

import com.faculty.interadmin.entity.AccountEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Mapper
public interface AccountService {
    List<AccountEntity> findAll();
    AccountEntity getAccountByAccount_id(Integer account_id);
    void insertAccount(AccountEntity account);
    void updateAccount(AccountEntity accountEntity);
    void deleteAccount(Integer id);
}
