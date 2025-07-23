package com.example.librarymanagesystem.controller;

import com.example.librarymanagesystem.dto.models.Category;
import com.example.librarymanagesystem.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @PostMapping("/category")
    public ResponseEntity<?> addCategory(@RequestBody Category category) {
        Category saveCategory = categoryService.addCategory(category);
        System.out.println("check category details" + saveCategory);
        return new ResponseEntity<>(saveCategory, HttpStatus.OK);
    }

    @GetMapping("/category/{id}")
    public ResponseEntity<?> getCategory(@PathVariable int id) {
        Category getCategory = categoryService.findById(id);
        return new ResponseEntity<>(getCategory, HttpStatus.OK);
    }

    @DeleteMapping("/category/{id}")
    public ResponseEntity<?> deleteCategory(@PathVariable int id) {
        categoryService.deleteCategory(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
