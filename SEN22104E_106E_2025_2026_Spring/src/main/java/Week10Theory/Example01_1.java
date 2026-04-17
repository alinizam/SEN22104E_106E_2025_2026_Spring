/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week10Theory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ali.nizam
 */
public class Example01_1 {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/mydb; user='root'; password='fsmvu1234'";
        try(Connection c=DriverManager.getConnection(url);
            Statement s=c.createStatement()) {
            int departmentId=9;
            String departmentName="AE";
            String sqlString="INSERT INTO departments "
                    + " (department_id,name) VALUES"
                    + " ("+departmentId+ ","+"'"+departmentName+"')";
            System.out.println(sqlString);
            int recordNumber=s.executeUpdate(sqlString);
            System.out.println("Effected records = " + recordNumber);
        } catch (SQLException e) {
            System.out.println(e.getErrorCode()+" "+e.getMessage());
        }
    }
}
