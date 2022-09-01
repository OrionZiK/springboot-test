package com.zinc.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Dog {
    private String name;
    private Integer age;

}
