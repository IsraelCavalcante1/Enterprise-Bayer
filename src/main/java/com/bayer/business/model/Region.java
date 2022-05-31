package com.bayer.business.model;

public enum Region {
    SOUTH(1, "Sul"),
    SOUTH_EAST(2, "Sudeste"),
    CENTER_WEST(3, "Centro-Oeste"),
    NORTH_EAST(4, "Nordeste"),
    NORTH(5, "Norte");

    private int id;
    private String name;

    Region(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
