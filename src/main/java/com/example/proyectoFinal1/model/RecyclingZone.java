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
@Table(name = "recyclingzones")
public class RecyclingZone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;

    @Column(name = "adress")
    private String adress;

    @Column(name = "latitude")
    private long latitude;

    @Column(name = "longitude")
    private long longitude;


    public RecyclingZone(String name, String adress, long latitude, long longitude) {
        this.name = name;
        this.adress = adress;
        this.latitude = latitude;
        this.longitude = longitude;
    }
}