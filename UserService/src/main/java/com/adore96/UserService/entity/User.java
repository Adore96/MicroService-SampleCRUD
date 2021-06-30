package com.adore96.UserService.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author kasun_k ON 6/29/21
 * @project UserService
 */

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    String username;
    String userpassword;
    String usertelephone;
    String departmentcode;
}
