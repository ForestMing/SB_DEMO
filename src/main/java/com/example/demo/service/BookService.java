package com.example.demo.service;

import com.example.demo.entity.Book;

import java.util.List;

/**
 * Created by 69077 on 2017/11/21.
 */
public interface BookService {
    List<Book> findBook(Book book);
}