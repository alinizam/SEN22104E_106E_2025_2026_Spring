/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week10Theory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ali.nizam
 */
public class Example03 {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/mydb";
        String userName="root";
        String passWord="fsmvu1234"; 
        int departmentId=5;
        String departmentName="Software Engineering";
        String sqlString="UPDATE departments SET name=? WHERE department_id > ?";  
        try(Connection c=DriverManager.getConnection(url,userName,passWord);
            
           PreparedStatement ps=c.prepareStatement(sqlString)) {
            ps.setString(1, departmentName);
            ps.setInt(2, departmentId);
            
            int recordNumber=ps.executeUpdate();
           
            System.out.println("Effected records = " + recordNumber);
        } catch (SQLException e) {
            System.out.println(e.getErrorCode()+" "+e.getMessage());
        }
    }
}
