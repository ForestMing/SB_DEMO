package com.example.demo.controller;

import com.example.demo.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 69077 on 2017/11/17.
 */
@Controller
public class HelloController {
    @RequestMapping("/")
    public String index() {
        return "/index";
    }

}
