package com.example.proyectoFinal1.repository;

import com.example.proyectoFinal1.model.RecyclingZone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecyclingZoneRepository extends JpaRepository<RecyclingZone, Long> {
}
