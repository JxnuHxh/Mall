package com.hxh.jdsun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hxh.jdsun.dao")
public class JdsunApplication {

    public static void main(String[] args) {
        SpringApplication.run(JdsunApplication.class, args);
    }

}
