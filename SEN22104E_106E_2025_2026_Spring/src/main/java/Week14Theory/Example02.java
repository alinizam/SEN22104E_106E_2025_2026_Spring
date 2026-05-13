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
public class Example02 {
    public static void main(String[] args) {
        String pathDef="c:\\CPII\\week14\\e1.java";
        Path p=Paths.get(pathDef);
        System.out.println(p.getFileName());
        for (int i = 0; i < p.getNameCount(); i++) {
            System.out.println(p.getName(i));
        }
        System.out.println(p.getRoot());    
             
    }
}
