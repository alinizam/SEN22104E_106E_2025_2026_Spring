/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13Theory;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author ali.nizam
 */
public class Example12 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        String file="c:\\files\\object.obj";
        ObjectInputStream f=new ObjectInputStream(new FileInputStream(file));
        try {
             while(true){
                /*Object o=f.readObject();
                Employee e=(Employee)o;*/
                Employee e=(Employee)f.readObject();
                System.out.println(e.name+" "+e.salary);
            }
            
        } catch (EOFException e) {
            System.out.println("All objects are readed");
        }
       
        f.close();
    }
}
