package com.nnamanx.calculatorusingtesting.service;

import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserServiceTesting {


    private final UserService userService;

    public UserServiceTesting(UserService userService) {
        this.userService = userService;
    }
}
