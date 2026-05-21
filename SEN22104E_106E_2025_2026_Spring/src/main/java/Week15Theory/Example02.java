/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week15Theory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

/**
 *
 * @author ali.nizam
 */
public class Example02 {
    public static void main(String[] args) throws IOException {
        String pathDefSource="c:\\files\\source\\aaa.txt"; 
        Path pSource=Paths.get(pathDefSource); 
        BasicFileAttributes attr=Files.readAttributes(pSource, BasicFileAttributes.class);
        System.out.println(attr.size());
        System.out.println("lastAccessTime : " + attr.lastAccessTime());
    }
}
