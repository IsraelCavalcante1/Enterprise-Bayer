package com.bayer.business.model;

public enum Disease {
    DENGUE("DENGUE"),
    ZIKA("ZIKA"),
    MALARIA("MALÁRIA"),
    MICROCEFALIA("MICROCEFALIA");

    String name;

    Disease(String name){
        this.name = name;
    }
}
