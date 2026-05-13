/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14Theory;

import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author ali.nizam
 */
public class Example08 {
    public static void main(String[] args) throws IOException {
        String pathDefSource="c:\\files\\source"; 
        Path pSource=Paths.get(pathDefSource); 
        String pathDefTarget="c:\\files\\target"; 
        Path pTarget=Paths.get(pathDefTarget); 
        
        Files.copy(pSource, pTarget,StandardCopyOption.REPLACE_EXISTING);
    }
}
