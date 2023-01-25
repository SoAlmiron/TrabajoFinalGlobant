package com.example.proyectoFinal1.model;

public enum OccupancyCapacity {
    EMPTY(0), HALF(500), FULL(1000), OVERLOAD(1200);
    private final int value;
    OccupancyCapacity(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
