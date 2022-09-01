package com.zinc.pgsqltest2;

import com.zinc.PgsqlTest2Application;
import com.zinc.entity.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = PgsqlTest2Application.class)
@RunWith(SpringRunner.class)
class PgsqlTest2 {


    @Autowired
    private Person person;

    @Test
    void contextLoads(){

        System.out.println(person);

    }
}
