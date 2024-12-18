package com.example.projectsbcxp.Projects.impl.business;
import com.example.projectsbcxp.Projects.api.to.PersonTO;
import com.example.projectsbcxp.Projects.impl.data.entities.PersonEntity;
import com.example.projectsbcxp.Projects.impl.data.entities.PersonProjectPositionEntity;
import com.example.projectsbcxp.Projects.impl.data.entities.ProjectEntity;
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
    public PersonTO fromPersonProjectPosition(PersonProjectPositionEntity personProjectPositionEntity) {
        return PersonTO.builder()
                .id(personProjectPositionEntity.getPerson().getId())
                .name(personProjectPositionEntity.getPerson().getName())
                .title(personProjectPositionEntity.getPerson().getTitle())
                .build();
    }

}
