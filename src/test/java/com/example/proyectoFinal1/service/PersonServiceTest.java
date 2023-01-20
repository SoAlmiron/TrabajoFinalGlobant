package com.example.proyectoFinal1.service;

import com.example.proyectoFinal1.model.Person;
import com.example.proyectoFinal1.repository.PersonRepository;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.time.Month;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.verify;



@ExtendWith(MockitoExtension.class)
class PersonServiceTest {

    @Mock private PersonRepository personRepository;
    private PersonService underTest;

    //Before each test we will get a fresh instance for PersonService
    @BeforeEach
    void setUp(){
        underTest = new PersonService(personRepository);
    }

    @Test
    void canGetAllPersons() {
        //when
        underTest.getAllPersons();
        //then
        verify(personRepository).findAll();
    }

    @Test
    void canAddNewPerson() {
        //given
        Person person = new Person(
                "Francisco",
                "Romano",
                "San Salvador",
                "Av. Colón 3440, Córdoba",
                LocalDate.of(1990, Month.JULY,1)
                );
        //when
        underTest.addNewPerson(person);

        //then
        ArgumentCaptor<Person> personArgumentCaptor =
                ArgumentCaptor.forClass(Person.class);

        verify(personRepository).
                save(personArgumentCaptor.capture())    ;

        Person capturedPerson = personArgumentCaptor.getValue();
        assertThat(capturedPerson).isEqualTo(person);
    }
}