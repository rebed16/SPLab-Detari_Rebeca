package com.example.splabdetarirebeca.observer;

import com.example.splabdetarirebeca.Book;
import java.util.ArrayList;
import java.util.List;

public class AllBooksSubject {

    private final List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers(Book book) {
        for (Observer o : observers) {
            o.update(book);
        }
    }
}
