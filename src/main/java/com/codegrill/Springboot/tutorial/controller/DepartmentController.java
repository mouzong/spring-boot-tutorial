package com.codegrill.Springboot.tutorial.controller;

import com.codegrill.Springboot.tutorial.entity.Department;
import com.codegrill.Springboot.tutorial.service.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * The type Department controller.
 */
@RestController
@RequestMapping("/api/v1")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

    /**
     * Save department department.
     *
     * @param department the department
     * @return the department
     */
    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department) {
        LOGGER.info("Inside saveDepartment of DepartmentController !");
        return departmentService.saveDepartment(department);
    }

    /**
     * Fetch department list list.
     *
     * @return the list
     */
    @GetMapping("/departments")
    public List<Department> fetchDepartmentList() {
        LOGGER.info("Inside fetchDepartmentList of DepartmentController !");
        return departmentService.fetchDepartmentList();
    }

    /**
     * Fetch department by id department.
     *
     * @param departmentId the department id
     * @return the department
     */
    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId) {
        LOGGER.info("You fetched department with ID: - "+departmentId+", Inside fetchDepartmentById of DepartmentController !");
        return departmentService.fetchDepartmentById(departmentId);
    }

    /**
     * Delete department by id string.
     *
     * @param departmentId the department id
     * @return the string
     */
    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
        departmentService.deleteDepartmentById(departmentId);
        return "Department service deleted successfully";
    }

    /**
     * Update department department.
     *
     * @param departmentId the department id
     * @param department   the department
     * @return the department
     */
    @PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentId, @RequestBody Department department) {
        return departmentService.updateDepartment(departmentId, department);
    }

    /**
     * Fetch department by department name.
     *
     * @param departmentName the department name
     * @return the department
     */
    @GetMapping("/departments/name/{name}")
    public Department fetchDepartmentByName(@PathVariable("name") String departmentName){
        return departmentService.fetchDepartmentByName(departmentName);
    }
}
