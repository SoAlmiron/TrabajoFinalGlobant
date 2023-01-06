package com.example.proyectoFinal1.config;

import com.example.proyectoFinal1.model.RecyclingZone;
import com.example.proyectoFinal1.repository.RecyclingZoneRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class RecyclingZoneConfig {

    @Bean
    CommandLineRunner commandLineRunner(RecyclingZoneRepository recyclingZoneRepository){

        return args -> {

            RecyclingZone parqueSarmiento = new RecyclingZone(
                    "Parque Sarmiento",
                    "Deodoro Roca, Córdoba",
                    314298538,
                    641807827
            );

            RecyclingZone plazaDeLaMusica = new RecyclingZone(
                    "Plaza de la Música",
                    "Int. Ramón Bautista Mestre &, Mendoza, Córdoba",
                    314298538,
                    641807827
            );

            recyclingZoneRepository.saveAll(List.of(parqueSarmiento, plazaDeLaMusica));
        };
    }
}

