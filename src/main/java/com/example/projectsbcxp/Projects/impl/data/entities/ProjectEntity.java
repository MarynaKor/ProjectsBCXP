package com.example.projectsbcxp.Projects.impl.data.entities;
import jakarta.persistence.*;
import lombok.*;

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

}