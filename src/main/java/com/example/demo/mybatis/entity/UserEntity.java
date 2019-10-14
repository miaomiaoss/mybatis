package com.example.demo.mybatis.entity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
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

    @TableId(type = IdType.ID_WORKER)
    private Long id;

    @TableField(value = "user_name")
    private String userName;

    private String password;
}
