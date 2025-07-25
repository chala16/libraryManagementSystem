package com.example.librarymanagesystem.service;


import com.example.librarymanagesystem.dto.models.Category;

import java.util.List;

public interface CategoryService {
    Category addCategory(Category category);
    Category findById(int id);
    List<Category> getAllCategories();
    void deleteCategory(int id);
}
