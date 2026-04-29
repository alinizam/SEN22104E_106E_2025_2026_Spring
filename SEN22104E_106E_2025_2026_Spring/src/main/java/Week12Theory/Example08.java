/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12Theory;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 *
 * @author ali.nizam
 */
public class Example08 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String file="c:\\files\\hello.txt";
        Reader r=new FileReader(file);
        int c;
        while((c=r.read())!=-1){
            System.out.println((char)c);
        }
    }
}
