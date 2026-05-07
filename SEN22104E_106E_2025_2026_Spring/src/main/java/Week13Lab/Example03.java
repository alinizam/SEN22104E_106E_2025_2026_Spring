/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13Lab;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author ali.nizam
 */
public class Example03 {
    public static void main(String[] args) throws IOException {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("SEN22104E_106E_2025_2026_Spring");
        EntityManager em=emf.createEntityManager();
        String file="c:\\files\\employees.txt";
        Scanner s=new Scanner(new FileInputStream(file));
        em.getTransaction().begin();
        while ( s.hasNext()){
            int id=s.nextInt();
            s.next();
            s.next();
            int salary=s.nextInt();
            Query q=em.createQuery("update Employee e "
                    + " set e.salary=:pSalary "
                    + " where e.idEmployee=:pId");
           
            q.setParameter("pSalary", salary);
            q.setParameter("pId", id);
            q.executeUpdate();
            
        }
        em.getTransaction().commit();
        s.close();
        em.close();
        emf.close();
        
        
    }
}
