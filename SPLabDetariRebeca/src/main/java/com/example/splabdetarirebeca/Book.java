package com.example.splabdetarirebeca;

import jakarta.persistence.*;


import java.util.ArrayList;
import java.util.List;

@Entity
public class Book implements Element{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @ManyToOne
    private Author author;
    @Transient
    private List<Element> elements = new ArrayList<>();

    public Book(){}
    public Book(String title) {
        this.title = title;
    }
    public void addContent(Element element)
    {
        elements.add(element);
    }


    @Override
    public void print() {
        System.out.println("Book: " + title);
        if (author != null) author.print();
        for (Element e : elements) e.print();
    }

    @Override
    public void add(Element e) {
        elements.add(e);
    }

    @Override
    public void remove(Element e) {
        elements.remove(e);
    }

    @Override
    public Element get(int index) {
        return elements.get(index);
    }

    public Long getId() {return id;}
    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}
    public Author getAuthor() {return author;}
    public void setAuthor(Author author) {this.author = author;}

}
