/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07Lab;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author ali.nizam
 */
public class Example02 {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        ArrayList<String> target=new ArrayList<>();
        words.add("A");
        words.add("B");
        words.add("C");
        Random r=new Random();
        while(words.size()!=0){
            int n=r.nextInt(words.size());
            target.add(words.get(n));
            words.remove(n);
        }
        System.out.println(target);
    }
}
