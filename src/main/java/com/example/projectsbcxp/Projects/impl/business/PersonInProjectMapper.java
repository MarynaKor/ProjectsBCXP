package com.example.projectsbcxp.Projects.impl.business;
import com.example.projectsbcxp.Projects.api.to.PersonTO;
import com.example.projectsbcxp.Projects.api.to.PersonInProjectTO;
import com.example.projectsbcxp.Projects.impl.data.entities.PersonEntity;
import com.example.projectsbcxp.Projects.impl.data.entities.PersonInProject;
import com.example.projectsbcxp.Projects.impl.data.entities.PersonProjectPositionEntity;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.projectsbcxp.tecbase.utils.nullcheck.ReturnNullOnNullParameter;

@Service
@RequiredArgsConstructor
public class PersonInProjectMapper {

    @ReturnNullOnNullParameter
    public PersonInProjectTO fromPersonInProject (PersonInProject personInProject) {
        return PersonInProjectTO.builder()
                .id((personInProject.getId()))
                .name(personInProject.getName())
                .title(personInProject.getTitle())
                .startInProjectDate(personInProject.getStart_in_project())
                .endInProjectDate(personInProject.getEnd_in_project())
                .daysActive(personInProject.getDays_active())
                .build();
    }
}
