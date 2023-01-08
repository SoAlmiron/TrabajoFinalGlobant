package com.example.proyectoFinal1.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "areaSupervisor")

public class AreaSupervisor {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "adress")
    private String adress;

    @Column(name = "latitude")
    private long latitude;

    @Column(name = "longitude")
    private long longitude;


    public AreaSupervisor(String name, String estadoDeZonaDeReciclaje, String capacidadDeOcupacion, long longitude) {
        this.name = name;
        this.adress = adress;
        this.latitude = latitude;
        this.longitude = longitude;
    }

}
