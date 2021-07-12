package com.adore96.UserService.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author kasun_k ON 6/29/21
 * @project UserService
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInputBean {

    Integer id;
    String username;
    String userpassword;
    String usertelephone;
    String departmentcode;
}
