package com.nnamanx.calculatorusingtesting.service;

import com.nnamanx.calculatorusingtesting.model.MyUser;
import org.springframework.http.ResponseEntity;

public interface UserService {

    MyUser saveUser(MyUser myUser);

    ResponseEntity<MyUser> getUserByUsername(String username);
}
