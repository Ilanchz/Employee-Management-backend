package com.neueda.employee_management.repository;

import com.neueda.employee_management.model.IT;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITRepository extends JpaRepository<IT, Long> {
}

