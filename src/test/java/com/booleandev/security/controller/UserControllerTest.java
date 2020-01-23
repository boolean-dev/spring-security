package com.booleandev.security.controller;

import com.booleandev.security.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@Slf4j
@SpringBootTest
class UserControllerTest {

    @Autowired
    private UserController userController;
    @Test
    void list() {
        List<User> list = userController.list();
        list.forEach(user -> log.info(user.toString()));
    }
}