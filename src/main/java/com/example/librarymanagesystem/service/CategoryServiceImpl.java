package com.example.librarymanagesystem.service;


import com.example.librarymanagesystem.dto.models.Category;
import com.example.librarymanagesystem.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepo categoryRepo;

    @Override
    public Category addCategory(Category category) {
        if (category.getBooks() != null) {
            category.getBooks().forEach(book -> book.setCategory(category));
        }
        return categoryRepo.save(category);
    }

    @Override
    public Category findById(int id) {
        System.out.println("check id in category service "+ id);
        return categoryRepo.findById(id).orElse(null);
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepo.findAll();
    }

    @Override
    public void deleteCategory(int id) {
        categoryRepo.deleteById(id);
    }
}
