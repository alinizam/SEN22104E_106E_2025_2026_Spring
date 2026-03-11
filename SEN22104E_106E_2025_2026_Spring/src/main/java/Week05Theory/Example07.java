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
public class Example07 {
    public static void main(String[] args)   {
        try {
            readFile();
        } catch (IOException ex) {
            System.out.println("File is not found");
          //  System.getLogger(Example07.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
    static void readFile() throws IOException{ 
        FileWriter f=new FileWriter("c:\\fileddds\\helgglo.txt");
        f.write("sss");
        f.close();
    }
}
