package com.example.librarymanagesystem.service;

import com.example.librarymanagesystem.dto.models.Author;
import com.example.librarymanagesystem.repository.AuthorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService{

    @Autowired
    private AuthorRepo authorRepo;

    @Override
    public Author save(Author author) {
        if (author.getBooks() != null) {
            author.getBooks().forEach(book -> book.setAuthor(author));
        }
        return authorRepo.save(author);
    }

    @Override
    public void delete(int id) {
        authorRepo.deleteById(id);
    }

    @Override
    public Author findById(int id) {
        return authorRepo.findById(id).orElse(null);
    }

    @Override
    public List<Author> getAllAuthors() {
        return authorRepo.findAll();
    }
}
