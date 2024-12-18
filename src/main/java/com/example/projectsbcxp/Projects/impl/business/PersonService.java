package com.example.projectsbcxp.Projects.impl.business;

import com.example.projectsbcxp.Projects.api.PersonInterface;
import com.example.projectsbcxp.Projects.api.to.PersonInProjectTO;
import com.example.projectsbcxp.Projects.api.to.ProjectsTO;
import com.example.projectsbcxp.Projects.impl.data.entities.PersonProjectPositionEntity;
import com.example.projectsbcxp.Projects.impl.data.entities.ProjectEntity;
import com.example.projectsbcxp.Projects.impl.data.repository.PersonRepository;
import com.example.projectsbcxp.Projects.impl.data.repository.ProjectRepository;

import java.util.List;


public class PersonService implements PersonInterface {
    private PersonRepository personRepository;
    private PersonMapper personMapper;


    public List<PersonInProjectTO> getActivePersons() {
        List<PersonProjectPositionEntity> activePersonsEntity= personRepository.getActivePositionsInProject();
        return activePersonsEntity.stream()
                .map(personMapper::fromPersonProjectPosition)
                .toList();
    }
}
