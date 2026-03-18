/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week06Theory;

/**
 *
 * @author ali.nizam
 */
public class Example04 {
    public static void main(String[] args) {
        String s="1Fatih 2Sultan 3Mehmet";
        String words[]=s.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
