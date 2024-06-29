package com.neueda.employee_management.repository;


import com.neueda.employee_management.model.Organisation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//spring data JPA(Java persistence API, its repository interface provides methods for common crud operations
// without writing the common boilerplate code.
//Spring Data JPA generates the necessary SQL queries based on method names,
// making it easier to write and maintain data access code.


//automatically generates SQL query based on method name
@Repository
public interface OrganisationRepository extends JpaRepository<Organisation, Long> {}
