/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week06Theory;

/**
 *
 * @author ali.nizam
 */
public class Example13 {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder("1 ");
        System.out.println("Length:" +s.length()+" : " +
                           "Capacity"+": "+s.capacity());
        s.append("Ahmet");
        System.out.println("Length:" +s.length()+" : " +
                           "Capacity"+": "+s.capacity());
        s.append("goes to school");
        System.out.println("Length:" +s.length()+" : " +
                           "Capacity"+": "+s.capacity());
        s.append("again");
        System.out.println("Length:" +s.length()+" : " +
                           "Capacity"+": "+s.capacity());
        s.setLength(5);
        System.out.println(s);
        
                                   
    }
}
