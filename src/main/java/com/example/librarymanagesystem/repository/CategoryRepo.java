package com.example.librarymanagesystem.repository;

import com.example.librarymanagesystem.dto.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
