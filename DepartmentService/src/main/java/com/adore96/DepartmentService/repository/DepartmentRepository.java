package com.adore96.DepartmentService.repository;

import com.adore96.DepartmentService.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author kasun_k ON 5/30/21
 * @project DepartmentService
 */

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Integer> {
}
