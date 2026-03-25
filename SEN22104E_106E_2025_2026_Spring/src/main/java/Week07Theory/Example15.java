/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07Theory;

import java.util.Random;

/**
 *
 * @author ali.nizam
 */
public class Example15 {
    public static void main(String[] args) {
        Random ro=new Random();
        int[] numberCount=new int[3];
        for (int i = 0; i < 99999; i++) {
            int r=ro.nextInt(3);
            numberCount[r]++; 
        }
        System.out.println(numberCount[0]+":"+numberCount[1]+":"+numberCount[2]);
         
    }
}
