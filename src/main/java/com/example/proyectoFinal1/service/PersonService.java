package com.example.proyectoFinal1.service;

import com.example.proyectoFinal1.model.Person;
import com.example.proyectoFinal1.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonService {

    @Autowired
    private PersonRepository repository;

    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }

    public List<Person> getAllPersons() {
        return repository.findAll();
    }

    public void deletePerson(Long id) {
        /*boolean exist = repository.existsById(id);
        if (!exist){
            throw new RuntimeException("The person with id" + id + "does not exist");
        }*/
        repository.deleteById(id);
    }
}
