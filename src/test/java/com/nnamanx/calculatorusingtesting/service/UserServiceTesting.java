package com.nnamanx.calculatorusingtesting.service;

import com.nnamanx.calculatorusingtesting.model.MyUser;
import com.nnamanx.calculatorusingtesting.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.mockito.Mockito.when;
import static org.springframework.test.util.AssertionErrors.assertEquals;
import static org.springframework.test.util.AssertionErrors.assertNotNull;

@SpringBootTest
public class UserServiceTesting {

    private final UserService userService;
    private final UserRepository userRepository;

    public UserServiceTesting(UserService userService, UserRepository userRepository) {
        this.userService = userService;
        this.userRepository = userRepository;
    }

    @Test
    public void TestGetUserByUsername() {

        String username = "Laman";

        MyUser user = new MyUser();
        user.setName(username);


        when(userRepository.findByUsername(username)).thenReturn(Optional.of(user));

        MyUser dbUsername = userService.getUserByUsername(username);

        assertNotNull("The user does not exist!", dbUsername); //checking whether the value is null

        assertEquals("The message", username, dbUsername.getName());

    }


}
