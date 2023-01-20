package com.example.proyectoFinal1.model;

import lombok.Getter;

@Getter
public enum ThrashType {

    BATTERIES("batteries"), NONRECYCLABLE("nonrecyclable"), GLASS("glass"), PAPER("paper"), ORGANICS("organics");

    public final String value;
    ThrashType(String type) {
        this.value=type;
    }
}
