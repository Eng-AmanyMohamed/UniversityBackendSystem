package com.sprints.University.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="Student")
public class student {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private Long student_id;
    @Column(nullable = false)
    private String name;
    @Column(unique = true,nullable = false)
    private String email;
    private double age;

    @ManyToMany(mappedBy = "students")
    @JsonIgnore // To avoid recursion
    private List<course> courses;

    public student() {
        
    }

    public student(Long student_id, String name, String email, double age) {
        this.student_id = student_id;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public Long getStudent_id() {
        return student_id;
    }

    public double getAge() {
        return age;
    }
    public String getName() {
        return name;
    }

    public List<course> getCourses() {
        return courses;
    }

    public String getEmail() {
        return email;
    }

    public void setStudent_id(Long student_id) {
        this.student_id = student_id;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setAge(double age) {
        this.age = age;
    }

    public void setCourses(List<course> courses) {
        this.courses = courses;
    }
}
