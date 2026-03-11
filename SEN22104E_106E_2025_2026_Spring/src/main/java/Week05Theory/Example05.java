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
public class Example05 {
    public static void main(String[] args) {
        FileWriter f=null;
        try {
            f=new FileWriter("c:\\files\\hello.txt");
            f.write("Merhaba Dünya");
            f.close();
        } catch (IOException ex) {
            System.getLogger(Example05.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }finally{
            if (f!=null){
                try {
                    f.close();
                } catch (IOException ex) {
                    System.getLogger(Example05.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
                }
            }
        }
        
    }
}
