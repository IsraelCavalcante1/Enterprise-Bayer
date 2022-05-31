package src.main.java.data.dao;

import src.main.java.business.model.Person;

import java.util.List;

public class PersonDao implements CRUD<Person> {
    @Override
    public int create(Person person) {
        return 0;
    }

    @Override
    public int update(Person person) {
        return 0;
    }

    @Override
    public int update(List<Person> t) {
        return 0;
    }

    @Override
    public int delete(int id) {
        return 0;
    }

    @Override
    public int delete(Person person) {
        return 0;
    }

    @Override
    public Person findById(int id) {
        return null;
    }

    @Override
    public List<Person> selectAll() {
        return null;
    }
}
