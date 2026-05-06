/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13Theory;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ali.nizam
 */
public class Example07 {

    public static void main(String args[]) throws IOException {
//Create a BufferedReader using System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        
            System.out.println("Enter lines of text, Enter end to quit");
            do {
                str = br.readLine();
                System.out.println(str+" entered"); 
            }while(!str.equals("end"));
 
    }
}