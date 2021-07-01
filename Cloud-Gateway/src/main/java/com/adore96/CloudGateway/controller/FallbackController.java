package com.adore96.CloudGateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kasun_k ON 6/30/21
 * @project Cloud-Gateway
 */

@RestController
public class FallbackController {

    @GetMapping("/userservice-fallback")
    public String userServiceFallback() {
        return "UserService is Taking longer than expected.";
    }

    @GetMapping("/departmentservice-fallback")
    public String departmentServiceFallback() {
        return "DepartmentService is Taking longer than expected.";
    }
}
