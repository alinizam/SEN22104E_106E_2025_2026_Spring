/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12Theory;

import Week11Theory.Departments;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.LockModeType;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author ali.nizam
 */
public class Example03 {
    public static void main(String[] args) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("SEN22104E_106E_2025_2026_Spring");
        EntityManagerFactory emf1=Persistence.createEntityManagerFactory("SEN22104E_106E_2025_2026_Spring");

        EntityManager em=emf.createEntityManager();
        EntityManager em1=emf1.createEntityManager();
        em.getTransaction().begin();
        em1.getTransaction().begin();
        Departments d=em.find(Departments.class,1,LockModeType.PESSIMISTIC_WRITE);
        d.setName("CE");
        Departments d1=em1.find(Departments.class,1,LockModeType.PESSIMISTIC_WRITE);
        d1.setName("AIE");
        em.getTransaction().commit(); 
        em1.getTransaction().commit();
        em.close();
        emf.close(); 
    }
}
