package com.neueda.employee_management.service;



import com.neueda.employee_management.model.Organisation;
import com.neueda.employee_management.repository.OrganisationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class OrganisationServiceImpl implements OrganisationService {
    @Autowired
    private OrganisationRepository organisationRepository;

    @Override
    public List<Organisation> getAllOrganisations() {
        return organisationRepository.findAll();
    }

    @Override
    public Organisation getOrganisationById(Long id) {
        return organisationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Organisation not found with id " + id));
    }

    @Override
    public Organisation saveOrganisation(Organisation organisation) {
        return organisationRepository.save(organisation);
    }

    @Override
    public void deleteOrganisation(Long id) {
        organisationRepository.deleteById(id);
    }
}
