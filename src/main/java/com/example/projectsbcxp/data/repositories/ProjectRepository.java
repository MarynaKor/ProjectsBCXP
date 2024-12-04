package com.example.projectsbcxp.data.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.projectsbcxp.data.entities.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer>  {
}
