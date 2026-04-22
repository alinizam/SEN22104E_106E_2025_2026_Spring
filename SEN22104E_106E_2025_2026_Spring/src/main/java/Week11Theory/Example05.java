/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11Theory;

import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author ali.nizam
 */
public class Example05 {
    public static void main(String[] args) {
        //Query
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("SEN22104E_106E_2025_2026_Spring");
        EntityManager em=emf.createEntityManager();
        Query q=em.createNamedQuery("Departments.findAll");
        List<Departments> departments=q.getResultList();
        for (Departments department : departments) {
            System.out.println(department.getDepartmentId()+" "+department.getName());
        }
        em.close();
        emf.close();
    }
}
