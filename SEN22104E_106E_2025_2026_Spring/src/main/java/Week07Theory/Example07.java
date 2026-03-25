/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07Theory;

/**
 *
 * @author ali.nizam
 */
public class Example07 {
    public static void main(String[] args) {
        Long sum=0L;
        for (Long i = 0L; i < 10000000L; i++) {
            //System.out.println(i);
            sum+=i;
        }
        System.out.println(sum);
    }
}
