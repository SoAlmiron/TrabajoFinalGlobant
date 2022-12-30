package com.example.proyectoFinal1.service;

import com.example.proyectoFinal1.model.RecyclingZone;
import com.example.proyectoFinal1.repository.RecyclingZoneRepository;
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

    @InjectMocks
    RecyclingZoneService recyclingZoneService;

    private RecyclingZone rz;

    @BeforeEach
    void setUp() {
        rz = new RecyclingZone();
        rz.setName("hola");
        rz.setId(1);
        rz.setAdress("fdsa");
    }

    @Test
    void findAll() {
        when(recyclingZoneRepository.findAll()).thenReturn(Arrays.asList(rz));
        assertNotNull(recyclingZoneService.getAllRecyclingZones());
    }
}