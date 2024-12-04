package com.example.projectsbcxp.data.entities;
import jakarta.persistence.*;


@Entity
@Table(name="T_PROJECT")
public class Project {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name="TITLE")
    private String title;

    @Column(name="DESCRIPTION")
    private String description;

    public Integer getId(){
        return this.id;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public String getTitle(){
        return this.title;
    }

    public void setTitle(String name) {
        this.title = title;
    }
    public String getDescription(){
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}