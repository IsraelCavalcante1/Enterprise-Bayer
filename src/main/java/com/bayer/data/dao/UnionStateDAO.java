package com.bayer.data.dao;

import com.bayer.business.model.Person;
import com.bayer.business.model.UnionState;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class UnionStateDAO implements CRUD<UnionState>{


    @Override
    public int create(UnionState unionState) {
        PreparedStatement statement;
        try {
            statement = connection.prepareStatement(
                    "INSERT INTO ESTADO(ID_ESTADO, NOME_ESTADO, REGIAO_ID_REGIAO) " +
                            "VALUES (SQ_ESTADO.NEXTVAL, ?, ? )");

            statement.setString(1, unionState.getName());
            statement.setInt(2, unionState.getRegion().getId());

            return databaseManager.executeWriteQuery(statement);
        } catch (SQLException e) {
            System.out.println("Não achou a tabela ou não conectou ao banco de dados (UnionStateDAO)");
        }
        return 0;
    }

    @Override
    public int update(UnionState unionState) {
        return 0;
    }

    @Override
    public int update(List<UnionState> t) {
        return 0;
    }

    @Override
    public int delete(int id) {
        return 0;
    }

    @Override
    public int delete(UnionState unionState) {
        return 0;
    }

    @Override
    public UnionState findById(int id) {
        return null;
    }

    @Override
    public List<UnionState> selectAll() {
        return null;
    }
}
