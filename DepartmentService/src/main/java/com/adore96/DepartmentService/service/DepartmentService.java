package com.adore96.DepartmentService.service;

import com.adore96.DepartmentService.bean.DepartmentInputBean;
import com.adore96.DepartmentService.entity.Department;
import com.adore96.DepartmentService.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author kasun_k ON 5/30/21
 * @project DepartmentService
 */

@Slf4j
@Service
public class DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;


    public List<Department> departmentList() {
        log.info("DepartmentList Service Method");

        return null;
    }

    public Department findDepartmentById(@PathVariable String departmentid) {
        log.info("FindDepartmentById Service Method");

        return null;
    }

    public Department saveDepartment(DepartmentInputBean departmentInputBean) {
        Department department = new Department();
        log.info("SaveDepartment Service Method");
        if (departmentInputBean != null) {
            department.setDepartmentid(departmentInputBean.getDepartmentid());
            department.setDepartmentcode(department.getDepartmentcode());
            department.setDepartmentname(department.getDepartmentname());
            department.setDepartmentadress(department.getDepartmentadress());
        } else {
            department = null;
        }

        return department;
    }
}
