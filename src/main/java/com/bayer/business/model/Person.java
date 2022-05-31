package com.bayer.business.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Person {
    private int idPerson;
    private long cpf;
    private String name;
    private Person companion;
    private List<Person> dependents;
    private Gender gender;
    private Date birthDate;
    private List<DiseaseRecord> diseaseRecords = new ArrayList<>();
    private boolean isPregnant;
    private Address address;
    private long idSus;

    public Person(long cpf, String name, Person companion, List<Person> dependents, Gender gender, Date birthDate, boolean isPregnant, List<DiseaseRecord> diseaseRecords) {
        this.cpf = cpf;
        this.name = name;
        this.companion = companion;
        this.dependents = dependents;
        this.gender = gender;
        this.birthDate = birthDate;
        this.isPregnant = isPregnant;
        this.diseaseRecords.addAll(diseaseRecords);
    }

    public Person( long cpf, String name, Gender gender, Date birthDate, boolean isPregnant, Address address, long idSus) {
        this.cpf = cpf;
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.isPregnant = isPregnant;
        this.address = address;
        this.idSus = idSus;
    }

    public Person(long cpf, String name, Person companion, List<Person> dependents, Gender gender, Date birthDate, boolean isPregnant, DiseaseRecord diseaseRecord) {
        this(cpf, name, companion, dependents, gender, birthDate, isPregnant, List.of(diseaseRecord));
    }


    public int getAge() {
        long timeDifference = Calendar.getInstance().getTime().getTime() - birthDate.getTime();
        return new Calendar.Builder().setInstant(timeDifference).build().get(Calendar.YEAR);
    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getCompanion() {
        return companion;
    }

    public void setCompanion(Person companion) {
        this.companion = companion;
    }

    public List<Person> getDependents() {
        return dependents;
    }

    public void setDependents(List<Person> dependents) {
        this.dependents = dependents;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public List<DiseaseRecord> getDiseaseRecords() {
        return diseaseRecords;
    }

    public void setDiseaseRecords(List<DiseaseRecord> diseaseRecords) {
        this.diseaseRecords = diseaseRecords;
    }

    public boolean isPregnant() {
        return isPregnant;
    }

    public void setPregnant(boolean pregnant) {
        isPregnant = pregnant;
    }

    public Address getAddress() {
        return address;
    }

    public void setAdress(Address adress) {
        this.address = address;
    }

    public long getIdSus() {
        return idSus;
    }

    public void setIdSus(long idSus) {
        this.idSus = idSus;
    }
}

