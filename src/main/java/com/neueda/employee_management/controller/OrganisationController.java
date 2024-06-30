package com.neueda.employee_management.controller;

import com.neueda.employee_management.model.Organisation;
import com.neueda.employee_management.service.OrganisationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/organisation")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class OrganisationController {

    @Autowired
    private OrganisationService organisationService;

    @GetMapping
    public List<Organisation> getAllOrganisations() {
        return organisationService.getAllOrganisations();
    }

    @GetMapping("/{id}")
    public Organisation getOrganisationById(@PathVariable Long id) {
        return organisationService.getOrganisationById(id);
    }

    @PostMapping
    public Organisation createOrganisation(@RequestBody Organisation organisation) {
        return organisationService.saveOrganisation(organisation);
    }

    @PutMapping("/{id}")
    public Organisation updateOrganisation(@PathVariable Long id, @RequestBody Organisation organisation) {
        organisation.setOrganisation_Id(id);
        return organisationService.saveOrganisation(organisation);
    }

    @DeleteMapping("/{id}")
    public void deleteOrganisation(@PathVariable Long id) {
        organisationService.deleteOrganisation(id);
    }
}
