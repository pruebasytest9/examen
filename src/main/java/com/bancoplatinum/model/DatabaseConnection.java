package com.bancoplatinum.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/bancodb";
        String user = "root";
        String password = "123456";

        return DriverManager.getConnection(url, user, password);
    }
}