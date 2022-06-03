package com.bayer.data.dao;

import com.bayer.business.model.Disease;
import com.bayer.business.model.DiseaseRecord;
import com.bayer.business.model.Person;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiseaseRecordDao implements CRUD<DiseaseRecord> {
    PersonDao personDao = new PersonDao();

    @Override
    public int create(DiseaseRecord diseaseRecord) {
        PreparedStatement statement;

        try {
            statement = connection.prepareStatement(
                    "INSERT INTO DOENCA_REGISTRO(ID_REGISTRO, PESSOA_ID_PESSOA, DOENCA_ID_DOENCA,DATA_REGISTRO_DOENCA) " +
                            "VALUES (SQ_DOENCA_REFISTRO.NEXTVAL, ?, ?, ?,)");

            statement.setLong(1, diseaseRecord.getPerson().getIdPerson());
            statement.setLong(2, diseaseRecord.getDisease().getId());
            statement.setDate(3, diseaseRecord.getDate());

            return databaseManager.executeWriteQuery(statement);
        } catch (SQLException e) {
            System.out.println("Não achou a tabela ou não conectou ao banco de dados (DISEASE_RECORD_DAO)");
        }
        return 0;
    }

    @Override
    public int update(DiseaseRecord diseaseRecord) {
        return 0;
    }

    @Override
    public int update(List<DiseaseRecord> t) {
        return 0;
    }

    @Override
    public int delete(int id) {
        return 0;
    }

    @Override
    public int delete(DiseaseRecord diseaseRecord) {
        return 0;
    }

    @Override
    public DiseaseRecord findById(long id) {
        return null;
    }

    public List<DiseaseRecord> findRecordsByPersonId(long id) {
        ResultSet resultSet;
        List<DiseaseRecord> diseaseRecords = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM DOENCA_REGISTRO WHERE PESSOA_ID_PESSOA = ?");
            statement.setLong(1, id);
            resultSet = databaseManager.executeReadQuery(statement);

            while (resultSet.next()) {
                diseaseRecords.add(new DiseaseRecord(
                        resultSet.getInt("ID_REGISTRO"),
                        resultSet.getDate("DATA_REGISTRO_DOENCA"),
                        new Person(id),
                        Disease.getDisease(resultSet.getInt("DOENCA_ID_DOENCA"))
                ));
            }


        } catch (SQLException e) {
            System.out.println("Não achou a tabela ou não conectou ao banco de dados (PersonDAO - FindByName)");
            e.printStackTrace();
        }
        return diseaseRecords;
    }

    @Override
    public List<DiseaseRecord> selectAll() {
        PreparedStatement statement;
        List<DiseaseRecord> diseaseRecords = new ArrayList<>();
        try {
            statement = connection.prepareStatement("SELECT * FROM DOENCA_REGISTRO");
            ResultSet resultSet = databaseManager.executeReadQuery(statement);
            while (resultSet.next()) {
                diseaseRecords.add(new DiseaseRecord(
                        resultSet.getInt("ID_REGISTRO"),
                        resultSet.getDate("DATA_REGISTRO_DOENCA"),
                        personDao.findById(resultSet.getInt("PESSOA_ID_PESSOA")),
                        Disease.getDisease(resultSet.getInt("DOENCA_ID_DOENCA"))
                ));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return diseaseRecords;
    }
}
