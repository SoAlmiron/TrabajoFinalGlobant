package com.example.proyectoFinal1.controller;

import com.example.proyectoFinal1.dto.RecyclingZoneDTO;
import com.example.proyectoFinal1.service.RecyclingZoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RecyclingZoneController {

    @Autowired
    private RecyclingZoneService recyclingZoneService;

    @GetMapping("/recyclingzone")
    public List<RecyclingZoneDTO> getAllRecyclingZones(){
        return recyclingZoneService.getAllRecyclingZones();
    }

    @DeleteMapping(path = "{RecyclingZoneId}")
    public void deteleteRecyclingZone(@PathVariable("studentId") Long id) {
        RecyclingZoneService.deleteRecyclingZone(id);
    }
}
