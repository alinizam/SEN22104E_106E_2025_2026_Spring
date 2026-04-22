/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11Theory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author ali.nizam
 */
public class Example09 {
    public static void main(String[] args) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("SEN22104E_106E_2025_2026_Spring");
        EntityManager em=emf.createEntityManager(); 
        Departments department=em.find(Departments.class,1);
        em.getTransaction().begin();
        em.remove(department);
        em.getTransaction().commit();
        
        em.close();
        emf.close();
    }
}
