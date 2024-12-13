package com.example.projectsbcxp.Projects.impl.data.repository;
import com.example.projectsbcxp.Projects.impl.data.entities.ProjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface ProjectRepository extends JpaRepository<ProjectEntity, Integer>  {
    /**
     * Find all Projects that are active
     *
     * @return all the Projects that have not set a pause date or it is not met yet
     */
    @Query(nativeQuery = true, value = """
    SELECT *
    FROM T_PROJECT
    WHERE starting_at < NOW() AND ending_at >= NOW() AND ending_at IS NULL 
    """)
    List<ProjectEntity> getActiveProjects();
}

