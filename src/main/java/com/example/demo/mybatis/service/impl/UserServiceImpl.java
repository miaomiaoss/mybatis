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

    /**
     * @Description //TODO 查询
     * @Author zhangyan
     * @Date 2019/10/14 20:31
     * @param: name
     * @return com.example.demo.mybatis.entity.UserEntity
    **/
    @Override
    public UserEntity selectUser(String name) {
        log.info("要查询的姓名为:{}",name);
        return userDao.selectUser(name);
    }

    /**
     * @Description //TODO 添加员工
     * @Author zhangyan
     * @Date 2019/10/14 20:31
     * @param: userEntity
     * @return void
    **/
    @Override
    public void addUser(UserEntity userEntity) {
        Integer insertResult = userDao.insert(userEntity);
        log.info("成功添加了[{}]个员工",insertResult);
    }
}
