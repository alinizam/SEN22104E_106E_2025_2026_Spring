/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03Theory;

import javax.swing.JFrame;

/**
 *
 * @author ali.nizam
 */
public class Example05 {
    public static void main(String[] args) {
        Object o="Ahmet";
        System.out.println(o);
        Object o1=new JFrame();
        System.out.println(o1);
        Object o2=new Employee();
        System.out.println(o2);
    }
    static class Employee{

        @Override
        public String toString() {
            return "I am a Employeee"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }
    
    };
}
