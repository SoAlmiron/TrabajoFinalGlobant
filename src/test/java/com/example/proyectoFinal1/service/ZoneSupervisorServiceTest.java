//package com.example.proyectoFinal1.service;
//
//import com.example.proyectoFinal1.model.RecyclingZone;
//import com.example.proyectoFinal1.model.ZoneSupervisor;
//import com.example.proyectoFinal1.repository.RecyclingZoneRepository;
//import com.example.proyectoFinal1.repository.ZoneSupervisorRepository;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import java.util.Arrays;
//
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//import static org.mockito.Mockito.when;
//
//
//public class ZoneSupervisorServiceTest{
//    @ExtendWith(MockitoExtension.class)
//    class RecyclingZoneServiceTest {
//        @Mock
//        RecyclingZoneRepository recyclingZoneRepository;
//
//
//        @InjectMocks
//        RecyclingZoneService recyclingZoneService;
//        private RecyclingZone rz;
//
//
//        @BeforeEach
//        void setUp() {
//            rz = new RecyclingZone();
//            rz.setName("Plaza");
//            rz.setAdress("Colon 1456");
//            rz.setLatitude(500L);
//            rz.setLongitude(600L);
//        }
//
//        @Test
//        void findAll() {
//            when(recyclingZoneRepository.findAll()).thenReturn(Arrays.asList(rz));
//            assertNotNull(recyclingZoneService.getAllRecyclingZones());
//        }
//    }
//    @ExtendWith(MockitoExtension.class)
//    class zoneSupervisorServiceTest {
//        @Mock
//        ZoneSupervisorRepository zoneSupervisorRepository;
//        @InjectMocks
//        ZoneSupervisorService zoneSupervisorService;
//
//        private ZoneSupervisor zs;
//
//        @BeforeEach
//        void setUp() {
//            zs = new ZoneSupervisor();
//            zs.setName("Plaza");
//            zs.setCapacidadOcupacion("lleno");
//            zs.setEstadoZonaDeReciclaje("deshabilitado");
//        }
////        @Test
////        void findAll() {
////            when(zoneSupervisorRepository.findAll()).thenReturn(Arrays.asList(zs));
////            assertNotNull(zoneSupervisorRepository.getAllZoneSupervisors());
////        }
//    }
//}
