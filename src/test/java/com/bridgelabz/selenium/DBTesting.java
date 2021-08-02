package com.bridgelabz.selenium;

import org.testng.annotations.Test;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTesting  extends Base {
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
        pst.setInt(1, 7);
        pst.setString(2, "Rakesh");
        pst.setString(3, "rakeshprasad55@gmail.com");
        pst.executeUpdate();
    }
}


