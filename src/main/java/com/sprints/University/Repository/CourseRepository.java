package com.sprints.University.Repository;

import com.sprints.University.Models.course;
import com.sprints.University.Models.student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<course, Long> {
}
