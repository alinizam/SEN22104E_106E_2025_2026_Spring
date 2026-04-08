/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week09Theory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ali.nizam
 */
public class Example01 {
    public static void main(String[] args) throws SQLException {
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","fsmvu1234");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from departments");
        while(rs.next()){
            System.out.println(rs.getString("department_id")+":"+rs.getString("name"));
        }
    }
}
