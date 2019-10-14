package com.example.demo.mybatis.controller;

import com.example.demo.mybatis.entity.UserEntity;
import com.example.demo.mybatis.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description :
 * @Author : zhangyan
 * @Date : 2019/10/14   15:29
 */
@Slf4j
@RestController
@RequestMapping
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/selectUser")
    public UserEntity selectUser(@RequestParam("name") String name){
        log.info("需要查询name为:{}",name);
        return userService.selectUser(name);
    }

}
