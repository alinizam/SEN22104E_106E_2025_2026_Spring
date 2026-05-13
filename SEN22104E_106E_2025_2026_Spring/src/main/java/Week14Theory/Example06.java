/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14Theory;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author ali.nizam
 */
public class Example06 {
    public static void main(String[] args) {
        String pathDef1="c:\\files\\Hello.txt"; 
        Path p1=Paths.get(pathDef1); 
        System.out.println("Is exists ? " +Files.exists(p1));
        System.out.println("Is writeable ? " +Files.isWritable(p1));
    }
}
