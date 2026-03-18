/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week06Theory;

/**
 *
 * @author ali.nizam
 */
public class Example01 {
    public static void main(String[] args) {
        //concat
        String s="Fatih";
        System.out.println(s.concat(" Sultan"));
        System.out.println(s);
        //indexOf
        String name="Ahmet Ak";
        System.out.println(name.indexOf(" "));
        
        
        //substring
        
        int spaceLoc=name.indexOf(" ");
        System.out.println("First Name = "+name.substring(0,spaceLoc));
        System.out.println("Last Name = " +name.substring(spaceLoc+1));
        
        System.out.println("Last Name = " +name.substring(2,2));
        
        //contains
        String s1="FS Mehmet Mehmet VÜ";
        System.out.println(s1.contains("Mehmet"));
        
        //Indedx Of
        
        System.out.println(s1.indexOf("Mehmet", 11));
        
        //lastIndex Of
        System.out.println(s1.lastIndexOf("Mehmet"));
        
    }
}
