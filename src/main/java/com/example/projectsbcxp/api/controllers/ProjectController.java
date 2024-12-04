package com.example.projectsbcxp.api.controllers;
import com.example.projectsbcxp.data.repositories.ProjectRepository;
import com.example.projectsbcxp.data.entities.Project;
import org.springframework.web.bind.annotation.*;
import java.lang.Iterable;


@RestController
public class ProjectController {
    private final ProjectRepository projectRepository;
    public ProjectController(final ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @GetMapping("/projects")
    public Iterable<Project> getAllProjects() {
        return this.projectRepository.findAll();
    }

    @PostMapping("/projects")
    public Project createNewProject(@RequestBody Project project) {
        return this.projectRepository.save(project);
    }
}


