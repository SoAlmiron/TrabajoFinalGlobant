package com.example.proyectoFinal1.model;
import com.example.proyectoFinal1.model.RecyclingZone;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

@Table(name = "areaSupervisor")
public class ZoneSupervisor {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "estadoZonaDeReciclaje")
    private String estadoZonaDeReciclaje;

    @Column(name = "capacidadOcupacion")
    private String capacidadOcupacion;


    public ZoneSupervisor(String name, String estadoZonaDeReciclaje, String capacidadOcupacion) {
        this.name = name;
        this.estadoZonaDeReciclaje = estadoZonaDeReciclaje;
        this.capacidadOcupacion = capacidadOcupacion;
    }
}
