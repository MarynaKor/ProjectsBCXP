package com.example.projectsbcxp.Projects.impl.business;
import com.example.projectsbcxp.Projects.api.to.PersonTO;
import com.example.projectsbcxp.Projects.api.to.PersonInProjectTO;
import com.example.projectsbcxp.Projects.impl.data.entities.PersonEntity;
import com.example.projectsbcxp.Projects.impl.data.entities.PersonInProject;
import com.example.projectsbcxp.Projects.impl.data.entities.PersonProjectPositionEntity;

import jakarta.annotation.Nullable;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.projectsbcxp.tecbase.utils.nullcheck.ReturnNullOnNullParameter;

@Service
@RequiredArgsConstructor
public class PersonMapper {
    @ReturnNullOnNullParameter
    public PersonTO fromEntity(@Nullable PersonEntity person) {
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

    public PersonProjectPositionEntity toPersonProjectPosition(PersonInProjectTO personInProjectTO) {
        assert personInProjectTO != null;
        return PersonProjectPositionEntity.builder()
                .id(personInProjectTO.id())
                .start_in_project(personInProjectTO.startInProjectDate())
                .end_in_project(personInProjectTO.endInProjectDate())
                .days_active(personInProjectTO.daysActive())
                .build();
    }

    @ReturnNullOnNullParameter
    public PersonInProjectTO fromActivePersons (PersonProjectPositionEntity personsActive) {
        return PersonInProjectTO.builder()
                .id((personsActive.getId()))
                .name(personsActive.getPerson().getName())
                .title(personsActive.getPerson().getTitle())
                .startInProjectDate(personsActive.getStart_in_project())
                .endInProjectDate(personsActive.getEnd_in_project())
                .daysActive(personsActive.getDays_active())
                .build();
    }



}
