package com.neueda.employee_management.service;

import com.neueda.employee_management.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
//    List<Employee> getEmployeesByDepartmentId(Long dept_ID);
    Employee getEmployeeById(Long id);
    Employee saveEmployee(Employee employee);
    void deleteEmployee(Long id);
}
