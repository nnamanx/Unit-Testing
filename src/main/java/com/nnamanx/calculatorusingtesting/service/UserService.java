package com.nnamanx.calculatorusingtesting.service;

import com.nnamanx.calculatorusingtesting.exception.UserNotFoundException;
import com.nnamanx.calculatorusingtesting.model.MyUser;
import com.nnamanx.calculatorusingtesting.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static com.nnamanx.calculatorusingtesting.constant.ExceptionMessage.USER_NOT_FOUND;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public MyUser saveUser(MyUser myUser) {

        myUser.setActive(true);
        return userRepository.save(myUser);
    }

    public MyUser getUserByUsername(String username) {


        return userRepository.findByUsername(username).orElseThrow(() -> new UserNotFoundException(USER_NOT_FOUND));
    }


}
