package com.example.proyectoFinal1.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
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
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "adress")
    private String adress;

    @Column(name = "latitude")
    private Long latitude;

    @Column(name = "longitude")
    private Long longitude;

    @OneToOne(mappedBy = "recyclingZone", cascade = CascadeType.ALL, optional = true)
    @JsonManagedReference //IMPORTANTE
    private ZoneSupervisor zoneSupervisor;

    /*public RecyclingZone(String name, String adress, String latitude, String longitude, ZoneSupervisor zoneSupervisor) {
        this.name = name;
        this.adress = adress;
        this.latitude = latitude;
        this.longitude = longitude;
        this.zoneSupervisor = zoneSupervisor;
    }*/
}