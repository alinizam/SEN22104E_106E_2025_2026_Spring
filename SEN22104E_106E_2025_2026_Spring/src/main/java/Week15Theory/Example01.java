/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week15Theory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author ali.nizam
 */
public class Example01 {
    public static void main(String[] args) throws IOException {
        String pathDefSource="c:\\files\\source"; 
        Path pSource=Paths.get(pathDefSource); 
        System.out.println(Files.isDirectory(pSource));
        System.out.println(Files.getOwner(pSource).toString());
    }
}
