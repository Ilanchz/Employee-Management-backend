package com.neueda.employee_management.repository;

import com.neueda.employee_management.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    // Query to get total employees by dept_ID
    @Query("SELECT d.total_Employees FROM Department d WHERE d.dept_ID = :deptId")
    int findTotalEmployeesByDeptId(Long deptId);
    // Method to find a department by its dept_ID
   
}