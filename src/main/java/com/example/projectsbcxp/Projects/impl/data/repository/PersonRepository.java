package com.example.projectsbcxp.Projects.impl.data.repository;
import com.example.projectsbcxp.Projects.impl.data.entities.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<PersonEntity, Integer>   {
}
