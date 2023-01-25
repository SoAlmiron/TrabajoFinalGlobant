package com.example.proyectoFinal1.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "containers")
public class Container {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private Long capacity;

    private ThrashType type;

    @Column(name = "occupancyCapacity")
    private OccupancyCapacity occupancyCapacity;

    @ManyToOne
    @JoinColumn(name = "recyclingZone_id")
    @JsonBackReference
    private RecyclingZone recyclingZone;

}
