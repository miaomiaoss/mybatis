package com.example.demo.mybatis.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @Description :
 * @Author : zhangyan
 * @Date : 2019/10/14   15:20
 */
@Data
@TableName("t_user")
public class UserEntity implements Serializable {

    private Integer id;

    private String userName;

    private String password;
}
