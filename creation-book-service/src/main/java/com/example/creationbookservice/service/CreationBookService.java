package com.example.creationbookservice.service;

import com.example.creationbookservice.model.Book;
import com.example.creationbookservice.util.BookGenerator;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.LinkedList;

@Service
@AllArgsConstructor
@Slf4j
public class CreationBookService {

    private final LinkedList<Book> bookCreatonEvents;
    private static BookGenerator bookGenerator;

    @Scheduled(fixedRate = 10000)
    public void generationBooks() {
        Book book = bookGenerator.createNewBook();
        bookCreatonEvents.add(book);
    }
}