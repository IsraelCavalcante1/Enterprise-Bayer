package com.bayer.data.dao;

import com.bayer.business.model.Person;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class PersonDao implements CRUD<Person> {


    @Override
    public int create(Person person) {

        //TODO ADICIONAR NOTA DE OBSERVAÇÃO PARA CONFIGURAR O ARTIFACT
        // TODO Como será feita a inserção de relacionamento de companheiro

        PreparedStatement statement;
        try {
            statement = connection.prepareStatement(
                    "INSERT INTO Pessoa(ID_PESSOA, PESSOA_ID_PESSOA, ENDERECO_ID_ENDERECO, CPF, NOME, ID_SUS, SEXO) " +
                            "VALUES (SQ_PESSOA.NEXTVAL, ?, ?, ?, ?,?,?,?)");

            statement.setInt(1, person.getIdPerson());
            statement.setInt(2, person.getCompanion().getIdPerson());
            statement.setInt(3, person.getAddress().getId());

            Date data = new Date(person.getBirthDate().getTime());

            statement.setLong(4, person.getCpf());
            statement.setString(5, person.getName());
            statement.setLong(6, person.getIdSus());
            statement.setString(7, person.getGender().getShortName());
            return databaseManager.executeWriteQuery(statement);
        } catch (SQLException e) {
            System.out.println("Não achou a tabela ou não conectou ao banco de dados (PERSONDAO)");
        }
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
