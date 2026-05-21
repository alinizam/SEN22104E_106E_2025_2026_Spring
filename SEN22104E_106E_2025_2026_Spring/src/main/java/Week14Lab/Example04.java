/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14Lab;
import Week13Lab.Employee;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
/**
 *
 * @author ali.nizam
 */
public class Example04 {
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        readObject(5);
    }
     static void readObject(int empId) throws FileNotFoundException, IOException, ClassNotFoundException{
        ObjectInputStream os=new ObjectInputStream(new FileInputStream("c:\\files\\emp.obj"));
         try {
              while(true){
            Employee e=(Employee)os.readObject();
            if (e.getIdEmployee()==empId){
                System.out.println(e.getFirstName()+"Found");
            } 
        }
         } catch (EOFException e) {
             System.out.println("All employees is readed");
         }
       
     }
    static void writeObject() throws FileNotFoundException, IOException{
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("SEN22104E_106E_2025_2026_Spring");
        EntityManager em=emf.createEntityManager();
        
        Query q=em.createQuery("SELECT e FROM Employee e");
        List<Employee> employees=q.getResultList();
        ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("c:\\files\\emp.obj"));
        for (Employee employee : employees) {
           os.writeObject(employee);
        }
        em.close();
        emf.close(); 
    }
}
