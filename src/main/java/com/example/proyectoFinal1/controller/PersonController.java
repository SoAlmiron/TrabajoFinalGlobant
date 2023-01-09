package com.example.proyectoFinal1.controller;


import com.example.proyectoFinal1.model.Person;
import com.example.proyectoFinal1.service.PersonService;
import jakarta.persistence.GeneratedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/persons")
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping
    public List<Person> getAllPersons(){
        return personService.getAllPersons();
    }

    @DeleteMapping("/{id}/delete")
    public void deletePerson(@PathVariable("id") Long id) {
        personService.deletePerson(id);
    }


}
