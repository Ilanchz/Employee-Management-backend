package com.neueda.employee_management.model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Getter
@Setter
public class HR extends Department {
    private int numberOfRecruitments;
    private int employeeSatisfactionIndex;
}
