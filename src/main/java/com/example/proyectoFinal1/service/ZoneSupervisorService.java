package com.example.proyectoFinal1.service;

import com.example.proyectoFinal1.model.RecyclingZone;
import com.example.proyectoFinal1.model.ZoneSupervisor;
import com.example.proyectoFinal1.repository.ZoneSupervisorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ZoneSupervisorService {

    @Autowired
    private ZoneSupervisorRepository zoneSupervisorRepository;

    public void deleteZoneSupervisor(Long zoneSupervisorId) {
        boolean exists = zoneSupervisorRepository.existsById(zoneSupervisorId);
        if (!exists){
            throw new IllegalStateException("ZoneSupervisor with id" + zoneSupervisorId + "does not exist");
        }
        zoneSupervisorRepository.deleteById(zoneSupervisorId);
    }

    public List<ZoneSupervisor> getAllZoneSupervisors(){
        /*return zoneSupervisorRepository.findAll().
                stream().map(this::convertEntityToDTO).collect(Collectors.toList());*/
        return zoneSupervisorRepository.findAll();
    }

    public void addNewZoneSupervisor(ZoneSupervisor zoneSupervisor) {
        zoneSupervisorRepository.save(zoneSupervisor);

    }

    public ZoneSupervisor getZoneSupervisorById(Long ZoneSupervisorId){
        boolean exists = zoneSupervisorRepository.existsById(ZoneSupervisorId);
        if (!exists) {
            throw new IllegalStateException("RecyclingZone with id" + ZoneSupervisorId + "does not exist");
        }
        Optional<ZoneSupervisor> rz= zoneSupervisorRepository.findById(ZoneSupervisorId);
        //ZoneSupervisorDTO rzDTO = convertEntityToDTO(rz.get());
        return rz.get();
    }

    public ZoneSupervisor saveZonerSupervisor(ZoneSupervisor zoneSupervisor){
        return zoneSupervisorRepository.save(zoneSupervisor);
    }

    public void updateZoneSupervisor(ZoneSupervisor zoneSupervisor, Long id){
        ZoneSupervisor existingZoneSupervisor = zoneSupervisorRepository.findById(id).orElseThrow(
                () -> new IllegalStateException("ZoneSupervisor with id" + id + "does not exist"));
        existingZoneSupervisor.setId(zoneSupervisor.getId());
        existingZoneSupervisor.setName(zoneSupervisor.getName());
        zoneSupervisorRepository.save(existingZoneSupervisor);
    }

}
