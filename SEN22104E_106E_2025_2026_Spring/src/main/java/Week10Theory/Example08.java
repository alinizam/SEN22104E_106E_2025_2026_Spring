/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week10Theory;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ali.nizam
 */
public class Example08 {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String userName = "root";
        String passWord = "fsmvu1234";
        Connection c = DriverManager.getConnection(url, userName, passWord);
        Statement s=c.createStatement();
        ResultSet rs=s.executeQuery("SELECT * FROM employee");
        ResultSetMetaData rsMD=rs.getMetaData();
        for (int i = 1; i <= rsMD.getColumnCount(); i++) {
            System.out.println(rsMD.getColumnName(i)+" "+rsMD.getColumnTypeName(i));
        } 
    }
}
