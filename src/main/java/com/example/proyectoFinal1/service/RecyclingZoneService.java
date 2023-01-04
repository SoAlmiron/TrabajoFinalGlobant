package com.example.proyectoFinal1.service;

import com.example.proyectoFinal1.dto.RecyclingZoneDTO;
import com.example.proyectoFinal1.model.RecyclingZone;
import com.example.proyectoFinal1.repository.RecyclingZoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RecyclingZoneService {

    @Autowired
    private final RecyclingZoneRepository recyclingZoneRepository;

    public RecyclingZoneService(RecyclingZoneRepository recyclingZoneRepository) {
        this.recyclingZoneRepository = recyclingZoneRepository;
    }


    public void addNewRecyclingZone(RecyclingZone recyclingZone) {
        recyclingZoneRepository.save(recyclingZone);
    }

    public void deleteRecyclingZone(Long RecyclingZoneid) {
         boolean exists = recyclingZoneRepository.existsById(RecyclingZoneid);
         if (!exists){
             throw new IllegalStateException("RecyclingZone with id" + RecyclingZoneid + "does not exist");
         }
        recyclingZoneRepository.deleteById(RecyclingZoneid);
    }

    public List<RecyclingZoneDTO> getAllRecyclingZones(){
        return recyclingZoneRepository.findAll().
                stream().map(this::convertEntityToDTO).collect(Collectors.toList());

    }

//    public List<RecyclingZone> getAllRecyclingZones() {
//        return recyclingZoneRepository.findAll();
//    }
    public void addNewZone(RecyclingZone recyclingZone) {
        recyclingZoneRepository.save(recyclingZone);

    }

    private RecyclingZoneDTO convertEntityToDTO(RecyclingZone recyclingZone){
        RecyclingZoneDTO recyclingZoneDTO = new RecyclingZoneDTO();
        recyclingZoneDTO.setRecyclingZoneId(recyclingZone.getId());
        recyclingZoneDTO.setRecyclingZoneName(recyclingZone.getName());
        recyclingZoneDTO.setRecyclingZoneAdress(recyclingZone.getAdress());

        return recyclingZoneDTO;
    }



}
