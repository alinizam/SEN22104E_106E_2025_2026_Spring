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
public class Example05 {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/mydb";
        String userName="root";
        String passWord="fsmvu1234"; 
        int departmentId=1;
        String departmentName="Software Engineering";
        String sqlInsert="INSERT INTO employee (idEmployee,firstName,department_id) VALUES (?,?,?)";  
        String sqlUpdate="UPDATE departments SET emp_count=emp_count+1 WHERE department_id=?";  
        try(Connection c=DriverManager.getConnection(url,userName,passWord);   
            PreparedStatement psInsert=c.prepareStatement(sqlInsert);
            PreparedStatement psUpdate=c.prepareStatement(sqlUpdate);){
            c.setAutoCommit(false);

            psUpdate.setInt(1, departmentId);
            psUpdate.executeUpdate();
            
            int i=1/0;
             
            int employeeId=14;
            psInsert.setInt(1, employeeId);
            String firstName="Yasin";
            psInsert.setString(2, firstName);
            psInsert.setInt(3, departmentId);
            psInsert.executeUpdate();
           
           
            c.commit();
            
        } catch (SQLException e) {
            System.out.println(e.getErrorCode()+" "+e.getMessage());
        }
    }
}
