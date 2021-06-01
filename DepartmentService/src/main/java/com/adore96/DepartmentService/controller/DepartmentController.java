package com.adore96.DepartmentService.controller;

import com.adore96.DepartmentService.bean.DepartmentInputBean;
import com.adore96.DepartmentService.entity.Department;
import com.adore96.DepartmentService.repository.DepartmentRepository;
import com.adore96.DepartmentService.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author kasun_k ON 5/30/21
 * @project DepartmentService
 */

@RestController
@Slf4j
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @Autowired
    DepartmentRepository departmentRepository;

    @PostMapping("/")
    public Department departmentList() {
        log.info("using slf4j");

        return null;
    }

    @GetMapping("/get-department/{id}")
    public Department findDepartmentById(@PathVariable String departmentid) {
        log.info("findDepartmentById Controller");
        Department department = new Department();

        departmentService.findDepartmentById(departmentid);


        return null;
    }

    @GetMapping("/save-department")
    public void saveDepartment(@RequestBody DepartmentInputBean departmentInputBean) {
        log.info("SaveDepartment Controller");
        Department department = new Department();
        department = departmentService.saveDepartment(departmentInputBean);

        if (department != null) {
            departmentRepository.save(department);
            log.info("Department saved successfully");
        } else {
            log.info("Unable to save the department");
        }
    }
}

