package com.example.proyectoFinal1.repository;

import com.example.proyectoFinal1.model.ZoneSupervisor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface ZoneSupervisorRepository extends JpaRepository<ZoneSupervisor, Long>{
    List<ZoneSupervisor> zoneSupervisorRepository = new ArrayList<>();
}
