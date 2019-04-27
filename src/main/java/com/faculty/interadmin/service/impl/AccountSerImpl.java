package com.faculty.interadmin.service.impl;


import com.faculty.interadmin.entity.AccountEntity;
import com.faculty.interadmin.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountSerImpl implements AccountService {

    @Override
    public List<AccountEntity> findAccAll() {
        return null;
    }

    @Override
    public AccountEntity getAccountByAccount_id(Integer account_id) {
        return null;
    }

    @Override
    public void insertAccount(AccountEntity account) {

    }

    @Override
    public void updateAccount(AccountEntity accountEntity) {

    }

    @Override
    public void deleteAccount(Integer id) {

    }
}
