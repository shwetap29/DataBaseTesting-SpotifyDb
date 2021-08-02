package com.bridgelabz.selenium;

import org.testng.annotations.Test;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTesting  extends Base {
    private int count;

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
            count++;
        }
    }

    @Test
    public void insert_table_data() throws ClassNotFoundException, SQLException {
        con = this.getConnection();
        PreparedStatement pst = con.prepareStatement("insert into user VALUES(?,?,?)");
        pst.setInt(1, 7);
        pst.setString(2, "Rakesh");
        pst.setString(3, "rakeshprasad55@gmail.com");
        pst.executeUpdate();
    }
    @Test
    public void update_values_into_table() throws ClassNotFoundException, SQLException {
        con = this.getConnection();
        PreparedStatement pst = con.prepareStatement("UPDATE tracks SET playlist=? WHERE track=?");
                pst.setString(1,"Fusion");
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

    @Test
    public void order_by_playlistName() throws ClassNotFoundException, SQLException {
        con = this.getConnection();
        PreparedStatement pst=con.prepareStatement("SELECT * FROM playlist ORDER BY playlistName");
        pst.setInt(1,6);
        pst.setString(2,"Bollywood");
        pst.executeUpdate();
    }
}



