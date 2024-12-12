package com.example.projectsbcxp.Projects.access.controllers;
import com.example.projectsbcxp.Projects.api.ProjectInterface;
import com.example.projectsbcxp.Projects.api.to.ProjectsTO;
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




    @GetMapping("/projects")
    public List<ProjectsTO> getAllActiveProjects(){
        return projectService.getActiveProjects() ;
    }

    @PostMapping("/projects")
    public ProjectsTO createProjects(@RequestBody ProjectsTO projectsTO){
        return projectService.addProject(projectsTO);
    }


}


