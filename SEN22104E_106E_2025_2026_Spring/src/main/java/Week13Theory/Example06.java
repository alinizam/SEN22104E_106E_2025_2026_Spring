/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13Theory;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ali.nizam
 */
public class Example06 {
    public static void main(String[] args) throws IOException {
        String file="c:\\files\\characrter.txt";
        FileWriter f=new FileWriter(file); 
        System.out.println("Enter characters");
        f.write(System.in.read());
        f.write(System.in.read());
        f.write(System.in.read());
        f.close();
    }
}
