/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week06Lab;

/**
 *
 * @author ali.nizam
 */
public class Example03 {

    public static void main(String[] args) {
        String s = "abcde sadf fff";
        int r = (int) (s.length() * Math.random());
        System.out.println("r: " + r);
        if (s.charAt(r) == ' ') {
            System.out.println("Not inside word");
        } else {
            String w = Character.toString(s.charAt(r));
            int i = r-1;
            while (i>= 0 && s.charAt(i) != ' ') {
                w = Character.toString(s.charAt(i)) + w;
                i--;
            }
            int j=r+1;
            while (j != s.length() && s.charAt(j) != ' ') {
                w = w+Character.toString(s.charAt(j)) ;
                j++;
            }
            System.out.println(w);

        }
    }
}
