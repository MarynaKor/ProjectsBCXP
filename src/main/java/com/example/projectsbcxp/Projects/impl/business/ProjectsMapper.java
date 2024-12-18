package com.example.projectsbcxp.Projects.impl.business;
import com.example.projectsbcxp.Projects.api.to.ProjectsTO;
import com.example.projectsbcxp.Projects.api.to.PersonInProjectTO;
import com.example.projectsbcxp.Projects.impl.data.entities.ProjectEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.projectsbcxp.tecbase.utils.nullcheck.ReturnNullOnNullParameter;

@Service
@RequiredArgsConstructor
public class ProjectsMapper {

    private final PersonMapper personMapper;
    @ReturnNullOnNullParameter
    public ProjectsTO fromEntity(ProjectEntity project) {
        return ProjectsTO.builder()
                .id(project.getId())
                .title(project.getTitle())
                .description(project.getDescription())
                .starting_at(project.getStarting_at())
                .ending_at(project.getEnding_at())
                .active_project_days(project.getActive_project_days())
                .personen(project.getPersonProjectPosition().stream()
                        .map(personMapper::fromPersonProjectPosition)
                        .toList())

                .build();
    }

    @ReturnNullOnNullParameter
    public ProjectEntity toEntity(ProjectsTO project) {
        return ProjectEntity.builder()
                .title(project.title())
                .description(project.description())
                .starting_at(project.starting_at())
                .ending_at(project.ending_at())
                .build();
    }



}
