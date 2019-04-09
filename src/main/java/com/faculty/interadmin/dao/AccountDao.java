package com.faculty.interadmin.dao;

import com.faculty.interadmin.entity.AccountEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface AccountDao {
    @Select("select * from account")
    List<AccountEntity> findAll();

    @Select("select * from account where account_id=#{account_id}")
    AccountDao getAccountByAccount_id(Integer id);
    @Insert("insert into account(account_id,password,phone,account_type) values(#{account_id},#{password},#{phone},#{account_type})")
    void insertAccount(AccountEntity accountEntity);
    @Update("update account set password=#{password},phone=#{phone},account_type=#{account_type} where account_id=#{account_id}")
    void  updateAccount(AccountEntity accountEntity);
    @Delete("delete from account where account_id=#{account_id}")
    void  deleteAccount(Insert account_id);
}
