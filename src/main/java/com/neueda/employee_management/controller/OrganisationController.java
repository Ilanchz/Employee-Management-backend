package com.neueda.employee_management.controller;

import com.neueda.employee_management.model.Employee;
import com.neueda.employee_management.model.Organisation;
import com.neueda.employee_management.service.OrganisationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/organisation")
@CrossOrigin(origins = "*")
public class OrganisationController {

    @Autowired
    private OrganisationService organisationService;

    // Retrieve all organisations
    @GetMapping
    public List<Organisation> getAllOrganisations() {
        return organisationService.getAllOrganisations();
    }

    // Retrieve a single organisation by ID
    @GetMapping("/{id}")
    public Organisation getOrganisationById(@PathVariable Long id) {
        return organisationService.getOrganisationById(id);
    }

    // Create a new organisation
    @PostMapping
    public Organisation createOrganisation(@RequestBody Organisation organisation) {
        return organisationService.saveOrganisation(organisation);
    }

    // Update an existing organisation
    @PutMapping("/{id}")
    public Organisation updateOrganisation(@PathVariable Long id, @RequestBody Organisation organisation) {
        organisation.setCiti_Id(id);
        return organisationService.saveOrganisation(organisation);
    }

    // Delete an organisation by ID
    @DeleteMapping("/{id}")
    public void deleteOrganisation(@PathVariable Long id) {
        organisationService.deleteOrganisation(id);
    }

    @GetMapping("/organisations/{organisationId}/employees")
    public List<Employee> getAllEmployeesByOrganisationId(@PathVariable Long organisationId) {
        return organisationService.getAllEmployeesByOrganisationId(organisationId);
    }
}

