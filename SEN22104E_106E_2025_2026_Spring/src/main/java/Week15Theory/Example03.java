/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week15Theory;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;

/**
 *
 * @author ali.nizam
 */
public class Example03 {
    public static void main(String[] args) throws IOException {
        String pathDefSource="c:\\files\\source\\aaa.txt"; 
        Path pSource=Paths.get(pathDefSource); 
        List<String> lines=Files.readAllLines(pSource);
        for (Object line : lines) {
            System.out.println(line);
        } 
    }
}
