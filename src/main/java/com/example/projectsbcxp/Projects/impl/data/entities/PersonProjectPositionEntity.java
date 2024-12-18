package com.example.projectsbcxp.Projects.impl.data.entities;

import jakarta.persistence.*;
import lombok.*;


import java.sql.Timestamp;

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
    private Timestamp startInProjectDate;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private PersonEntity person;

    @ManyToOne
    @JoinColumn(name = "project_id") //ist das der Name der Column von der anderen Entity?
    private ProjectEntity t_project;


}


