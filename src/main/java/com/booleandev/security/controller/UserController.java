package com.booleandev.security.controller;

import com.booleandev.security.entity.User;
import com.booleandev.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Jiantao Yan
 * @description: 用户Controller
 * @title: UserController
 * @date 2020/1/23 10:39
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public List<User> list() {
        return userService.list();
    }
}
