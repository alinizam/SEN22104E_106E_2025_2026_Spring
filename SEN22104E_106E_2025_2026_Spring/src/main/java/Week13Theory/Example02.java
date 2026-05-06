/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13Theory;

import java.util.Scanner;

/**
 *
 * @author ali.nizam
 */
public class Example02 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i=0;
         
        do{
            System.out.print("Enter a number :");
            i=s.nextInt();
            System.out.println("You entered "+ i);
        }while (i!=-1);
    }
}
