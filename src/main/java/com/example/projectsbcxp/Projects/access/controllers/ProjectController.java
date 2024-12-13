package com.example.projectsbcxp.Projects.access.controllers;
import com.example.projectsbcxp.Projects.api.ProjectInterface;
import com.example.projectsbcxp.Projects.api.to.ProjectsTO;
import com.example.projectsbcxp.Projects.impl.data.entities.ProjectEntity;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import java.util.List;



@RestController
@RequestMapping
@AllArgsConstructor
@Slf4j

public class ProjectController {
    private final ProjectInterface projectService;




    @GetMapping
    public List<ProjectsTO> getAllActiveProjects(){
        return projectService.getAllProjects() ;
    }

    @GetMapping("/projects")
    public List<ProjectsTO> getActiveProjects(){
        return projectService.getActiveProjects() ;
    }

    @PostMapping("/projects")
    public ProjectEntity createProjects(@RequestBody ProjectsTO projectsTO){
        return projectService.addProject(projectsTO);
    }

    @GetMapping("/{id}")
    public ProjectsTO getProjectById(@PathVariable int id){
        return projectService.getProjectById(id);
    }

}


