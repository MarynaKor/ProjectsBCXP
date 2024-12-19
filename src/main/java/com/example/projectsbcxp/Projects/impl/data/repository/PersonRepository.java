package com.example.projectsbcxp.Projects.impl.data.repository;
import com.example.projectsbcxp.Projects.impl.data.entities.PersonEntity;
import com.example.projectsbcxp.Projects.impl.data.entities.PersonProjectPositionEntity;
import com.example.projectsbcxp.Projects.impl.data.entities.ProjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PersonRepository extends JpaRepository<PersonEntity, Integer>   {
    @Query(nativeQuery = true, value = """
    SELECT t_person.*
    FROM t_person
             JOIN t_personprojectposition tppp on t_person.id = tppp.person_id
    WHERE (start_in_project < NOW() AND end_in_project >= NOW()) OR (end_in_project IS NULL  AND start_in_project < NOW());
    """)
    List<PersonEntity> getActivePositionsInProject();
}
