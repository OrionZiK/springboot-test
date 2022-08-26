package com.zinc.controller;


import com.zinc.entity.userEntity;
import com.zinc.mapper.UserXmlMapper;
import com.zinc.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class userController {

    @Autowired
    private userService UsersService;

    @Autowired
    UserXmlMapper userXmlMapper;



    @GetMapping("/findall")
    public List<userEntity> findall() {

        return UsersService.findall();

    }

    @GetMapping("/findall2")
    public List<userEntity> findall2() {

        return UsersService.findall2();

    }

    @PostMapping("/save")
    public Integer save(@RequestBody userEntity entity) {

        return UsersService.save(entity);
    }

    @DeleteMapping("/{id}")
    public Integer delete(@PathVariable Integer id) {
        return UsersService.DELETE(id);
    }
}