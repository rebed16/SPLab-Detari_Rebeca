package com.example.splabdetarirebeca;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String surname;

    @OneToMany(mappedBy = "author")
    private List<Book> books;

    public Author() {}
    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void print() {
        System.out.println("Author: " + this.name + " " + this.surname);
    }
    public Long getId() {return id;}
    public String getName() {return name;}
    public String getSurname() {return surname;}
    public void setName(String name) {this.name = name;}
    public void setSurname(String surname) {this.surname = surname;}
}
