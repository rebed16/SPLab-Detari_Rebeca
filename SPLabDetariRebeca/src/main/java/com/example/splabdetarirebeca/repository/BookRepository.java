package com.example.splabdetarirebeca.repository;

import com.example.splabdetarirebeca.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
