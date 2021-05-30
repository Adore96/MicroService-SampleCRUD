package com.adore96.DepartmentService.service;

import com.adore96.DepartmentService.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.websocket.server.ServerEndpoint;

/**
 * @author kasun_k ON 5/30/21
 * @project DepartmentService
 */

@Service
public class DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;
}
