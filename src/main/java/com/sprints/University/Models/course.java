package com.sprints.University.Models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="Course")
public class course {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long crs_id;
    @Column(nullable = false)
    private String name;
    private String description;

    @ManyToMany
    @JoinTable(name = "student_course",
            joinColumns = @JoinColumn(name = "crs_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id"))
    private List<student> students;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private category category;

    public course() {
    }

    public course(Long crs_id, String name, String description) {
        this.crs_id = crs_id;
        this.name = name;
        this.description = description;
    }

    public Long getCrs_id() {
        return crs_id;
    }
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<student> getStudents() {
        return students;
    }

    public category getCategory() {
        return category;
    }

    public void setCrs_id(Long crs_id) {
        this.crs_id = crs_id;
    }



    public void setName(String name) {
        this.name = name;
    }



    public void setDescription(String description) {
        this.description = description;
    }



    public void setStudents(List<student> students) {
        this.students = students;
    }


    public void setCategory(category category) {
        this.category = category;
    }
}
