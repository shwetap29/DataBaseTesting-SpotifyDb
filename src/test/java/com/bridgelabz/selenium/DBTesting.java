package com.bridgelabz.selenium;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.sql.*;

public class DBTesting extends Base {
    private static Connection con;
    static Connection connection = null;
    private static Statement statement;

    @Test
    public void get_table_data() throws ClassNotFoundException, SQLException {
        con = this.getConnection();
        Statement smt = con.createStatement();

        ResultSet rs = smt.executeQuery("select * from user");
        System.out.println("/****************Records**************/");
        while (rs.next()) {
            int id = rs.getInt(1);
            String name = rs.getString(2);
            String emailid = rs.getString(3);
            System.out.println(id + " " + name + " " + emailid);

        }
    }

    @Test
    public void insert_table_data() throws ClassNotFoundException, SQLException {
        con = this.getConnection();
        PreparedStatement pst = con.prepareStatement("insert into user VALUES(?,?,?)");
        pst.setInt(1, 8);
        pst.setString(2, "Mahima");
        pst.setString(3, "mahima2@gmail.com");
        pst.executeUpdate();
    }
    @Test
    public void update_values_into_table() throws ClassNotFoundException, SQLException {
        con = this.getConnection();
        PreparedStatement pst = con.prepareStatement("UPDATE tracks SET playlist=? WHERE track=?");
                pst.setString(1,"track");
                pst.setString(2,"Fusion");
                pst.executeUpdate();

    }

    @Test
    public void delete_row_from_table() throws ClassNotFoundException, SQLException {
        con = this.getConnection();
        PreparedStatement pst=con.prepareStatement("DELETE FROM tracks WHERE track= ?");
        pst.setString(1,"Rishtey");
        pst.executeUpdate();
        get_table_data();
    }

    @AfterTest                   //Close Connection
    public void tearDown() throws Exception {
        if (connection != null) {
            connection.close();
        }
    }
}



