package com.bayer.data.dao;

import com.bayer.business.model.Person;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class PersonDao implements CRUD<Person> {


    @Override
    public int create(Person person) {

        PreparedStatement statement;
        try {
            statement = connection.prepareStatement(
                    "INSERT INTO Pessoa(ID_PESSOA, ENDERECO_ID_ENDERECO, CPF, NOME, ID_SUS, SEXO, NASCIMENTO) " +
                            "VALUES (SQ_PESSOA.NEXTVAL, ?, ?, ?,?,?,?)");


            statement.setInt(1, person.getAddress().getId());

            Date data = new Date(person.getBirthDate().getTime());

            statement.setLong(2, person.getCpf());
            statement.setString(3, person.getName());
            statement.setLong(4, person.getIdSus());
            statement.setString(5, person.getGender().getShortName());
            statement.setDate(6, data);

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

    public int updateCompanion(Person person) {
        PreparedStatement statement;
        try {
            statement = connection.prepareStatement(
                    "UPDATE PESSOA " + "SET PESSOA_ID_PESSOA = ? WHERE ID_PESSOA = ?");
            statement.setInt(1, person.getCompanion().getIdPerson());
            statement.setInt(2, person.getIdPerson());
            return databaseManager.executeWriteQuery(statement);
        } catch (SQLException e) {
            e.printStackTrace();
        }
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

    public Person findByCpf(long cpf) {
        ResultSet resultSet;
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM PESSOA WHERE cpf LIKE ?");
            statement.setLong(1, cpf);
            resultSet = databaseManager.executeReadQuery(statement);

            if (resultSet.next()) {
                return new Person(
                        resultSet.getInt("ID_PESSOA"));
            }

        } catch (SQLException e) {
            System.out.println("Não achou a tabela ou não conectou ao banco de dados (PersonDAO - FindByName)");
            e.printStackTrace();
        }

        return null;
    }

}
