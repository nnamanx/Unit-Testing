package com.nnamanx.calculatorusingtesting.service;

import com.nnamanx.calculatorusingtesting.model.MyUser;
import com.nnamanx.calculatorusingtesting.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.mockito.Mockito.when;
import static org.springframework.test.util.AssertionErrors.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class UserServiceTesting {

    private final UserService userService;
    private final UserRepository userRepository;

    public UserServiceTesting(UserService userService, UserRepository userRepository) {
        this.userService = userService;
        this.userRepository = userRepository;
    }

    @Test
    public void testGetUserByUsername() {

        String username = "Laman";

        MyUser user = new MyUser();
        user.setUsername(username);


        when(userRepository.findByUsername(username)).thenReturn(Optional.of(user));

        MyUser dbUsername = userService.getUserByUsername(username).getBody();

        assertNotNull("The user does not exist!", dbUsername); //checking whether the value is null

        assertEquals("The message", username, dbUsername.getUsername());

    }

    @Test
    public void testSaveUser() {
        MyUser user = new MyUser();
        user.setUsername("Laman");

        when(userRepository.save(user)).thenReturn(user);

        MyUser createdUser = userService.saveUser(user);

        assertTrue("The message2", createdUser.isActive());

    }


}
