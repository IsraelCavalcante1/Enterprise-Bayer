package com.bayer.data.dao;

import java.sql.*;

public class DatabaseManager {
    private static final String DATABASE_DRIVER = "oracle.jdbc.driver.OracleDriver";
    private static final String DATABASE_HOST = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
    private static final String USER_LOGIN = "RM92582";
    private static final String USER_PASSWORD = "080502";

    private static Connection connection;

    public DatabaseManager() {
        try {
            Class.forName(DATABASE_DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void openConnection() {

        try {
            connection = DriverManager.getConnection(DATABASE_HOST, USER_LOGIN, USER_PASSWORD);
        } catch (SQLException e) {
            System.out.println("Houve algum erro no openConnection");
        }
    }

    public Connection getConnection() {
        openConnection();
        System.out.println("Conexão aberta com sucesso");
        return connection;
    }

    private void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int executeWriteQuery(PreparedStatement statement) {
        int affectedRows = 0;
        try {
            affectedRows = statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return affectedRows;
    }

    public ResultSet executeReadQuery(PreparedStatement statement) {
        ResultSet resultSet = null;
        try {
            resultSet = statement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }

}