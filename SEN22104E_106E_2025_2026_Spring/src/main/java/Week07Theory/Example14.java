/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07Theory;

/**
 *
 * @author ali.nizam
 */
public class Example14 {
    public static void main(String[] args) {
        int[] numberCount=new int[3];
        for (int i = 0; i < 99999; i++) {
            int r=(int)(Math.random()*3);
            numberCount[r]++; 
        }
        System.out.println(numberCount[0]+":"+numberCount[1]+":"+numberCount[2]);
    }
}
