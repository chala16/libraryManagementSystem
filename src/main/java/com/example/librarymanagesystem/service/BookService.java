package com.example.librarymanagesystem.service;

import com.example.librarymanagesystem.dto.models.Book;

public interface BookService {
    Book addBook(Book book);
    void deleteBook(int id);
}
