package com.example.proyectoFinal1.model;
import com.example.proyectoFinal1.model.RecyclingZone;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.beans.ConstructorProperties;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

@Table(name = "zonesupervisors")
public class ZoneSupervisor extends Person{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "recyclingZone_id")
    @JsonBackReference //IMPORTANTE
    private RecyclingZone recyclingZone;

    public ZoneSupervisor(String name, RecyclingZone recyclingZone) {
        super(name);
        this.recyclingZone = recyclingZone;
    }

}
