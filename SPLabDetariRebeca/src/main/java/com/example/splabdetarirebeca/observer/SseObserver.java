package com.example.splabdetarirebeca.observer;

import com.example.splabdetarirebeca.Book;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

public class SseObserver implements Observer {

    private final SseEmitter emitter;

    public SseObserver(SseEmitter emitter) {
        this.emitter = emitter;
    }

    @Override
    public void update(Book book) {
        try {
            emitter.send(
                    SseEmitter.event()
                            .name("book-added")
                            .data(book)
            );
        } catch (Exception e) {
            emitter.completeWithError(e);
        }
    }

}
