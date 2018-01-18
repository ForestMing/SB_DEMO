package com.example.demo.service.impl;

import com.example.demo.dao.PersonDao;
import com.example.demo.entity.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by 69077 on 2017/11/21.
 */
@Service("PersonService")
public class PersonServiceImpl implements PersonService {
    @Autowired
    @Resource(name = "personDao")
    private PersonDao personDao;

    @Override
    public int addPerson(Person person) {
        return personDao.insertPerson(person);
    }
}
