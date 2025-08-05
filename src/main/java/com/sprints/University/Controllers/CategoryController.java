package com.sprints.University.Controllers;

import com.sprints.University.Models.category;
import com.sprints.University.Repository.CategoryRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    private final CategoryRepository categoryRepository;

    public CategoryController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @PostMapping
    public ResponseEntity<category> createCategory(@RequestBody category category1) {
        return ResponseEntity.ok(categoryRepository.save(category1));
    }

    @GetMapping
    public List<category> getAllCategories() {
        return categoryRepository.findAll();
    }
}