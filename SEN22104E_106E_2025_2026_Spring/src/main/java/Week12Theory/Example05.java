/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12Theory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author ali.nizam
 */
public class Example05 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String file="c:\\files\\hello.txt";
        InputStream is=new FileInputStream(file);
        int c=is.read();
        while(c!=-1){
            System.out.println((char)c);
            c=is.read();
        }
        is.close();
    }
}
