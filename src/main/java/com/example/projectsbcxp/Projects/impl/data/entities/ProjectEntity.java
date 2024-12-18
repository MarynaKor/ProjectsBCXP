package com.example.projectsbcxp.Projects.impl.data.entities;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.util.List;

@Data
@Entity
@Table(name="T_PROJECT")
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
    @OneToMany
    @ToString.Exclude
    private List<PersonProjectPositionEntity> personProjectPosition;
}