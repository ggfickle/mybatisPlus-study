package com.hf.mybaitsplus_01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hf.mybaitsplus_01.mapper")
public class Mybaitsplus01Application {

    public static void main(String[] args) {
        SpringApplication.run(Mybaitsplus01Application.class, args);
    }

}
