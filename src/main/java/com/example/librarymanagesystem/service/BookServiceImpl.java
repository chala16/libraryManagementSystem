package com.example.librarymanagesystem.service;

import com.example.librarymanagesystem.dto.models.Book;
import com.example.librarymanagesystem.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepo bookRepo;
    @Override
    public Book addBook(Book book) {
        return bookRepo.save(book);
    }

    @Override
    public Book findById(int id) {
        return bookRepo.findById(id).orElse(null);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    @Override
    public void deleteBook(int id) {
        bookRepo.deleteById(id);
    }
}
