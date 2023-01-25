package com.example.proyectoFinal1.repository;
import com.example.proyectoFinal1.model.RecyclingZone;
import com.example.proyectoFinal1.model.Supervision;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface SupervisionRepository extends JpaRepository<Supervision, Long> {
    List<Supervision> supervisionRepository = new ArrayList<>();
}
