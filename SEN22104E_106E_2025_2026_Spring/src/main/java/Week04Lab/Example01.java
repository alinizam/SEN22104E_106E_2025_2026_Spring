/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04Lab;

/**
 *
 * @author ali.nizam
 */
public class Example01 {

    public static void main(String[] args) {
        String s[] = {"1", "6", "1d", "10", "g"};

        for (int i = 0; i < s.length; i++) {
            try {
                System.out.println(Integer.parseInt(s[i]));
            } catch (Exception e) {
                System.out.println("Number error: "+s[i]);
            }
        }

    }
}
