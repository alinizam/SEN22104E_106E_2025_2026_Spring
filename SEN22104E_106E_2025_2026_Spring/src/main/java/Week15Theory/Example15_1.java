/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week15Theory;

import java.util.ArrayList;

/**
 *
 * @author ali.nizam
 */
public class Example15_1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(15);
        numbers.add(10);
     //   numbers.add("10");
        int total=0;
        for (Integer number : numbers) { 
            total+=number;
        }
        System.out.println("Total = "+ total) ;
    }
}
