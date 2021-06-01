package com.adore96.DepartmentService.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author kasun_k ON 6/1/21
 * @project DepartmentService
 */

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DepartmentInputBean {

    private int Departmentid;
    private String departmentname;
    private String departmentadress;
    private String departmentcode;
}
