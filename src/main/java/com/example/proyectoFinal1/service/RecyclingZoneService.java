package com.example.proyectoFinal1.service;

import com.example.proyectoFinal1.dto.RecyclingZoneDTO;
import com.example.proyectoFinal1.model.RecyclingZone;
import com.example.proyectoFinal1.repository.RecyclingZoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
//        for (Container container :recyclingZone.getContainers()){
//            if(Type.valueOf(container.getType().getValue()) != Type.GLASS){
//                throw new IllegalArgumentException("incorrectooooo");
//            }
//        }
        recyclingZoneRepository.save(recyclingZone);
    }

    public RecyclingZone getRecyclingZoneById(Long recyclingZoneId){
        boolean exists = recyclingZoneRepository.existsById(recyclingZoneId);
        if (!exists) {
            throw new IllegalStateException("RecyclingZone with id" + recyclingZoneId + "does not exist");
        }
         Optional<RecyclingZone> rz= recyclingZoneRepository.findById(recyclingZoneId);
         //RecyclingZoneDTO rzDTO = convertEntityToDTO(rz.get());
         return rz.get();
    }

    public double getRecyclingZonesDistance(Long id1, Long id2){
        Optional<RecyclingZone> rz1 = recyclingZoneRepository.findById(id1);
        Optional<RecyclingZone> rz2 = recyclingZoneRepository.findById(id2);
        Double latitude1 = rz1.get().getLatitude();
        Double longitude1 = rz1.get().getLongitude();
        Double latitude2 = rz2.get().getLatitude();
        Double longitude2 = rz2.get().getLongitude();

        Double diferenciaLats = (latitude2 - latitude1)*Math.PI/180;
        Double diferenciaLongs = (longitude2 - longitude1)*Math.PI/180;

        double a = Math.pow(Math.sin(diferenciaLats/2), 2) +
                Math.cos(latitude1*Math.PI/180)*
                    Math.cos(latitude2*Math.PI/180)*
                        Math.pow(Math.sin(diferenciaLongs/2), 2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return 6378.0 * c;
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
