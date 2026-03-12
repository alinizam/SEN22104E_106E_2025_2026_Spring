/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05Lab;

/**
 *
 * @author ali.nizam
 */
public class Example04 {

    public static void main(String[] args) {
        String searchString = "Fatih Sultan tanMEhmet";
        String pattern = "tan";
        for (int i = 0; i < searchString.length() - pattern.length(); i++) {
            int count = 0;
            for (int j = 0; j < pattern.length(); j++) {
                if (searchString.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
                count++;
            }
            if (count == pattern.length()) {
                System.out.println("Found " + i + ":" + (i+ pattern.length()));
            }
        }
    }
}
