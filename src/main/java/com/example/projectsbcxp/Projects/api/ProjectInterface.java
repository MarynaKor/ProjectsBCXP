package com.example.projectsbcxp.Projects.api;
import com.example.projectsbcxp.Projects.api.to.ProjectsTO;
import com.example.projectsbcxp.Projects.impl.data.entities.ProjectEntity;

import java.util.List;

public interface ProjectInterface {


    List<ProjectsTO> getActiveProjects();
    ProjectEntity addProject(ProjectsTO project);
}
