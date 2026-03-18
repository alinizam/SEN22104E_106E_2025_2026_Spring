/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week06Theory;

/**
 *
 * @author ali.nizam
 */
public class Example02 {
    public static void main(String[] args) {
        String s="Fatih Sultaini";
        s=s.replace("tih", "I");
        System.out.println(s.toUpperCase());
        String s1=" F1 F2 F3"; 
        System.out.println(s1.replaceAll("[0-9]","_"));
    }
}
