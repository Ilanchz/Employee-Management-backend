package com.neueda.employee_management.service;

import com.neueda.employee_management.model.Organisation;

import java.util.List;

public interface OrganisationService {
    List<Organisation> getAllOrganisations();

    Organisation getOrganisationById(Long id);

    Organisation saveOrganisation(Organisation organisation);

    void deleteOrganisation(Long id);
}
