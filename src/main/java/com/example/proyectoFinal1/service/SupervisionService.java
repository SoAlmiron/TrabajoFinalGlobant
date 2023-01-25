package com.example.proyectoFinal1.service;

import com.example.proyectoFinal1.model.RecyclingZone;
import com.example.proyectoFinal1.model.Supervision;
import com.example.proyectoFinal1.repository.RecyclingZoneRepository;
import com.example.proyectoFinal1.repository.SupervisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SupervisionService {
    @Autowired
    private SupervisionRepository supervisionRepository;
    private RecyclingZoneRepository zoneRepository;

    public void newSupervision (Supervision supervision){
        supervisionRepository.save(supervision);
    }

    public Supervision getSupervisionById(Long SupervisionId){
        boolean exists = supervisionRepository.existsById(SupervisionId);
        if (!exists) {
            throw new IllegalStateException("RecyclingZone with id" + SupervisionId + "does not exist");
        }
        Optional<Supervision> supervision= supervisionRepository.findById(SupervisionId);
        return supervision.get();
    }
    public double getOccupancyCapacity (Long recyclingZoneId){
        //Veri zoneRepository.existsById();
        Optional<RecyclingZone> rz = zoneRepository.findById(recyclingZoneId);
        int totalContainers = rz.get().getContainers().size();
        int totalOccupancyCapacity = totalContainers * 1000;

        //for ( rz.get().getContainers() : totalContainers) {

        }




    }
}
