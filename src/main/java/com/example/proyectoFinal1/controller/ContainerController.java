package com.example.proyectoFinal1.controller;

import com.example.proyectoFinal1.model.Container;
import com.example.proyectoFinal1.service.ContainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/container")
public class ContainerController {
    @Autowired
    private ContainerService containerService;

    @GetMapping
    public List<Container> getAllContainers(){
        return containerService.getAllContainers();
    }

    @GetMapping("trashrecycling/{id}")
    public void getRecyclingIdeas(@PathVariable("id") Long id){
        containerService.getRecyclingIdeas(id);
    }
}
