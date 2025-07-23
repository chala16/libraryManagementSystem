package com.example.librarymanagesystem.service;


import com.example.librarymanagesystem.dto.models.Category;
import com.example.librarymanagesystem.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepo categoryRepo;

    @Override
    public Category addCategory(Category category) {
        return categoryRepo.save(category);
    }

    @Override
    public Category findById(int id) {
        return categoryRepo.findById(id).orElseThrow(() ->
                new RuntimeException("Not Found for that Id")
        );
    }

    @Override
    public void deleteCategory(int id) {
        categoryRepo.deleteById(id);
    }
}
