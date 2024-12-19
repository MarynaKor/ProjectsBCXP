package com.example.projectsbcxp.Projects.impl.business;

import com.example.projectsbcxp.Projects.api.PersonInterface;
import com.example.projectsbcxp.Projects.api.to.PersonInProjectTO;
import com.example.projectsbcxp.Projects.api.to.PersonTO;
import com.example.projectsbcxp.Projects.api.to.ProjectsTO;
import com.example.projectsbcxp.Projects.impl.data.entities.PersonEntity;
import com.example.projectsbcxp.Projects.impl.data.entities.PersonInProject;
import com.example.projectsbcxp.Projects.impl.data.entities.PersonProjectPositionEntity;
import com.example.projectsbcxp.Projects.impl.data.entities.ProjectEntity;
import com.example.projectsbcxp.Projects.impl.data.repository.PersonInProjectRepo;
import com.example.projectsbcxp.Projects.impl.data.repository.PersonRepository;
import com.example.projectsbcxp.Projects.impl.data.repository.ProjectRepository;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
@Builder
public class PersonService implements PersonInterface {
    private PersonRepository personRepository;
    private PersonMapper personMapper;
    private PersonInProjectRepo personInProjectRepo;

    @Override
    public List<PersonTO> getActivePersons() {
        List<PersonEntity> activePersonsEntity= personRepository.getActivePersons();
        return activePersonsEntity.stream()
                .map(personMapper::fromEntity)
                .toList();
    }

    @Override
    public List<PersonInProjectTO> getActivePositionsInProject(){
        List<PersonProjectPositionEntity> activePersonsEntity= personInProjectRepo.getActivePositionsInProject();
        return activePersonsEntity.stream()
                .map(personMapper::fromActivePersons)
                .toList();
    }
}
