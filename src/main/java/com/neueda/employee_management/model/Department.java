package com.neueda.employee_management.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.util.List;
@Setter
@Getter
@Entity
@Data
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long dept_ID;
    private String dept_Name;
    private int total_Employees;
    private double total_Cost;

//    @OneToMany(mappedBy = "department")
//    private List<Employee> employees;

    public Department() {
    }
// using Lombok so no need to define getters and setters
    public Department(long dept_ID, String dept_Name, int total_Employees, double total_Cost) {
        this.dept_ID = dept_ID;
        this.dept_Name = dept_Name;
        this.total_Employees = total_Employees;
        this.total_Cost = total_Cost;
    }

}
