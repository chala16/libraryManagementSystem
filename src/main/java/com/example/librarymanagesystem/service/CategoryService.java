package com.example.librarymanagesystem.service;


import com.example.librarymanagesystem.dto.models.Category;

public interface CategoryService {
    Category addCategory(Category category);
    Category findById(int id);
    void deleteCategory(int id);
}
