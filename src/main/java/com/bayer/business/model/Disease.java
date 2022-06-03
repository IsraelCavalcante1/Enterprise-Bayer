package com.bayer.business.model;

public enum Disease {
    DENGUE("DENGUE", 1),
    ZIKA("ZIKA", 2),
    MALARIA("MALÁRIA", 3),
    MICROCEFALIA("MICROCEFALIA", 4);

    String name;
    int id;

    Disease(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public static Disease getDisease(int id) {
        for (Disease d : values()) {
            if (d.id == id) return d;
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
