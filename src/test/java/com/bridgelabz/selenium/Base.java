package com.bridgelabz.selenium;

import org.testng.annotations.BeforeTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Base {
    public static Connection con;
    @BeforeTest
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        //Driver loaded
        Class.forName("com.mysql.cj.jdbc.Driver");
        //Connection created
        String jdbcURL = "jdbc:mysql://localhost:3306/spotifydb?useSSL=false";
        String userName= "root";
        String password = "ASDF@123QW";
        Connection connection;
        System.out.println("connecting to jdbc" + jdbcURL);
        connection = DriverManager.getConnection(jdbcURL, userName, password);
        System.out.println("connection is successful:" + connection);
        return connection;
    }
}
