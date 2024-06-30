package com.neueda.employee_management.model;


import jakarta.persistence.*;
//formerly known as Java persistence API, Entity-Relationship Mapping: Allows developers to
// map Java objects to database tables and vice versa using annotations (@Entity, @Table, @Column, etc.).
//CRUD Operations: Provides methods and annotations (@PersistenceContext, EntityManager)
// for performing CRUD operations (Create, Read, Update, Delete) on entities.

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


//Lombok is a library for Java that helps reduce boilerplate code in Java classes,
// such as getters, setters, constructors, and more.


@Setter
@Getter
@Entity
@Data


public class Organisation {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long Organisation_Id;
    private String name;
    private String location;
    private int total_Employees;
    private double total_Cost;

    public Organisation() {
    }

    public Organisation(Long Organisation_Id, String name, String location, int total_Employees, double total_Cost) {
        this.Organisation_Id = Organisation_Id;
        this.name = name;
        this.location = location;
        this.total_Employees = total_Employees;
        this.total_Cost = total_Cost;
    }
}
