/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12Theory;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author ali.nizam
 */
public class Example01 {
    public static void main(String[] args) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("SEN22104E_106E_2025_2026_Spring");
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        Query q=em.createQuery("DELETE FROM Departments d WHERE d.departmentId=:pDeptId");
        q.setParameter("pDeptId", 3);
        q.executeUpdate();
        em.getTransaction().commit();
        em.close();
        emf.close(); 
    }
}
