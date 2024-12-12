package com.example.projectsbcxp.Projects.api;
import com.example.projectsbcxp.Projects.api.to.ProjectsTO;
import java.util.List;

public interface ProjectInterface {


    List<ProjectsTO> getActiveProjects();
    ProjectsTO addProject(ProjectsTO project);
}
