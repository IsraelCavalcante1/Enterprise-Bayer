package com.bayer.business.model;

public class Disease {
    private int id;
    private String name;


    public Disease(String name) {
//        this.id = id; Não estamos utilizando o id, pois o próprio banco de dados já faz esse tratamento       this.name = name;
    }

    public Disease() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
