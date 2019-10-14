package com.example.demo.mybatis.service;

import com.example.demo.mybatis.entity.UserEntity;

/**
 * @Description :
 * @Author : zhangyan
 * @Date : 2019/10/14   15:18
 */
public interface UserService {

    UserEntity selectUser(String name);
}
