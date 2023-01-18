package com.example.proyectoFinal1.model;
import com.example.proyectoFinal1.model.RecyclingZone;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.beans.ConstructorProperties;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

@Table(name = "zonesupervisors")
public class ZoneSupervisor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "recyclingZoneState")
    private String recyclingZoneState;

    @Column(name = "occupancyCapacity")
    private String occupancyCapacity;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "recyclingZone_id")
    @JsonBackReference //IMPORTANTE
    private RecyclingZone recyclingZone;

    /*public ZoneSupervisor(String name, String estadoZonaDeReciclaje, String capacidadOcupacion) {
        this.name = name;
        this.estadoZonaDeReciclaje = estadoZonaDeReciclaje;
        this.capacidadOcupacion = capacidadOcupacion;
    }*/
}
