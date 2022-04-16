package com.codegrill.Springboot.tutorial.service;

import com.codegrill.Springboot.tutorial.entity.Department;

import java.util.List;

/**
 * The interface Department service.
 */
public interface DepartmentService {
    /**
     * Save department department.
     *
     * @param department the department
     * @return the department
     */
    public Department saveDepartment(Department department);

    /**
     * Fetch department list list.
     *
     * @return the list
     */
    public List<Department> fetchDepartmentList();

    /**
     * Fetch department by id department.
     *
     * @param departmentId the department id
     * @return the department
     */
    public Department fetchDepartmentById(Long departmentId);

    /**
     * Delete department by id.
     *
     * @param departmentId the department id
     */
    public void  deleteDepartmentById(Long departmentId);

    /**
     * Update department department.
     *
     * @param departmentId the department id
     * @param department   the department
     * @return the department
     */
    public Department updateDepartment(Long departmentId, Department department);

    /**
     * Fetch department by name department.
     *
     * @param departmentName the department name
     * @return the department
     */
    Department fetchDepartmentByName(String departmentName);
}
