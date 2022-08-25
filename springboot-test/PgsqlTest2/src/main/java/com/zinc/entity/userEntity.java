package com.zinc.entity;


import lombok.Data;

@Data

public class userEntity {

    private Integer id;
    private String username;
    private String password;
    private String address;
    private String email;

    public userEntity(int id, String username, String password, String address, String email) {

        this.id = id;
        this.username = username;
        this.password = password;
        this.address = address;
        this.email = email;
    }

    public userEntity() {
    }
}

