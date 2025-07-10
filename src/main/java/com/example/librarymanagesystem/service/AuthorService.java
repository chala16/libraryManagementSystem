package com.example.librarymanagesystem.service;

import com.example.librarymanagesystem.dto.models.Author;

public interface AuthorService {
    Author save(Author author);
    void delete(int id);
    Author findById(int id);
}
