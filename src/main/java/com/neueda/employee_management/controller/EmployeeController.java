package com.neueda.employee_management.controller;

import com.neueda.employee_management.model.Employee;
import com.neueda.employee_management.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }

//    @GetMapping("/department/{dept_ID}")
//    public List<Employee> getEmployeesByDepartmentId(@PathVariable Long dept_ID) {
//        return employeeService.getEmployeesByDepartmentId(dept_ID);
//    }


//    @PostMapping
//    public Employee createEmployee(@RequestBody Employee employee) {
//        return employeeService.saveEmployee(employee);
//    }

    // Endpoint to handle POST requests for creating a new employee
    @PostMapping
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        Employee savedEmployee = employeeService.createEmployee(employee);
        return ResponseEntity.ok(savedEmployee);
    }



    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
        employee.setEmployee_Id(id);
        return employeeService.saveEmployee(employee);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
    }
}
