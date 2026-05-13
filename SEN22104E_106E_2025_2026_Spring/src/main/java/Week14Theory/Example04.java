/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14Theory;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author ali.nizam
 */
public class Example04 {
    public static void main(String[] args) {
        String pathDef1="c:\\files\\pasaj1\\Duygu\\..";
        String pathDef2="c:\\files\\pasaj1\\yer\\..";
        Path p1=Paths.get(pathDef1);
        Path p2=Paths.get(pathDef2);
        System.out.println(p1.relativize(p2));
        System.out.println(p1.normalize().equals(p2.normalize()));
        
        for (Path name: p1) {
                System.out.println(name);
        }
        System.out.println(p1.getRoot());
    }
}
