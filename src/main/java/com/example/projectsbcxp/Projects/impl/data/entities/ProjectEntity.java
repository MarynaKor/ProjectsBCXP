package com.example.projectsbcxp.Projects.impl.data.entities;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldNameConstants;

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
    private int active_project_days;

    @OneToMany(mappedBy = "t_project")
    @ToString.Exclude
    @FieldNameConstants.Exclude
    private List<PersonProjectPositionEntity> personProjectPosition;
}