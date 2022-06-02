package com.bayer.business.model;

import java.util.Date;

//TODO AVISAR GU QUE ADICIONAMOS A PESSOA

public class DiseaseRecord {
    private int id;
    private Date date;
    private Person person;
    private Disease disease;

    public DiseaseRecord(int id, Date date, Person person, Disease disease) {
        this.id = id;
        this.date = date;
        this.person = person;
        this.disease = disease;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Disease getDisease() {
        return disease;
    }

    public void setDisease(Disease disease) {
        this.disease = disease;
    }

    @Override
    public String toString() {
        return "DiseaseRecord{" +
                "id=" + id +
                ", date=" + date +
                ", person=" + person +
                ", disease=" + disease +
                '}';
    }
}