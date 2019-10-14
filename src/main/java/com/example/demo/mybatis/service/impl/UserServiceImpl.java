package com.example.demo.mybatis.service.impl;

import com.example.demo.mybatis.dao.UserDao;
import com.example.demo.mybatis.entity.UserEntity;
import com.example.demo.mybatis.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description :
 * @Author : zhangyan
 * @Date : 2019/10/14   15:19
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public UserEntity selectUser(String name) {
        log.info("要查询的姓名为:{}",name);
        return userDao.selectUser(name);
    }
}
