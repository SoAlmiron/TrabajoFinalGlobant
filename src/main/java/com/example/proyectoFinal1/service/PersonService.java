package com.example.proyectoFinal1.service;

import com.example.proyectoFinal1.model.Person;
import com.example.proyectoFinal1.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonService {

    private final PersonRepository repository;

    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }

    public List<Person> getAllPersons() {
        return repository.findAll();
    }

    public void addNewPerson(Person person) {
        repository.save(person);
    }
}
