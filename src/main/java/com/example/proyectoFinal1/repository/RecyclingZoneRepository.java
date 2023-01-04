package com.example.proyectoFinal1.repository;

import com.example.proyectoFinal1.model.RecyclingZone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface RecyclingZoneRepository extends JpaRepository<RecyclingZone, Long> {
    List<RecyclingZone> recyclingZoneRepository = new ArrayList<>();
}
