/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05Theory;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author ali.nizam
 */
public class Example05_1 {
    public static void main(String[] args) {
        try(FileWriter f=new FileWriter("c:\\files\\hello.txt")) {
            f.write("Merhaba Dünya"); 
        } catch (IOException ex) {
            System.getLogger(Example05_1.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        } 
        
    }
    
}
