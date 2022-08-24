package com.zinc.controller;


import com.zinc.entity.userEntity;
import com.zinc.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class userController {

    @Autowired
    private userService UsersService;

    @GetMapping("/")
    public List<userEntity> findall() {

        return UsersService.findall();
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