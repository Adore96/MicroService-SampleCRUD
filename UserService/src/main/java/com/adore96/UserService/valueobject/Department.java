package com.adore96.UserService.valueobject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author kasun_k ON 6/30/21
 * @project UserService
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    private int Departmentid;
    private String departmentname;
    private String departmentadress;
    private String departmentcode;
}
