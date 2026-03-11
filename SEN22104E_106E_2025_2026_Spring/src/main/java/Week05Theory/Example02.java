/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05Theory;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author ali.nizam
 */
public class Example02 {
    public static void main(String[] args) {
        try {
            FileReader f=new FileReader("c:\\fileffs\\hello.txt");
            System.out.println("Atfer exception line");
        } catch (FileNotFoundException ex) {
            //System.getLogger(Example02.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
}
