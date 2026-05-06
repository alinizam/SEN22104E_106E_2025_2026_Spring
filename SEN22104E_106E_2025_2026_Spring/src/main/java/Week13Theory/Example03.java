/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13Theory;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author ali.nizam
 */
public class Example03 {
     public static void main(String[] args) throws FileNotFoundException {
        String file="c:\\files\\numbers.txt";
        Scanner s=new Scanner(new FileReader(file));
        int i=0;
        int total=0;
        while(s.hasNextInt()){
            total+=s.nextInt();
        }
         System.out.println("Total = " + total);
     } 
        
                
        
}
