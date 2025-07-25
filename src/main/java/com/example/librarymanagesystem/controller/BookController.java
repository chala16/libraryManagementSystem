package com.example.librarymanagesystem.controller;

import com.example.librarymanagesystem.dto.models.Book;
import com.example.librarymanagesystem.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class BookController {

    @Autowired
    private BookService bookService;
    // get a book
    @GetMapping("/book/{id}")
    public ResponseEntity<?> getBook(@PathVariable int id) {
        Book getBook = bookService.findById(id);
        return new ResponseEntity<>(getBook, HttpStatus.OK);
    }
    @GetMapping("/book")
    public ResponseEntity<?> getBook() {
        List<Book> allBooks = bookService.getAllBooks();
        return new ResponseEntity<>(allBooks, HttpStatus.OK);
    }
    // create a book
    @PostMapping("/book")
    public ResponseEntity<?> addBook(@RequestBody Book book) {
        Book savedBook = bookService.addBook(book);
        System.out.println("Saved book: " + savedBook);

        return new ResponseEntity<>(savedBook, HttpStatus.OK);
    }
    // delete a book
    @DeleteMapping("/book/{id}")
    public ResponseEntity<?> deleteBook(@PathVariable int id) {
        bookService.deleteBook(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
