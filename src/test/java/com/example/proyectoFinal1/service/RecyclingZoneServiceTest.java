package com.example.proyectoFinal1.service;

import com.example.proyectoFinal1.model.RecyclingZone;
import com.example.proyectoFinal1.model.ZoneSupervisor;
import com.example.proyectoFinal1.repository.RecyclingZoneRepository;
import com.example.proyectoFinal1.repository.ZoneSupervisorRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class RecyclingZoneServiceTest {
    @Mock
    RecyclingZoneRepository recyclingZoneRepository;
    ZoneSupervisorRepository zoneSupervisorRepository;

    @InjectMocks
    RecyclingZoneService recyclingZoneService;
    ZoneSupervisorService zoneSupervisorService;
    private RecyclingZone rz;
    private ZoneSupervisor zs;

    @BeforeEach
    void setUp() {
        rz = new RecyclingZone();
        rz.setName("Plaza");
        rz.setAdress("Colon 1456");
        rz.setLatitude(500);
        rz.setLongitude(600);
    }

    @Test
    void findAll() {
        when(recyclingZoneRepository.findAll()).thenReturn(Arrays.asList(rz));
        assertNotNull(recyclingZoneService.getAllRecyclingZones());
    }
}