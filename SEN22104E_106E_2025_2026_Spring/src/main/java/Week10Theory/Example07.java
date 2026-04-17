/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week10Theory;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ali.nizam
 */
public class Example07 {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String userName = "root";
        String passWord = "fsmvu1234";
        Connection c = DriverManager.getConnection(url, userName, passWord);

        DatabaseMetaData dbMD = c.getMetaData();
        System.out.println(dbMD.getDatabaseProductName());
        System.out.println(dbMD.getDatabaseMajorVersion());
        System.out.println(dbMD.getDatabaseMinorVersion());

    }
}
