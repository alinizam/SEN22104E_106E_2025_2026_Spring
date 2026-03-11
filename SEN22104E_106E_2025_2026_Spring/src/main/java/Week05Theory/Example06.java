/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05Theory;

/**
 *
 * @author ali.nizam
 */
public class Example06 {
    public static void main(String[] args) {
        try {
            int i=5/1;
            return;
        } catch (Exception e) {
            System.out.println("Error");
        } finally {
            System.out.println("Close resources");
        }
    }
}
