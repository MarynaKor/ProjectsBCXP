package com.example.projectsbcxp.Projects.impl.data.repository;
import com.example.projectsbcxp.Projects.impl.data.entities.PersonProjectPositionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PersonInProjectRepo extends JpaRepository<PersonProjectPositionEntity,Integer>{
    @Query(nativeQuery = true, value = """
    SELECT t_personprojectposition.*
    FROM t_personprojectposition
             JOIN t_person on t_person.id = t_personprojectposition.person_id
    WHERE (start_in_project < NOW() AND end_in_project >= NOW()) OR (end_in_project IS NULL  AND start_in_project < NOW())
    """)
    List<PersonProjectPositionEntity> getActivePositionsInProject();
}
