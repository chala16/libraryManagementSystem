package com.example.librarymanagesystem.repository;

import com.example.librarymanagesystem.dto.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepo extends JpaRepository<Book, Integer> {

}
