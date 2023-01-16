package com.example.proyectoFinal1.service;

import com.example.proyectoFinal1.model.Person;
import com.example.proyectoFinal1.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    private final PersonRepository repository;

    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }

    public List<Person> getAllPersons() {
        return repository.findAll();
    }

    public void deletePerson(Long id) {
       boolean exist = repository.existsById(id);
        if (!exist){
            throw new IllegalStateException("RecyclingZone with id" + id + "does not exist");
        }
        repository.deleteById(id);
    }

    public void updatePerson(Person person, Long id){
        Optional<Person> exists = repository.findById(id);
        Person person1 = exists.get();
        person1.setId(person.getId());
        person1.setName(person.getName());
        person1.setSurname(person.getSurname());
        person1.setNeighborhood(person.getNeighborhood());
        person1.setAddress(person.getAddress());
        person1.setDateOfBirth(person.getDateOfBirth());

        repository.save(person1);
    }

}
