package com.adore96.UserService.service;

import com.adore96.UserService.bean.UserInputBean;
import com.adore96.UserService.entity.User;
import com.adore96.UserService.repository.UserRepository;
import com.adore96.UserService.valueobject.Department;
import com.adore96.UserService.valueobject.ResponseTypeValueObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author kasun_k ON 6/29/21
 * @project UserService
 */

@Slf4j
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

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
            user.setDepartmentid(userInputBean.getDepartmentcode());


            userRepository.save(user);
            return "sucess";
        } else {
            return "fail";
        }
    }

    public ResponseTypeValueObject getUserwithDepartment(int id) {
        log.info("getUserwithDepartment Service Method");
        User user = userRepository.findById(id).orElse(null);
        ResponseTypeValueObject responseTypeValueObject = new ResponseTypeValueObject();

        Department department = restTemplate.getForObject("http://localhost:8090/departments/get-department/" + user.getDepartmentid(), Department.class);

        responseTypeValueObject.setDepartment(department);
        responseTypeValueObject.setUser(user);
        return responseTypeValueObject;
    }
}
