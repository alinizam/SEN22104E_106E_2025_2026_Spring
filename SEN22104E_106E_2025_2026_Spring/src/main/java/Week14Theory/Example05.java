/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14Theory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author ali.nizam
 */
public class Example05 {
    public static void main(String[] args) throws IOException {
        String pathDef1="c:\\files\\pasaj1\\Duygu\\..";
        String pathDef2="c:\\files\\pasaj1\\yer\\..";
        Path p1=Paths.get(pathDef1);
        Path p2=Paths.get(pathDef2);
        System.out.println(Files.isSameFile(p2, p2));
    }
}
