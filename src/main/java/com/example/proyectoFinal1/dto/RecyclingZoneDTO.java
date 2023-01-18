package com.example.proyectoFinal1.dto;

import lombok.Data;

@Data
public class RecyclingZoneDTO {
    private Long recyclingZoneId;
    private String recyclingZoneName;
    private String recyclingZoneAddress;
    private Long zoneSupervisorId;
    private String zoneSupervisorName;


    /*public Long getRecyclingZoneId() {
        return recyclingZoneId;
    }

    public void setRecyclingZoneId(Long recyclingZoneId) {
        this.recyclingZoneId = recyclingZoneId;
    }

    public String getRecyclingZoneName() {
        return RecyclingZoneName;
    }

    public void setRecyclingZoneName(String recyclingZoneName) {
        RecyclingZoneName = recyclingZoneName;
    }

    public String getRecyclingZoneAdress() {
        return getRecyclingZoneAddress();
    }

    public void setRecyclingZoneAdress(String recyclingZoneAdress) {
        this.RecyclingZoneAddress = recyclingZoneAdress;
    }*/

}
