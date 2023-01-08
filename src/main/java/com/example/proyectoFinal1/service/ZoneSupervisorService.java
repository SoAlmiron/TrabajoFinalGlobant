package com.example.proyectoFinal1.service;

import com.example.proyectoFinal1.dto.ZoneSupervisorDTO;
import com.example.proyectoFinal1.model.ZoneSupervisor;
import com.example.proyectoFinal1.repository.ZoneSupervisorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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

    public List<ZoneSupervisorDTO> getAllZoneSupervisors(){
        return zoneSupervisorRepository.findAll().
                stream().map(this::convertEntityToDTO).collect(Collectors.toList());

    }

    public void addNewZoneSupervisor(ZoneSupervisor zoneSupervisor) {
        zoneSupervisorRepository.save(zoneSupervisor);

    }

    public ZoneSupervisorDTO getZoneSupervisorById(Long ZoneSupervisorId){
        boolean exists = zoneSupervisorRepository.existsById(ZoneSupervisorId);
        if (!exists) {
            throw new IllegalStateException("RecyclingZone with id" + ZoneSupervisorId + "does not exist");
        }
        Optional<ZoneSupervisor> rz= zoneSupervisorRepository.findById(ZoneSupervisorId);
        ZoneSupervisorDTO rzDTO = convertEntityToDTO(rz.get());
        return rzDTO;
    }

    public ZoneSupervisor saveZonerSupervisor(ZoneSupervisor zoneSupervisor){
        return zoneSupervisorRepository.save(zoneSupervisor);
    }
    private ZoneSupervisorDTO convertEntityToDTO(ZoneSupervisor zoneSupervisor){
        ZoneSupervisorDTO ZoneSupervisorDTO = new ZoneSupervisorDTO();
        ZoneSupervisorDTO.setZoneSupervisorId(zoneSupervisor.getId());
        ZoneSupervisorDTO.setZoneSupervisorName(zoneSupervisor.getName());
        ZoneSupervisorDTO.setZoneSupervisorZoneId(zoneSupervisor.getZoneId());
        //recyclingZoneDTO.setRecyclingZoneAdress(recyclingZone.getAdress());

        return ZoneSupervisorDTO;
    }


}
