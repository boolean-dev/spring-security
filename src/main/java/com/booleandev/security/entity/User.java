package com.booleandev.security.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

/**
 * @author Jiantao Yan
 * @description: 用户
 * @title: User
 * @date 2020/1/23 10:40
 */
@Data
@TableName("tb_user")
@ToString
public class User {

    private Long id;

    private String name;

    private int age;

    private int gender;
}
