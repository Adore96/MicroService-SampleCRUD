package com.adore96.UserService.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author kasun_k ON 6/29/21
 * @project UserService
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserInputBean {

    Integer id;
    String username;
    String userpassword;
    String usertelephone;
    String departmentcode;
}
