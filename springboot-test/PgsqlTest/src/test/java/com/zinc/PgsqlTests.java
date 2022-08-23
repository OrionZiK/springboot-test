package com.zinc;


import com.zinc.domain.user;
import com.zinc.mapper.UserMapper;
//import org.junit.jupiter.api.Test;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@SpringBootTest(classes = PgsqlTestApplication.class)
@RunWith(SpringRunner.class)
public class PgsqlTests {
    @Autowired
    UserMapper userMapper;

    @Test
    public void findAllTest(){

        List<user> userList = userMapper.findAll();
        System.out.println(userList);
        user newUser = new user(3,"123458","123456");
        int newId = 1;

//        public List<user> insertT(user newUser) {
//             if (newUser.getId() == null) {  //如果id为空，则为新增
//                return UserMapper.insertT(user);
//             } else {                        //id不为空则是更新
//                return UserMapper.update(user);
//            }
//        }

        UserMapper.insertT(@RequestBody user newUser){
            return UserMapper.insertT(newUser);
        }
    }

}