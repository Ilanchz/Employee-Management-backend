package com.neueda.employee_management.repository;

import com.neueda.employee_management.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
//    List<Employee> findByDepartmentDeptId(Long dept_ID);
}
