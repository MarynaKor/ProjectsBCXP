package com.example.projectsbcxp.Projects.impl.data.entities;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;

@Entity
@Table(name="T_PERSON_PROJECT_POSITION", schema = "PUBLIC")
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
    private Timestamp startInProjectDate;

    @ManyToOne
    @JoinColumn(name = "project_id") //ist das der Name der Column von der anderen Entity?
    private ProjectEntity project;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private PersonEntity person;

}


