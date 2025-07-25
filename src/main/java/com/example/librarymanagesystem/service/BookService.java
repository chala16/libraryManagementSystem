package com.example.librarymanagesystem.service;

import com.example.librarymanagesystem.dto.models.Book;

import java.util.List;

public interface BookService {
    Book addBook(Book book);
    Book findById(int id);
    List<Book> getAllBooks();
    void deleteBook(int id);
}
