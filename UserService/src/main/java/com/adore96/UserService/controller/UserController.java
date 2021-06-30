package com.adore96.UserService.controller;

import com.adore96.UserService.bean.UserInputBean;
import com.adore96.UserService.entity.User;
import com.adore96.UserService.repository.UserRepository;
import com.adore96.UserService.service.UserService;
import com.adore96.UserService.valueobject.ResponseTypeValueObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author kasun_k ON 6/29/21
 * @project UserService
 */

@Slf4j
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    UserRepository userRepository;

    @GetMapping("/")
    public List<User> userList() {
        log.info("userList Controller");
        List<User> userList = userService.userList();
        return userList;
    }

//    @GetMapping("/get-user/{id}")
//    public User findUserById(@PathVariable int id) {
//        log.info("findUserById Controller");
//        User user = new User();
//        userService.findUserById(id);
//        return user;
//    }

    @GetMapping("/save-user/")
    public String saveUser(@RequestBody UserInputBean userInputBean) {
        log.info("saveUser Controller");
        String status;

        if (userInputBean != null) {
            status = userService.saveUser(userInputBean);
            return status;
        } else {
            return "fail";
        }
    }

    @GetMapping("/get-user/{id}")
    public ResponseTypeValueObject getUserwithDepartment(@PathVariable int id) {
        log.info("getUserwithDepartment Controller");

        return userService.getUserwithDepartment(id);
    }
}
