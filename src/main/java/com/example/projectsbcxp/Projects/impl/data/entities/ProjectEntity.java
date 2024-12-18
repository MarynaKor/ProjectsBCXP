package com.example.projectsbcxp.Projects.impl.data.entities;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name="t_project")
@Getter
@Setter
@ToString
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
public class ProjectEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String description;
    private Timestamp starting_at;
    private Timestamp ending_at;
    @OneToMany(mappedBy = "t_project")
    @ToString.Exclude
    private List<PersonProjectPositionEntity> personProjectPosition;
}