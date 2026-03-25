/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07Theory;

import java.text.DecimalFormat;

/**
 *
 * @author ali.nizam
 */
public class Example10 {
    public static void main(String[] args) {
        format("00,00,00.00",14656465465521.12);
    }
    static void format(String pattern, double number){
        DecimalFormat f=new DecimalFormat(pattern);
        String result=f.format(number);
        System.out.println("Formatted value:"+result);
    }
}
