package com.example.demo.controller;

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by 69077 on 2017/11/22.
 */
@Controller
public class BookController{
    @Autowired
    @Qualifier("BookService")
    private BookService bookService ;

    @RequestMapping(value="/add", method=RequestMethod.GET)
    public String add(Model model) {
        model.addAttribute("book", new Book());
        return "add";
    }

    @RequestMapping(value = "add" ,method = RequestMethod.POST)
    public String add(@ModelAttribute Book book,Model model){
        model.addAttribute("book", book );
        bookService.findBook(book);
        return "result";
    }

}
