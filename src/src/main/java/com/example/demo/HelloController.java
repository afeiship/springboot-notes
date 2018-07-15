package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private PersonService service;

    @GetMapping("/hello")
    public String say() {
        return "hello springboot - afeiship";
    }


    @GetMapping("/persons")
    public List<Person> findPersons(){
        return service.getList();
    }
}
