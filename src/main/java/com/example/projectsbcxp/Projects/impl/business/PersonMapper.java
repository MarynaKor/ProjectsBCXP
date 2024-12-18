package com.example.projectsbcxp.Projects.impl.business;
import com.example.projectsbcxp.Projects.api.to.PersonTO;
import com.example.projectsbcxp.Projects.api.to.PersonInProjectTO;
import com.example.projectsbcxp.Projects.impl.data.entities.PersonEntity;
import com.example.projectsbcxp.Projects.impl.data.entities.PersonProjectPositionEntity;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.projectsbcxp.tecbase.utils.nullcheck.ReturnNullOnNullParameter;

@Service
@RequiredArgsConstructor
public class PersonMapper {
    @ReturnNullOnNullParameter
    public PersonTO fromEntity(PersonEntity person) {
        return PersonTO.builder()
                .id(person.getId())
                .name(person.getName())
                .title(person.getTitle())
                .build();
    }
    @ReturnNullOnNullParameter
    public PersonEntity toEntity(PersonTO person) {
        return PersonEntity.builder()
                .name(person.name())
                .title(person.title())
                .build();
    }

    @ReturnNullOnNullParameter
    public PersonInProjectTO fromPersonProjectPosition(PersonProjectPositionEntity personProjectPositionEntity) {
        return PersonInProjectTO.builder()
                .id(personProjectPositionEntity.getPerson().getId())
                .name(personProjectPositionEntity.getPerson().getName())
                .title(personProjectPositionEntity.getPerson().getTitle())
                .startInProjectDate(personProjectPositionEntity.getStart_in_project())
                .endInProjectDate(personProjectPositionEntity.getEnd_in_project())
                .daysActive(personProjectPositionEntity.getDays_active())
                .build();
    }

}
