package com.adore96.UserService.repository;

import com.adore96.UserService.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author kasun_k ON 6/29/21
 * @project UserService
 */

public interface UserRepository extends JpaRepository<User, Integer> {

}
