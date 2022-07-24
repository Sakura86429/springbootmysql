package com.zhj.springbootmysql;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

@MapperScan("com.zhj.springbootmysql")
public class SpringbootmysqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootmysqlApplication.class, args);
    }

}
