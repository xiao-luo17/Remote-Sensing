package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.example.mapper")

public class RemoteSensingApplication {

    public static void main(String[] args) {
        SpringApplication.run(RemoteSensingApplication.class, args);
    }

}