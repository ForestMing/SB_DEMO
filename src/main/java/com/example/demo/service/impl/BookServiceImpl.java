package com.example.demo.service.impl;

import com.example.demo.dao.BookDao;
import com.example.demo.entity.Book;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 69077 on 2017/11/21.
 */
@Service("BookService")
public class BookServiceImpl implements BookService {
    @Autowired
    @Resource(name = "bookDao")
    private BookDao bookDao;

    @Override
    public List<Book> findBook(Book book) {
        return bookDao.findBook(book);
    }
}
