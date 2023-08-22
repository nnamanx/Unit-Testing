package com.nnamanx.calculatorusingtesting.service;

import com.nnamanx.calculatorusingtesting.exception.UserNotFoundException;
import com.nnamanx.calculatorusingtesting.model.MyUser;
import com.nnamanx.calculatorusingtesting.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static com.nnamanx.calculatorusingtesting.constant.ExceptionMessage.USER_NOT_FOUND;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;


    @Override
    public MyUser saveUser(MyUser myUser) {

        myUser.setActive(true);
        return userRepository.save(myUser);
    }

    @Override
    public ResponseEntity<MyUser> getUserByUsername(String username) {
        try {
            Optional<MyUser> bookData = userRepository.findByUsername(username);

            if (bookData.isPresent()) {
                return new ResponseEntity<>(bookData.get(), HttpStatus.OK);
            }
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

//    @Override
//    public MyUser getUserByUsername(String username) {
//
//        return userRepository.findByUsername(username);
//    }

//    @Override
//    public MyUser getUserByUsername(String username) {
//        Optional<MyUser> optionalUser = userRepository.findByUsername(username);
//        return optionalUser.orElseThrow(() -> new UserNotFoundException(USER_NOT_FOUND));
//    }




}
