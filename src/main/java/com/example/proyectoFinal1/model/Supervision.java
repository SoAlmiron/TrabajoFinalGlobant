package com.example.proyectoFinal1.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Supervision {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "recyclingZoneState")
    private RecyclingZoneState state;
}
