/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05Theory;

/**
 *
 * @author ali.nizam
 */
public class Example14 {
    public static void main(String[] args) {
        String s1="Ahmet";
        String s2="Ahmet";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        
        String s3=new String("Ahmet");
        s3=s3.intern();
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
        
    }
}
