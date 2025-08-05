package com.sprints.University.Models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="Category")
public class category {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long category_id;
    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "category")
    private List<course> courses;

    public category() {

    }

    public category(Long category_id, String name) {
        this.category_id = category_id;
        this.name = name;
    }

    public Long getCategory_id() {
        return category_id;
    }

    public String getName() {
        return name;
    }

    public List<course> getCourses() {
        return courses;
    }

    public void setCategory_id(Long category_id) {
        this.category_id = category_id;
    }


    public void setName(String name) {
        this.name = name;
    }



    public void setCourses(List<course> courses) {
        this.courses = courses;
    }
}
