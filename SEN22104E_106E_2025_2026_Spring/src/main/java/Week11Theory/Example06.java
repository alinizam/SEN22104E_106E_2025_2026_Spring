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
public class Example06 {
    public static void main(String[] args) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("SEN22104E_106E_2025_2026_Spring");
        EntityManager em=emf.createEntityManager();
        //pure object oriented modify operations
        Departments d=new  Departments();
        d.setDepartmentId(21);
        d.setName("Civil Eng");
        em.getTransaction().begin();
        em.persist(d);
        em.getTransaction().commit();
        em.close();
        emf.close();
        
        
    }
}
