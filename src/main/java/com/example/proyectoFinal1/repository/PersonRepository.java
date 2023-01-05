package com.example.proyectoFinal1.repository;

import com.example.proyectoFinal1.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    List<Person> personRepository = new ArrayList<>();
}
