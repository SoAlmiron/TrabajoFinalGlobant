package com.example.proyectoFinal1.controller;

import com.example.proyectoFinal1.model.ZoneSupervisor;
import com.example.proyectoFinal1.service.ZoneSupervisorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/zonesupervisors")
public class ZoneSupervisorController {
    @Autowired
    private ZoneSupervisorService zoneSupervisorService;

    @PostMapping
    public void registerNewZoneSupervisor(@RequestBody ZoneSupervisor zoneSupervisor){
        zoneSupervisorService.addNewZoneSupervisor(zoneSupervisor);
    }

    @GetMapping("{id}")
    public ZoneSupervisor getZoneSupervisorById(@PathVariable("id") Long id){
        return zoneSupervisorService.getZoneSupervisorById(id);
    }

    @GetMapping
    public List<ZoneSupervisor> getAllZoneSupervisors(){
        return zoneSupervisorService.getAllZoneSupervisors();
    }

    @DeleteMapping("{id}")
    public void deleteZoneSupervisor(@PathVariable("id") Long id) {
        zoneSupervisorService.deleteZoneSupervisor(id);
    }
}
