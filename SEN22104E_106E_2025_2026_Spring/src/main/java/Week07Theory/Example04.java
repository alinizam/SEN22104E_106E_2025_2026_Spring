/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07Theory;

import java.io.Closeable;

/**
 *
 * @author ali.nizam
 */
public class Example04 {
    public static void main(String[] args) {
        Car<String> c1=new Car<String>();
        Car<Integer> c2=new Car<Integer>();
        Car<Closeable> c3=new Car<Closeable>();
    }
}
