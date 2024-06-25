package com.neueda.employee_management.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Data


public class Organisation {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long Citi_Id;
    private String name;
    private String location;
    private int total_Employees;
    private double total_Cost;

    public Organisation() {
    }

    public Organisation(Long Citi_Id, String name, String location, int total_Employees, double total_Cost) {
        this.Citi_Id = Citi_Id;
        this.name = name;
        this.location = location;
        this.total_Employees = total_Employees;
        this.total_Cost = total_Cost;
    }
}
