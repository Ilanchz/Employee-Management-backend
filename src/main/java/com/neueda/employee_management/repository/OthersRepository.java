package com.neueda.employee_management.repository;

import com.neueda.employee_management.model.Others;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OthersRepository extends JpaRepository<Others, Long> {
}

