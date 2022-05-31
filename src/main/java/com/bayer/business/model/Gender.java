package com.bayer.business.model;

public enum Gender {
    MALE("M", "Masculino"),
    FEMALE("F", "Feminino");

    String shortName;
    String fullName;

    Gender(String shortName, String fullName) {
        this.shortName = shortName;
        this.fullName = fullName;
    }


    public String getShortName(){
        return shortName;
    }

}
