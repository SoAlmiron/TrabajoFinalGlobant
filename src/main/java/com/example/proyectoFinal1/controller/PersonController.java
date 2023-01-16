package com.example.proyectoFinal1.controller;


import com.example.proyectoFinal1.dto.RecyclingZoneDTO;
import com.example.proyectoFinal1.model.Person;
import com.example.proyectoFinal1.service.PersonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/persons")
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public List<Person> getAllPersons(){
        return personService.getAllPersons();
    }

    @DeleteMapping("{id}")
    public void deletePerson(@PathVariable("id") Long id) {
        personService.deletePerson(id);
    }

    @PutMapping("{id}")
    public void updatePerson(@PathVariable("id") Long id, @RequestBody Person person){
        personService.updatePerson(person, id);
    }

}
