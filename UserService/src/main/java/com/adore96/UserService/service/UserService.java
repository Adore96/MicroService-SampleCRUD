package com.adore96.UserService.service;

import com.adore96.UserService.bean.UserInputBean;
import com.adore96.UserService.entity.User;
import com.adore96.UserService.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author kasun_k ON 6/29/21
 * @project UserService
 */

@Slf4j
@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> userList() {
        log.info("userList Service Method");
        List<User> userList = userRepository.findAll();
        return userList;
    }

    public User findUserById(int id) {
        log.info("findUserById Service Method");
        User user = userRepository.findById(id).orElse(null);
        return user;
    }

    public String saveUser(UserInputBean userInputBean) {
        User user = new User();
        log.info("saveUser Service Method");

        if (userInputBean != null) {
            user.setUsername(userInputBean.getUsername());
            user.setUserpassword(userInputBean.getUserpassword());
            user.setUsertelephone(userInputBean.getUsertelephone());
            user.setDepartmentcode(userInputBean.getDepartmentcode());


            userRepository.save(user);
            return "sucess";
        } else {
            return "fail";
        }
    }
}
