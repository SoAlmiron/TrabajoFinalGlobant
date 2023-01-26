package com.example.proyectoFinal1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String neighborhood;
    private String address;
    private LocalDate dateOfBirth;

    @JsonIgnore
    @OneToMany(mappedBy = "person")
    private List<Complaint> complaints = new ArrayList<>();

    public Person(String name, String surname, String neighborhood, String address, LocalDate dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.neighborhood = neighborhood;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
    }

    public Person(String name) {
        this.name = name;
    }
}

