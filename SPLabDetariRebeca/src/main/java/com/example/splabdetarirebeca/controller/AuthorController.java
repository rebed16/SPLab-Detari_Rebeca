package com.example.splabdetarirebeca.controller;

import com.example.splabdetarirebeca.Author;
import com.example.splabdetarirebeca.repository.AuthorRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    private final AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @GetMapping
    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    @PostMapping
    public Author addAuthor(@RequestBody Author author) {
        return authorRepository.save(author);
    }
}
