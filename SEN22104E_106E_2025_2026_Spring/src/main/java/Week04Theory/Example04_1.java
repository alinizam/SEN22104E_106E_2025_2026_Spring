/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04Theory;

import java.util.Scanner;

/**
 *
 * @author ali.nizam
 */
public class Example04_1 {

    public static void main(String[] args) {
        System.out.println("Method 1 is called");
        method1();
        System.out.println("Method 1 is finished");

    }

    static void method1() {
        

        try {
            System.out.println("Method 2 is called");
            method2();
            System.out.println("Method 2 is finished");
        } catch (Exception e) {
            System.out.println("Second number must not be equal 0");
        }
        

    }

    static void method2() {

        int a, b;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two numbers");
        a = s.nextInt();
        b = s.nextInt();
        System.out.println(a / b);

    }
}
