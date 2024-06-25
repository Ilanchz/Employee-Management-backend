package com.neueda.employee_management.repository;

import com.neueda.employee_management.model.HR;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HRRepository extends JpaRepository<HR, Long> {
}

