package com.bayer.business.model;

public enum Gender {
    MALE("M", "Masculino"),
    FEMALE("F", "Feminino"),
    UNKNOWN("X", "Desconhecido");

    String shortName;
    String fullName;

    Gender(String shortName, String fullName) {
        this.shortName = shortName;
        this.fullName = fullName;
    }

    public String getShortName() {
        return shortName;
    }

    public static Gender getGender(String genderShortName) {
        switch (genderShortName) {
            case "M":
                return MALE;
            case "F":
                return FEMALE;
            default:
                return UNKNOWN;
        }
    }
}
