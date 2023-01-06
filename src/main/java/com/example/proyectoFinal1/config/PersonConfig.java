package com.example.proyectoFinal1.config;

import com.example.proyectoFinal1.model.Person;
import com.example.proyectoFinal1.repository.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class PersonConfig {
    @Bean
    CommandLineRunner addPersonsExamples(PersonRepository personRepository){

        return args -> {
            Person frank = new Person(
                    "Annelies",
                    "Frank",
                    "Urca",
                    "Colón 1820",
                    LocalDate.of(1929, Month.JUNE,12)


            );
                personRepository.saveAll(List.of(frank));
        };
    }

}
