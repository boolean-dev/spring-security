package com.booleandev.security.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.booleandev.security.entity.User;
import com.booleandev.security.mapper.UserMapper;
import com.booleandev.security.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author Jiantao Yan
 * @description: 用户 service impl
 * @title: UserServiceImpl
 * @date 2020/1/23 10:54
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
