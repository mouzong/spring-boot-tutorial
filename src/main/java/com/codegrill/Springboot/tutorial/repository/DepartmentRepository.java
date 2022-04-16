package com.codegrill.Springboot.tutorial.repository;

import com.codegrill.Springboot.tutorial.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * The interface Department repository.
 */
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    /**
     * Find by department name department.
     *
     * @param departmentName the department name
     * @return the department
     */
    public Department findByDepartmentName(String departmentName);

    /**
     * Find by department name ignore case department.
     *
     * @param departmentName the department name
     * @return the department
     */
    public Department findByDepartmentNameIgnoreCase(String departmentName);
}
