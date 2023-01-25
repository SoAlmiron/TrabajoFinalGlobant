package com.example.proyectoFinal1.controller;

import com.example.proyectoFinal1.model.Container;
import com.example.proyectoFinal1.model.OcupancyCapacity;
import com.example.proyectoFinal1.model.Supervision;
import com.example.proyectoFinal1.service.SupervisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/supervision")
public class SupervisionController {
    @Autowired
    private SupervisionService service;

    @PostMapping
    public void newSupervision(@RequestBody Supervision supervision){
        service.newSupervision(supervision);
    }

    @GetMapping("{id}")
    public Supervision getSupervision(@PathVariable("id") Long id){
        return service.getSupervisionById(id);
    }

    @GetMapping("capacity/{id}")
    public String getOcuppancyCapacity (){
        return service.getOcuppancyCapacity;
    }
}
