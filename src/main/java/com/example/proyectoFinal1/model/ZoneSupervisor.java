package com.example.proyectoFinal1.model;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

@Table(name = "zonesupervisors")
public class ZoneSupervisor extends Person{
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "recyclingZone_id")
    @JsonBackReference //IMPORTANTE
    private RecyclingZone recyclingZone;

}
