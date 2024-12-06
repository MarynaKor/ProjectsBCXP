package com.example.projectsbcxp.data.entities;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="T_PROJECT")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String description;

}