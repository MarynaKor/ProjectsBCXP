package com.example.projectsbcxp.Projects.impl.data.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.*;


import javax.xml.stream.Location;
import java.sql.Timestamp;
//no underscore in java only in sql -> Camelcase
@Entity
@Table(name="T_PERSONPROJECTPOSITION")
@Getter
@Setter
@ToString
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
public class PersonProjectPositionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Timestamp start_in_project;
    private Timestamp end_in_project;
    private int days_active;

    @ManyToOne
    @JoinColumn(name = "person_id")
    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    @JsonIdentityReference(alwaysAsId = true)
    private PersonEntity person;

    @ManyToOne
    @JoinColumn(name = "project_id")
    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    @JsonIdentityReference(alwaysAsId = true)//ist das der Name der Column von der anderen Entity?
    private ProjectEntity t_project;


}


