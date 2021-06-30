package com.adore96.UserService.valueobject;

import com.adore96.UserService.entity.User;
import lombok.Data;

/**
 * @author kasun_k ON 6/30/21
 * @project UserService
 */

@Data
public class ResponseTypeValueObject {

    private User user;
    private Department department;
}
