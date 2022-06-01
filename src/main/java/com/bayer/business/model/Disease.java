package com.bayer.business.model;

public enum Disease {
    DENGUE("DENGUE", 1),
    ZIKA("ZIKA", 2),
    MALARIA("MALÁRIA", 3),
    MICROCEFALIA("MICROCEFALIA", 4);

    String name;
    int id;

    Disease(String name, int id){
        this.name = name;
        this.id = id;
    }
}
