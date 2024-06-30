package com.neueda.employee_management.model;


import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Entity
@Data
@Setter
@Getter

public class Employee {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long employee_Id;
    private String first_Name;
    private String last_Name;
    private int age;
    private String gender;
//    @ManyToOne
//    @JoinColumn(name = "dept_ID")
//    private Department department;


    @ManyToOne(fetch = FetchType.LAZY) // Lazy fetch to avoid eager fetching unless needed
    @JoinColumn(name = "dept_ID", referencedColumnName = "dept_ID")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "employees"})
//    avoid issues with lazy loading
    private Department department;


    private String role;
    private String status; // Active or Inactive
    private double salary;
    private LocalDate start_Date;
    private LocalDate end_Date;

    public Employee() {
    }

    public Employee(Long employee_Id, String first_Name, String last_Name, int age, String gender, Department department, String role, String status, double salary, LocalDate start_Date, LocalDate end_Date) {
        this.employee_Id = employee_Id;
        this.first_Name = first_Name;
        this.last_Name = last_Name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.role = role;
        this.status = status;
        this.salary = salary;
        this.start_Date = start_Date;
        this.end_Date = end_Date;
    }
}
