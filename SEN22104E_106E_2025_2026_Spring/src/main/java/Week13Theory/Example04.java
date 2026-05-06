/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13Theory;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ali.nizam
 */
public class Example04 {
    public static void main(String[] args) throws FileNotFoundException {
        String file="c:\\files\\salaries.txt";
        Scanner s=new Scanner(new FileReader(file));
        int i=0;
        int total=0;
        s.useLocale(Locale.US);
        while(s.hasNext()){
            System.out.println(s.next());
            System.out.println(total+=s.nextDouble());
        }
         System.out.println("Total = " + total);
     } 
}
