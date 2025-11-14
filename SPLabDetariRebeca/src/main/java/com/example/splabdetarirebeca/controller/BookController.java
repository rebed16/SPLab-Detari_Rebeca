package com.example.splabdetarirebeca.controller;

import com.example.splabdetarirebeca.Book;
import com.example.splabdetarirebeca.observer.AllBooksSubject;
import com.example.splabdetarirebeca.repository.BookRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookRepository bookRepository;
    private final AllBooksSubject allBooksSubject;

    public BookController(BookRepository bookRepository, AllBooksSubject allBooksSubject) {
        this.bookRepository = bookRepository;
        this.allBooksSubject = allBooksSubject;
    }

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        Book saved = bookRepository.save(book);

        // AICI SE FACE NOTIFICAREA
        allBooksSubject.notifyObservers(saved);

        return saved;
    }

    @GetMapping
    public List<Book> getAll() {
        return bookRepository.findAll();
    }
}
