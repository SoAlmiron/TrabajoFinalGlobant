package com.example.proyectoFinal1.controller;

import com.example.proyectoFinal1.dto.ZoneSupervisorDTO;
import com.example.proyectoFinal1.model.ZoneSupervisor;
import com.example.proyectoFinal1.service.ZoneSupervisorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/zonesupervisor")
public class ZoneSupervisorController {
    @Autowired
    private ZoneSupervisorService zoneSupervisorService;

    @PostMapping
    public void registerNewZoneSupervisor(@RequestBody ZoneSupervisor zoneSupervisor){
        zoneSupervisorService.addNewZoneSupervisor(zoneSupervisor);
    }

    @GetMapping("{id}")
    public ZoneSupervisorDTO getZoneSupervisorById(@PathVariable("id") Long id){
        return zoneSupervisorService.getZoneSupervisorById(id);
    }

    @GetMapping
    public List<ZoneSupervisorDTO> getAllZoneSupervisors(){
        return zoneSupervisorService.getAllZoneSupervisors();
    }

    @DeleteMapping("{id}")
    public void deleteZoneSupervisor(@PathVariable("id") Long id) {
        zoneSupervisorService.deleteZoneSupervisor(id);
    }
}
