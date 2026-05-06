/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13Theory;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author ali.nizam
 */
public class Example11 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String file="c:\\files\\object.obj";
        ObjectOutputStream f=new ObjectOutputStream(new FileOutputStream(file)); 
        f.writeObject(new Employee("Ahmet",100000));
        f.writeObject(new Employee("Mehmet",50000));
        f.writeObject(new Employee("Ayşe",150000));
        
        
        f.close();
    }
}
