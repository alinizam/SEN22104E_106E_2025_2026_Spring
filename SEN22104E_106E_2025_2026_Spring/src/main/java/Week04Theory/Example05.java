/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04Theory;

/**
 *
 * @author ali.nizam
 */
public class Example05 {
    public static void main(String[] args) {
        try {
            int i=5/0;
            System.out.println("Continue");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
