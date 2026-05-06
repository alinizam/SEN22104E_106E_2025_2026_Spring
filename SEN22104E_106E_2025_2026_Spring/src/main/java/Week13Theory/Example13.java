/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13Theory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author ali.nizam
 */
public class Example13 {
    public static void main(String[] args) throws FileNotFoundException, IOException,ClassNotFoundException{
       getBack();
    }
    static void store() throws FileNotFoundException, IOException{
        String file="c:\\files\\arrays.obj";
        ObjectOutputStream f=new ObjectOutputStream(new FileOutputStream(file)); 
        f.writeObject(new int[]{1,2,3}); 
        ArrayList<Employee> employees=new ArrayList<>();
        employees.add(new Employee("Ahmet AK",1000));
        employees.add(new Employee("Ayşe AK",1000));
        f.writeObject(employees);
        f.close();
    }
    static void getBack() throws FileNotFoundException, IOException, ClassNotFoundException{
        String file="c:\\files\\arrays.obj";
        ObjectInputStream f=new ObjectInputStream(new FileInputStream(file));
        int numbers[]=(int[])f.readObject();
        for (int number : numbers) {
            System.out.println(number);
        }
        ArrayList<Employee> employees=(ArrayList<Employee>)f.readObject();
        for (Employee employee : employees) {
            System.out.println(employee.name); 
        }
        f.close();
    }
}
