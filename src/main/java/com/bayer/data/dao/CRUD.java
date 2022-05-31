package com.bayer.data.dao;

import java.sql.Connection;
import java.util.List;

public interface CRUD<T> {

    DatabaseManager databaseManager = new DatabaseManager();
    Connection connection = databaseManager.getConnection();

    int create(T t);

    int update(T t);

    int update(List<T> t);

    int delete(int id);

    int delete(T t);

    T findById(int id);

    List<T> selectAll();

}