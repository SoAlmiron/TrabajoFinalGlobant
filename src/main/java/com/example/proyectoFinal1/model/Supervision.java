package com.example.proyectoFinal1.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class Supervision {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "recyclingZoneState")
    private RecyclingZoneState state;

    @ManyToOne
    @JoinColumn(name = "supervisor_id")
    private ZoneSupervisor zoneSupervisor;

    private LocalDateTime localDateTime;



    private double totalOccupancy;

    private Supervision() {
        this.localDateTime = LocalDateTime.now();
    }

}
