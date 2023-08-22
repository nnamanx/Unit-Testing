package com.nnamanx.calculatorusingtesting.service;

import com.nnamanx.calculatorusingtesting.model.MyUser;
import com.nnamanx.calculatorusingtesting.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public MyUser saveUser(MyUser myUser) {

        myUser.setActive(true);
        return userRepository.save(myUser);
    }

    
}
