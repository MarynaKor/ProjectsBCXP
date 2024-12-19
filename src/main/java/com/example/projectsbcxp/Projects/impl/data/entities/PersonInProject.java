package com.example.projectsbcxp.Projects.impl.data.entities;

import jakarta.persistence.Id;
import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@ToString
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
public class PersonInProject {
    @Id
    private int id;
    private String name;
    private String title;
    private Timestamp start_in_project;
    private Timestamp end_in_project;
    private int days_active;

}
