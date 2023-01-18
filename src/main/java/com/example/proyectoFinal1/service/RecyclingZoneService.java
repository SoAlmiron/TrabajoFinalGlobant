package com.example.proyectoFinal1.service;

import com.example.proyectoFinal1.dto.RecyclingZoneDTO;
import com.example.proyectoFinal1.model.RecyclingZone;
import com.example.proyectoFinal1.repository.RecyclingZoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RecyclingZoneService {

    @Autowired
    private RecyclingZoneRepository recyclingZoneRepository;

    public void deleteRecyclingZone(Long RecyclingZoneid) {
         boolean exists = recyclingZoneRepository.existsById(RecyclingZoneid);
         if (!exists){
             throw new IllegalStateException("RecyclingZone with id" + RecyclingZoneid + "does not exist");
         }
        recyclingZoneRepository.deleteById(RecyclingZoneid);
    }

    public List<RecyclingZone> getAllRecyclingZones(){
        return recyclingZoneRepository.findAll();
                //stream().map(this::convertEntityToDTO).collect(Collectors.toList());

    }

    public void addNewRecyclingZone(RecyclingZone recyclingZone) {
        recyclingZoneRepository.save(recyclingZone);
    }

    public RecyclingZoneDTO getRecyclingZoneById(Long recyclingZoneId){
        boolean exists = recyclingZoneRepository.existsById(recyclingZoneId);
        if (!exists) {
            throw new IllegalStateException("RecyclingZone with id" + recyclingZoneId + "does not exist");
        }
         Optional<RecyclingZone> rz= recyclingZoneRepository.findById(recyclingZoneId);
         RecyclingZoneDTO rzDTO = convertEntityToDTO(rz.get());
         return rzDTO;
    }

    public RecyclingZone saveRecyclingZone(RecyclingZone recyclingZone){
        return recyclingZoneRepository.save(recyclingZone);
    }
    private RecyclingZoneDTO convertEntityToDTO(RecyclingZone recyclingZone){
        RecyclingZoneDTO recyclingZoneDTO = new RecyclingZoneDTO();
        recyclingZoneDTO.setRecyclingZoneId(recyclingZone.getId());
        recyclingZoneDTO.setRecyclingZoneName(recyclingZone.getName());
        recyclingZoneDTO.setRecyclingZoneAddress(recyclingZone.getAdress());
        recyclingZoneDTO.setZoneSupervisorId(recyclingZone.getZoneSupervisor().getId());
        recyclingZoneDTO.setZoneSupervisorName(recyclingZone.getZoneSupervisor().getName());
        return recyclingZoneDTO;
    }

    public void updateRecyclingZone(RecyclingZone recyclingZone, Long id){
        Optional<RecyclingZone> exists = recyclingZoneRepository.findById(id);
        RecyclingZone zone = exists.get();
        zone.setId(recyclingZone.getId());
        zone.setName(recyclingZone.getName());
        zone.setAdress(recyclingZone.getAdress());
        zone.setLatitude(recyclingZone.getLatitude());
        zone.setLongitude(recyclingZone.getLongitude());

        recyclingZoneRepository.save(zone);
    }

}
