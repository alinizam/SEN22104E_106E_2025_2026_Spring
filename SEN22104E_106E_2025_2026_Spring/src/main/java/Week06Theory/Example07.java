/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week06Theory;

/**
 *
 * @author ali.nizam
 */
public class Example07 {
    /**Find the number of digits before and after the 
decimal point of a fractional number*/
    public static void main(String[] args) {
        double d=1.9;
        String s=Double.toString(d);
        System.out.println(s);
        int dotPlace=s.indexOf(".");
        System.out.println(s.substring(0,dotPlace));
        System.out.println(s.substring(dotPlace+1));
        
        int beforeDot=Integer.parseInt(s.substring(0,dotPlace));
        int afterDot=Integer.parseInt(s.substring(dotPlace+1));
        System.out.println(beforeDot+afterDot);
    }
}
