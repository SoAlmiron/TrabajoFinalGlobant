//package com.example.proyectoFinal1.config;
//
//import com.example.proyectoFinal1.model.RecyclingZone;
//import com.example.proyectoFinal1.model.ZoneSupervisor;
//import com.example.proyectoFinal1.repository.RecyclingZoneRepository;
//import com.example.proyectoFinal1.repository.ZoneSupervisorRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.List;
//
//@Configuration
//public class ZoneSupervisorConfig {
//    private final ZoneSupervisorRepository zoneSupervisorRepository;
//
//    public ZoneSupervisorConfig(ZoneSupervisorRepository zoneSupervisorRepository) {
//        this.zoneSupervisorRepository = zoneSupervisorRepository;
//    }
//
//    @Bean
//    CommandLineRunner commandLineRunner1(ZoneSupervisorRepository zoneSupervisorRepository){
//
//        return args -> {
//
//            ZoneSupervisor supervisor1 = new ZoneSupervisor(
//                    "Julio Roca",
//                    "full",
//                    "Endless"
//            );
//
//            ZoneSupervisor supervisor2 = new ZoneSupervisor(
//                    "Int. Ramón Bautista Mestre &, Mendoza, Córdoba",
//                    "Almost Full",
//                    "very little"
//            );
//
//            zoneSupervisorRepository.saveAll(List.of(supervisor1,supervisor2));
//        };
//    }
//}
//
