package com.bayer.business.model;

public class Address {

    private int id;
    private String city;
    private String neighborhood;
    private String street;
    private int number;
    private UnionState state;

    public Address(int id, String city, String neighborhood, String street, int number, UnionState state) {
        this.id = id;
        this.city = city;
        this.neighborhood = neighborhood;
        this.street = street;
        this.number = number;
        this.state = state;
    }

    public String getFullAddress() {
        StringBuilder sb = new StringBuilder();
        sb
                .append(street).append(" ")
                .append(", ").append(number)
                .append(neighborhood).append(" ")
                .append(city).append(" ")
                .append(state.getShortName());

        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public UnionState getState() {
        return state;
    }

    public void setState(UnionState state) {
        this.state = state;
    }
}
