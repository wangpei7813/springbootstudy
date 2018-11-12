package com.springboot.study.model;

import lombok.Data;

/**
 * @Author wp
 * @date 2018/11/12 10:25
 */
@Data
public class User {
    private Long id;
    private int age;
    private int sex;
    private String password;
    private String username;
}
