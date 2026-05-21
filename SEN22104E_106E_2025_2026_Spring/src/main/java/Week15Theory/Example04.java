/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week15Theory;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;

/**
 *
 * @author ali.nizam
 */
public class Example04 {
    public static void main(String[] args) throws IOException {
        String pathDefSource="c:\\files\\source\\bbb.txt"; 
        Path pSource=Paths.get(pathDefSource); 
        try {
            if (!Files.exists(pSource)){
                Files.createFile(pSource);
            }
        } catch (FileAlreadyExistsException e) {
               System.out.println("File is already exists");
        }
       
        
    }
}
