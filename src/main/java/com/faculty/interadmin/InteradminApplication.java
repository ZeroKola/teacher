package com.faculty.interadmin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.faculty.interadmin.dao")
public class InteradminApplication {

    public static void main(String[] args) {
        SpringApplication.run( InteradminApplication.class, args );
    }

}
