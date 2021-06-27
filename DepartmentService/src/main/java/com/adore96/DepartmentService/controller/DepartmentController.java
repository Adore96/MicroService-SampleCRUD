package com.adore96.DepartmentService.controller;

import com.adore96.DepartmentService.bean.DepartmentInputBean;
import com.adore96.DepartmentService.entity.Department;
import com.adore96.DepartmentService.repository.DepartmentRepository;
import com.adore96.DepartmentService.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author kasun_k ON 5/30/21
 * @project DepartmentService
 */

@Slf4j
@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @Autowired
    DepartmentRepository departmentRepository;

    @PostMapping("/")
    public List<Department> departmentList() {
        log.info("departmentList Controller");
        List<Department> departmentList = departmentService.departmentList();
        return departmentList;
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable int departmentid) {
        log.info("findDepartmentById Controller");
        Department department = new Department();
        departmentService.findDepartmentById(departmentid);
        return department;
    }

    @GetMapping("/")
    public String saveDepartment(@RequestBody DepartmentInputBean departmentInputBean) {
        log.info("SaveDepartment Controller");
        Department department = departmentService.saveDepartment(departmentInputBean);

        if (department != null) {
            log.info("Department saved successfully");
            departmentRepository.save(department);
            return "saved";
        } else {
            log.info("Unable to save the department");
            return "";
        }
    }
}

