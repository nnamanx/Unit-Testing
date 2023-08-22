package com.nnamanx.calculatorusingtesting.controller;

import com.nnamanx.calculatorusingtesting.model.MyUser;
import com.nnamanx.calculatorusingtesting.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/testing")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;


    @GetMapping("/{username}")
    public ResponseEntity<MyUser> getUserByUsername(@PathVariable String username) {
        
        return userService.getUserByUsername(username);
    }


    @PostMapping
    public ResponseEntity<MyUser> createUser(@RequestBody MyUser user) {

        MyUser createdUser = userService.saveUser(user);
        return ResponseEntity.ok(createdUser);
    }


}
