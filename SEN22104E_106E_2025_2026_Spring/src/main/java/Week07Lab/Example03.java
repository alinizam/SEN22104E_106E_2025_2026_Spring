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
public class Example03 {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("A");
        words.add("B");
        words.add("C");
        words.add("D");
        words.add("E");
        Random r = new Random();
        int selectionCount = 0, selectionLocation = 0;
        while (words.size() > selectionLocation) {
            int n = r.nextInt(words.size() - selectionLocation) + selectionLocation;
            if (selectionLocation == n) {
                selectionLocation++;
            }
            System.out.println("SL:^" + selectionLocation + "--- SC: " + selectionCount + "rn: " + n);
            selectionCount++;
        }
        System.out.println("Selection count: " + selectionCount);
    }
}
