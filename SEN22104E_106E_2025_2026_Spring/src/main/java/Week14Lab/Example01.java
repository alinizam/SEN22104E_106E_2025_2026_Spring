/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14Lab;

import java.nio.file.*;

/**
 *
 * @author ali.nizam
 */
public class Example01 {
    public static void main(String[] args) {
        Path p=Paths.get("c:\\files\\CPII\\Hello.txt");
        System.out.println(p.getRoot());
        for (Path path : p) {
            System.out.println(path);
        }
    }
}
