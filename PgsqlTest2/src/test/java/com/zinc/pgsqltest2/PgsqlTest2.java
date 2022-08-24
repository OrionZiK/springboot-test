package com.zinc.pgsqltest2;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = PgsqlTest2Application.class)
@RunWith(SpringRunner.class)
class PgsqlTest2 {


    @Test
    static void contextLoads() {
    }
//    @Test
//    public void findALLTest() {
//        List<userEntity> userList = userService.findall();
//        System.out.println(userList);
//    }


}
