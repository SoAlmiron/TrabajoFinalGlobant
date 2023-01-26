package com.example.proyectoFinal1.repository;

import com.example.proyectoFinal1.model.Container;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface ContainerRepository extends JpaRepository<Container, Long> {
    List<Container> containerRepository = new ArrayList<>();
}
