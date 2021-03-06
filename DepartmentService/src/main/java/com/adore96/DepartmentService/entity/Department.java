package com.adore96.DepartmentService.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author kasun_k ON 5/30/21
 * @project DepartmentService
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Departmentid;

    private String departmentname;
    private String departmentadress;
    private String departmentcode;
}
