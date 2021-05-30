package com.adore96.DepartmentService.controller;

import com.adore96.DepartmentService.entity.Department;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @author kasun_k ON 5/30/21
 * @project DepartmentService
 */

@RestController
@Slf4j
@RequestMapping("/departments")
public class DepartmentController {

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department) {
        log.info("using slf4j");
        return null;
    }

@GetMapping("/get-department/{id}")
    public Department findDepartmentById(@PathVariable String departmentid) {
        log.info("adevd");
        return null;
    }
}

