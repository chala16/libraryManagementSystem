package com.example.librarymanagesystem.dto.models;

import jakarta.persistence.*;

@Entity
@Table(name= "author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    String authorName;

}
