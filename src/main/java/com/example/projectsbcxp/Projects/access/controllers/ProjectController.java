package com.example.projectsbcxp.Projects.access.controllers;
import com.example.projectsbcxp.Projects.api.ProjectInterface;
import com.example.projectsbcxp.Projects.api.to.ProjectsTO;
import com.example.projectsbcxp.Projects.impl.business.ProjectsMapper;
import com.example.projectsbcxp.Projects.impl.business.ProjectsService;
import com.example.projectsbcxp.Projects.impl.data.repository.ProjectRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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


}


