package com.example.projectsbcxp.Projects.impl.data.entities;
import jakarta.persistence.*;
import lombok.*;


@Data
    @Entity
    @Table(name="T_PERSON")
    @Getter
    @Setter
    @ToString
    @Builder
    @RequiredArgsConstructor
    @AllArgsConstructor
    public class PersonEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private String name;
        private String title;
    }
