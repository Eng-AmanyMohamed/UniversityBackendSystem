package com.sprints.University.Repository;

import com.sprints.University.Models.category;
import com.sprints.University.Models.course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<category, Long> {
}
