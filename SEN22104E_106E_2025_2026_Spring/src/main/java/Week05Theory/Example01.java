/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05Theory;

/**
 *
 * @author ali.nizam
 */
public class Example01 {
    public static void main(String[] args) {
      try {
            Object o=null;
            System.out.println(o.getClass());
        } catch (NullPointerException e) {
            System.out.println("Object is not initialized");
        }
    }
}
