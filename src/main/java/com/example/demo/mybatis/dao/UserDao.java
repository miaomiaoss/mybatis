package com.example.demo.mybatis.dao;

import com.example.demo.mybatis.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Description :
 * @Author : zhangyan
 * @Date : 2019/10/14   11:27
 */
@Mapper
public interface UserDao {

    @Select("select * from t_user where user_name = #{userName}")
    UserEntity selectUser(String user);
}
