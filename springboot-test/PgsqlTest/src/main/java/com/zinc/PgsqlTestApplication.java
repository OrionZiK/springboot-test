package com.zinc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.zinc.mapper")
public class PgsqlTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(PgsqlTestApplication.class, args);
    }

}
