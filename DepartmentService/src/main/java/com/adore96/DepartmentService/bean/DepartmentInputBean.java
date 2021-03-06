package com.adore96.DepartmentService.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author kasun_k ON 6/1/21
 * @project DepartmentService
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DepartmentInputBean {

    private int Departmentid;
    private String departmentname;
    private String departmentadress;
    private String departmentcode;
}
