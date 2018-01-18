package com.example.demo.controller;

import com.example.demo.entity.Person;
import com.example.demo.service.PersonService;
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
public class AddController {
    @Autowired
    @Qualifier("PersonService")
    private PersonService personService ;

    @RequestMapping(value="/add", method=RequestMethod.GET)
    public String add(Model model) {
        model.addAttribute("person", new Person());
        return "add";
    }

    @RequestMapping(value = "add" ,method = RequestMethod.POST)
    public String add(@ModelAttribute Person person,Model model){
        model.addAttribute("person",person);
        System.out.println(person.getId()+","+person.getName());
        personService.addPerson(person);
        return "result";
    }

}
