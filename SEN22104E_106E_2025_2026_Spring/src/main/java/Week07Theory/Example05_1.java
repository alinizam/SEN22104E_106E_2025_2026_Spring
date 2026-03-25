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
public class Example05_1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(15);
        numbers.add(10);
      //  numbers.add("6");
        int sum=0;
        for (Integer number : numbers) {
               sum+=number;
        }
        System.out.println("Sum = " +sum);
    }
}
