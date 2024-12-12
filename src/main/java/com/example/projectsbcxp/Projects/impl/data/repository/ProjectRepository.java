package com.example.projectsbcxp.Projects.impl.data.repository;
import com.example.projectsbcxp.Projects.impl.data.entities.ProjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProjectRepository extends JpaRepository<ProjectEntity, Integer>  {
}
