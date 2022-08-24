package com.zinc.pgsqltest2;

import com.zinc.entity.userEntity;
import com.zinc.service.userService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.junit.Test;
import java.util.List;

@SpringBootApplication
public class PgsqlTest2Application {

    public static void main(String[] args) {
        SpringApplication.run(PgsqlTest2Application.class, args);
//        public void findALLTest() {
//            List<userEntity> userList = userService.findall();
//            System.out.println(userList);
//        }

    }
    @Test
    public void findALLTest() {
        List<userEntity> userList = userService.findall();
        System.out.println(userList);
    }

}
