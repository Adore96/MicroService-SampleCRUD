package com.adore96.DepartmentService.service;

import com.adore96.DepartmentService.bean.DepartmentInputBean;
import com.adore96.DepartmentService.entity.Department;
import com.adore96.DepartmentService.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        List<Department> departmentList = departmentRepository.findAll();
        return departmentList;
    }

    public Department findDepartmentById(int departmentid) {
        log.info("FindDepartmentById Service Method");
        Department department = departmentRepository.findById(departmentid).orElse(null);
        return department;
    }

    public Department saveDepartment(DepartmentInputBean departmentInputBean) {
        Department department = new Department();
        log.info("SaveDepartment Service Method");
        if (departmentInputBean != null) {
            department.setDepartmentid(departmentInputBean.getDepartmentid());
            department.setDepartmentcode(departmentInputBean.getDepartmentcode());
            department.setDepartmentname(departmentInputBean.getDepartmentname());
            department.setDepartmentadress(departmentInputBean.getDepartmentadress());
        } else {
            department = null;
        }
        return department;
    }
}
