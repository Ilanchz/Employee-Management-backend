package com.neueda.employee_management.service;

import com.neueda.employee_management.model.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> getAllDepartments();
    Department getDepartmentById(Long id);
    Department saveDepartment(Department department);
    Department updateDepartment(Long id, Department department);
    void deleteDepartment(Long id);
}
