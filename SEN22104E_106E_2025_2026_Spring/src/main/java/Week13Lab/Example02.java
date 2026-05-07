/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13Lab;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author ali.nizam
 */
public class Example02 {
    public static void main(String[] args) throws IOException {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("SEN22104E_106E_2025_2026_Spring");
        EntityManager em=emf.createEntityManager();
        Query q=em.createQuery("select e from Employee e");
        List<Employee> employees=q.getResultList();
        String file="c:\\files\\employees.txt";
        BufferedWriter f=new BufferedWriter(new FileWriter(file));
        for (Employee e : employees) {
            f.write(e.getIdEmployee()+" "+e.getFirstName()+" "+e.getLastName()+" "+e.getSalary());
            f.newLine();
        }
        f.close();
        
    }
}
