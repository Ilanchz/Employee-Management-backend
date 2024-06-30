package com.neueda.employee_management.service;

import com.neueda.employee_management.model.*;
import com.neueda.employee_management.repository.*;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentRepository departmentRepository; // Assuming you have a DepartmentRepository

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

//    public List<Employee> getEmployeesByDepartmentId(Long dept_ID) {
//        return employeeRepository.findByDepartmentDeptId(dept_ID);
//    }


    @Transactional
    public Employee createEmployee(Employee employee) {
        // Fetch the Department based on dept_ID from database
        // Department department = departmentRepository.findById(employee.getDepartment().getDept_ID())
        //         .orElseThrow(() -> new IllegalArgumentException("Department not found"));

        // // Set the fetched Department object to the Employee
        // employee.setDepartment(department);

        // Save the Employee
        return employeeRepository.save(employee);
    }


    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}
