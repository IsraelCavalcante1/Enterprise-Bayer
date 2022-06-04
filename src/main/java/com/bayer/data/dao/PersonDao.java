package com.bayer.data.dao;

import com.bayer.business.model.Address;
import com.bayer.business.model.Gender;
import com.bayer.business.model.Person;
import com.bayer.business.model.UnionState;

import java.sql.*;
import java.util.ArrayList;
import java.util.GregorianCalendar;
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
            statement.setLong(1, person.getCompanion().getIdPerson());
            statement.setLong(2, person.getIdPerson());
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
    public Person findById(long id) {
        ResultSet resultSet;
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM PESSOA WHERE ID_PESSOA = ?");
            statement.setLong(1, id);
            resultSet = databaseManager.executeReadQuery(statement);

            if (resultSet.next()) {
                Person p = createPersonFromResult(resultSet);
                statement.close();
                return p;
            }

        } catch (SQLException e) {
            System.out.println("Não achou a tabela ou não conectou ao banco de dados (PersonDAO - FindByName)");
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public List<Person> selectAll() {
        ResultSet resultSet;
        List<Person> personList = new ArrayList<>();

        try {
            resultSet = doSelectQuery();

            while (resultSet.next()) {
                Person person = createPersonFromResult(resultSet);
                person.setAddress(createAddressFromResult(resultSet));
                personList.add(person);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return personList;
    }

    private Person createPersonFromResult(ResultSet resultSet) throws SQLException {
        return new Person(
                resultSet.getLong("ID_PESSOA"),
                resultSet.getLong("CPF"),
                resultSet.getString("NOME"),
                Gender.getGender(resultSet.getString("SEXO")),
                resultSet.getDate("NASCIMENTO"),
                resultSet.getInt("ISPREGNANT") != 0,
                null,
                resultSet.getLong("ID_SUS"));
    }

    private Address createAddressFromResult(ResultSet resultSet) throws SQLException {
        UnionStateDAO stateDAO = new UnionStateDAO();
        UnionState state = stateDAO.findById(resultSet.getInt("ESTADO_ID_ESTADO"));
        return new Address(
                resultSet.getInt("ENDERECO_ID_ENDERECO"),
                resultSet.getString("CIDADE"),
                resultSet.getString("BAIRRO"),
                resultSet.getString("RUA"),
                resultSet.getInt("NUMERO"),
                state);
    }

    private ResultSet doSelectQuery() throws SQLException {
        PreparedStatement statement;
        statement = connection.prepareStatement(
                "SELECT h.endereco_id_endereco,h.id_pessoa,h.cpf,h.pessoa_id_pessoa,h.nascimento, h.nome,h.id_sus, h.sexo, h.ispregnant," +
                        "j.regiao_id_regiao,i.nome_regiao," +
                        "g.estado_id_estado,g.cidade, g.bairro, g.rua, g.numero," +
                        "l.id_registro,l.pessoa_id_pessoa,l.doenca_id_doenca, l.data_registro_doenca," +
                        "k.id_doenca,k.nome_doenca " +
                        "FROM pessoa h,endereco g,estado j,regiao i, doenca_registro l,doenca k " +
                        "WHERE g.id_endereco = h.endereco_id_endereco " +
                        "AND i.id_regiao = j.regiao_id_regiao " +
                        "AND j.id_estado = g.estado_id_estado " +
                        "AND k.id_doenca = l.doenca_id_doenca " +
                        "AND h.id_pessoa = l.pessoa_id_pessoa");

        ResultSet resultSet = databaseManager.executeReadQuery(statement);
        return resultSet;
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

    public Person findCompanionById(long idPerson) {
        ResultSet resultSet;
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM PESSOA WHERE PESSOA_ID_PESSOA = ?");
            statement.setLong(1, idPerson);
            resultSet = databaseManager.executeReadQuery(statement);

            if (resultSet.next()) {
                return createPersonFromResult(resultSet);
            }

        } catch (SQLException e) {
            System.out.println("Não achou a tabela ou não conectou ao banco de dados (PersonDAO - FindByName)");
            e.printStackTrace();
        }

        return null;
    }
}
