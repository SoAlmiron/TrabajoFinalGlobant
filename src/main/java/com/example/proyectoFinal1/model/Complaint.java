package com.example.proyectoFinal1.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Entity
public class Complaint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private LocalDateTime localDateTime;

    @ManyToOne()
    @JoinColumn(name = "person_id", referencedColumnName = "id")
    private Person person;
    private ComplaintReason complaintReason;
    private String description;

    private Complaint() {
        this.localDateTime = LocalDateTime.now();
    }

}


