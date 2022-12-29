package com.example.proyectoFinal1.service;

import com.example.proyectoFinal1.dto.RecyclingZoneDTO;
import com.example.proyectoFinal1.model.RecyclingZone;
import com.example.proyectoFinal1.repository.RecyclingZoneRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class RecyclingZoneService {

    @Autowired
    private RecyclingZoneRepository recyclingZoneRepository;

    public List<RecyclingZoneDTO> getAllRecyclingZones(){
        return recyclingZoneRepository.findAll().
                stream().map(this::convertEntityToDTO).collect(Collectors.toList());

    }

    private RecyclingZoneDTO convertEntityToDTO(RecyclingZone recyclingZone){
        RecyclingZoneDTO recyclingZoneDTO = new RecyclingZoneDTO();
        recyclingZoneDTO.setRecyclingZoneId(recyclingZone.getId());
        recyclingZoneDTO.setRecyclingZoneName(recyclingZone.getName());
        recyclingZoneDTO.setRecyclingZoneAdress(recyclingZone.getAdress());

        return recyclingZoneDTO;
    }
}
