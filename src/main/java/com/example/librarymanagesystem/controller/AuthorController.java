package com.example.librarymanagesystem.controller;

import com.example.librarymanagesystem.dto.models.Author;
import com.example.librarymanagesystem.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping("/authors/{id}")
    public ResponseEntity<?> getAuthor(@PathVariable int id) {
        Author author = authorService.findById(id);
        if (author == null) {
            return new ResponseEntity<>("Author not found", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(author, HttpStatus.OK);
    }

    @PostMapping("/authors")
    public ResponseEntity<?> addAuthor(@RequestBody Author author) {
        Author savedAuthor = authorService.save(author);
        return new ResponseEntity<>(savedAuthor,HttpStatus.OK);
    }

    @DeleteMapping("/authors/{id}")
    public ResponseEntity<?> deleteAuthor(@PathVariable int id) {
        authorService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
