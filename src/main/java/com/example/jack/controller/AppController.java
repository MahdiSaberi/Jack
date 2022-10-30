package com.example.jack.controller;

import com.example.jack.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @PostMapping("/person")
    public Person createPerson(@RequestBody Person person){
        return person;
    }
}
