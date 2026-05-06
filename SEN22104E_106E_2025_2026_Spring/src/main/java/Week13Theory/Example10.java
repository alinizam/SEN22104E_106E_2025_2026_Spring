/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13Theory;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author ali.nizam
 */
public class Example10 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String file="c:\\files\\data.dat"; 
        DataInputStream f=new DataInputStream(new FileInputStream(file));
        try {
            while(true){
          //while(f.available()>0){
                System.out.println(f.readInt());
        
            }
        } catch (EOFException e) {
            System.out.println("All data is read");
        }
        
        
        
        f.close();
    }
}
