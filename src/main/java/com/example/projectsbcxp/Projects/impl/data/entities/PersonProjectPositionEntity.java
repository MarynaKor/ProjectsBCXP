package com.example.projectsbcxp.Projects.impl.data.entities;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;


@Data
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
        @JoinColumn(name = "project_id")
        private ProjectEntity project;

        @ManyToOne
        @JoinColumn(name = "person_id")
        private PersonEntity person;

    }


