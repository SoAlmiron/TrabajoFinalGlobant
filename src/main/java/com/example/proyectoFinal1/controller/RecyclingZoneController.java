package com.example.proyectoFinal1.controller;

import com.example.proyectoFinal1.model.RecyclingZone;
import com.example.proyectoFinal1.service.RecyclingZoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recyclingzone")
public class RecyclingZoneController {

//    @Autowired
//    private RecyclingZoneService recyclingZoneService;

    private final RecyclingZoneService recyclingZoneService;
    @Autowired
    public RecyclingZoneController(RecyclingZoneService recyclingZoneService) {
        this.recyclingZoneService = recyclingZoneService;
    }

    @PostMapping
    public void registerNewRecyclingZone(@RequestBody RecyclingZone recyclingZone){
        recyclingZoneService.addNewRecyclingZone(recyclingZone);
    }

    @GetMapping
    public List<RecyclingZone> getAllRecyclingZones(){
        return recyclingZoneService.getAllRecyclingZones();
    }

    @DeleteMapping(path = "{RecyclingZoneId}")
    public void deteleteRecyclingZone(@PathVariable("RecyclingZoneId") Long RecyclingZoneId) {
        recyclingZoneService.deleteRecyclingZone(RecyclingZoneId);
    }
}
