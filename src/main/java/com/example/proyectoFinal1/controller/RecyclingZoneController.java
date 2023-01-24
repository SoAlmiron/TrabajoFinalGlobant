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
    public RecyclingZone getRecyclingZoneById(@PathVariable("id") Long id){
        return recyclingZoneService.getRecyclingZoneById(id);
    }

    @GetMapping
    public List<RecyclingZone> getAllRecyclingZones(){
        return recyclingZoneService.getAllRecyclingZones();
    }

    @GetMapping("distancia/{id}/{otherId}")
    public double getRecyclingZonesDistance(@PathVariable("id") Long id, @PathVariable("otherId")Long otherId){
        return recyclingZoneService.getRecyclingZonesDistance(id, otherId);
    }

    @DeleteMapping("{id}")
    public void deleteRecyclingZone(@PathVariable("id") Long id) {
        recyclingZoneService.deleteRecyclingZone(id);
    }

    /*@PutMapping("{id}/update")
    public void updateRecyclingZone(@PathVariable("id") Long id, @RequestBody RecyclingZoneDTO recyclingZone){
        recyclingZoneService.updateRecyclingZone(recyclingZone, id);
    }*/

}
