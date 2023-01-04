package com.example.proyectoFinal1.controller;

import com.example.proyectoFinal1.dto.RecyclingZoneDTO;
import com.example.proyectoFinal1.model.RecyclingZone;
import com.example.proyectoFinal1.service.RecyclingZoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recyclingzones")
public class RecyclingZoneController {

    @Autowired
    private RecyclingZoneService recyclingZoneService;

    @PostMapping
    public void registerNewRecyclingZone(@RequestBody RecyclingZone recyclingZone){
        recyclingZoneService.addNewRecyclingZone(recyclingZone);
    }

    @GetMapping("{id}")
    public RecyclingZoneDTO getRecyclingZoneById(@PathVariable("id") Long id){
        return recyclingZoneService.getRecyclingZoneById(id);
    }

    @GetMapping
    public List<RecyclingZoneDTO> getAllRecyclingZones(){
        return recyclingZoneService.getAllRecyclingZones();
    }

    @DeleteMapping("{id}")
    public void deleteRecyclingZone(@PathVariable("id") Long id) {
        recyclingZoneService.deleteRecyclingZone(id);
    }
}
