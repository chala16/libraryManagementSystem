package com.example.librarymanagesystem.repository;

import com.example.librarymanagesystem.dto.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepo extends JpaRepository<Author, Integer> {
}
