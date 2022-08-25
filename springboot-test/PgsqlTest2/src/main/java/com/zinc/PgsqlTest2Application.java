package com.zinc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping
@SpringBootApplication
@MapperScan(basePackages = "com.zinc.mapper")
public class PgsqlTest2Application {

    public static void main(String[] args) {
        SpringApplication.run(PgsqlTest2Application.class, args);

//            List<userEntity> userList = userService.findall();
//            System.out.println(userList);


    }
//    @Test
//    public void findALLTest() {
//        List<userEntity> userList = userService.findall();
//        System.out.println(userList);
//    }




}
