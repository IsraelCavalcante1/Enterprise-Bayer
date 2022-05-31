package com.bayer.business.model;

// Depende de região

public class UnionState {
    private int id;
    private Region region;
    private String name;
    private String shortName;

    public UnionState(Region region, String name, String shortName) {
        this.region = region;
        this.name = name;
        this.shortName = shortName;
    }

    public int getId() {
        return id;
    }

    public Region getRegion() {
        return region;
    }

    public String getName() {
        return name;
    }

    public String getShortName() {
        return shortName;
    }
}