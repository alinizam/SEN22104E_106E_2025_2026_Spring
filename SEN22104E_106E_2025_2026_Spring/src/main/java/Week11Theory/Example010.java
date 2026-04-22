/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11Theory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author ali.nizam
 */
public class Example010 {
     //Query
    public static void main(String[] args) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("SEN22104E_106E_2025_2026_Spring");
        EntityManager em=emf.createEntityManager(); 
        em.getTransaction().begin();
        Query q=em.createQuery("delete from Departments WHERE d.departmentId=:id");
        
        q.setParameter("id", 21);
        q.executeUpdate();
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
