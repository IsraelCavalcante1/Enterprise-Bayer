package src.main.java.business.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Person {
    private int cpf;
    private String name;
    private Person companion;
    private List<Person> dependents;
    private Gender gender;
    private Date birthDate;
    private List<DiseaseRecord> diseaseRecords = new ArrayList<>();
    private boolean isPregnant;

    public Person(int cpf, String name, Person companion, List<Person> dependents, Gender gender, Date birthDate, boolean isPregnant, List<DiseaseRecord> diseaseRecords) {
        this.cpf = cpf;
        this.name = name;
        this.companion = companion;
        this.dependents = dependents;
        this.gender = gender;
        this.birthDate = birthDate;
        this.isPregnant = isPregnant;
        this.diseaseRecords.addAll(diseaseRecords);
    }

    public Person(int cpf, String name, Person companion, List<Person> dependents, Gender gender, Date birthDate, boolean isPregnant, DiseaseRecord diseaseRecord) {
        this(cpf, name, companion, dependents, gender, birthDate, isPregnant, List.of(diseaseRecord));
    }
}
