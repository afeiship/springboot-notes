package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonService personService;

    public List<Person> getList(){
        return personService.findAll();
    }
}
