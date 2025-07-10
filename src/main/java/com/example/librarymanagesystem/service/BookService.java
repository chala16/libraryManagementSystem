package com.example.librarymanagesystem.service;

import com.example.librarymanagesystem.dto.models.Book;

public interface BookService {
    Book addBook(Book book);
    Book findById(int id);
    void deleteBook(int id);
}
