/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12Theory;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 *
 * @author ali.nizam
 */
public class Example11 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String file="c:\\files\\hello.txt";
        BufferedReader r=new BufferedReader(new FileReader(file));
        String line;
        while((line=r.readLine())!=null){
            System.out.println(line);
        }
       
    }
}
