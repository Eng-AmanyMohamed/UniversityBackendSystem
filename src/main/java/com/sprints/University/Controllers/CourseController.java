package com.sprints.University.Controllers;

import com.sprints.University.Models.course;
import com.sprints.University.Repository.CourseRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    private final CourseRepository courseRepository;

    public CourseController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @PostMapping
    public ResponseEntity<course> createCourse(@RequestBody course course1) {
        return ResponseEntity.ok(courseRepository.save(course1));
    }

    @GetMapping
    public List<course> getAllCourses() {
        return courseRepository.findAll();
    }
}
