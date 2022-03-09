package com.codegrill.Springboot.tutorial.controller;

import com.codegrill.Springboot.tutorial.entity.Department;
import com.codegrill.Springboot.tutorial.service.DepartmentService;
import com.codegrill.Springboot.tutorial.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("api/v1/departments")
    public Department saveDepartment(@RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }
}
