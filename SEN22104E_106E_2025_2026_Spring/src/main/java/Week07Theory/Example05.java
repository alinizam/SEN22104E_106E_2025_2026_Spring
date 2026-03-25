/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07Theory;

import java.util.ArrayList;

/**
 *
 * @author ali.nizam
 */
public class Example05 {
    public static void main(String[] args) {
        ArrayList numbers=new ArrayList();
        numbers.add(15);
        numbers.add(10);
        numbers.add("6");
        int sum=0;
        for (Object number : numbers) {
           if (number instanceof Integer)
               sum+=(Integer)number;
        }
        System.out.println("Sum = " +sum);
    }
}
