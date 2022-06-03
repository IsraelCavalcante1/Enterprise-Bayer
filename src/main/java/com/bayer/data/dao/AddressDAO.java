package com.bayer.data.dao;

import com.bayer.business.model.Address;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class AddressDAO implements CRUD<Address>{

    public int create(Address address) {

        //TODO ADICIONAR NOTA DE OBSERVAÇÃO PARA CONFIGURAR O ARTIFACT


        PreparedStatement statement;
        try {
            statement = connection.prepareStatement(
                    "INSERT INTO ENDERECO(ID_ENDERECO, CIDADE, BAIRRO, RUA, NUMERO, ESTADO_ID_ESTADO) " +
                            "VALUES (SQ_ENDERECO.NEXTVAL, ?, ?, ?, ?,?)");

            statement.setString(1, address.getCity());
            statement.setString(2, address.getNeighborhood());
            statement.setString(3, address.getStreet());
            statement.setInt(4, address.getNumber());
            statement.setInt(5, address.getIdState());

            return databaseManager.executeWriteQuery(statement);
        } catch (SQLException e) {
            System.out.println("Não achou a tabela ou não conectou ao banco de dados (AddressDAO)");
        }
        return 0;
    }

    @Override
    public int update(Address address) {
        return 0;
    }

    @Override
    public int update(List<Address> t) {
        return 0;
    }

    @Override
    public int delete(int id) {
        return 0;
    }

    @Override
    public int delete(Address address) {
        return 0;
    }

    @Override
    public Address findById(long id) {
        return null;
    }

    @Override
    public List<Address> selectAll() {
        return null;
    }
}
