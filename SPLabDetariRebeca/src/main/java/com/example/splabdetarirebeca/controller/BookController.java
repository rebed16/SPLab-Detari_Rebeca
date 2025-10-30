package com.example.splabdetarirebeca.controller;

import com.example.splabdetarirebeca.Book;
import com.example.splabdetarirebeca.Command;
import com.example.splabdetarirebeca.DownloadBook;
import com.example.splabdetarirebeca.SaveBook;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@Component
@RestController
@RequestMapping("/books")
public class BookController {

    @PostMapping
    public String saveBook() {
        Command cmd = new SaveBook();
        cmd.execute();
        return "Comanda de salvare a fost executată ✅";
    }

    @GetMapping("/{id}")
    public String downloadBook(@PathVariable String id) {
        Command cmd = new DownloadBook();
        cmd.execute();
        return "Comanda de descărcare a fost executată pentru cartea cu ID: " + id + " ✅";
    }

    @GetMapping
    public String getAllBooks() {
        return "📚 Endpoint GET /books funcționează!";
    }
}
