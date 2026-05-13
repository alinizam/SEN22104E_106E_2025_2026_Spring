/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14Theory;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author ali.nizam
 */
public class Example03 {
    public static void main(String[] args) throws IOException {
        String pathDef="c:\\CPII\\.\\week14\\e1.java";
        Path p=Paths.get(pathDef);
        System.out.println(p.normalize());
        System.out.println(p.toUri());
        System.out.println(p.toAbsolutePath());
        Path p1=Paths.get("grades\\CPII");
        System.out.println(p1.toAbsolutePath());
        
        Path p2=Paths.get("c:\\files\\.\\hello.txt");
        System.out.println(p2.toRealPath());
        p2= p2.resolve("Merhaba.txt");
        System.out.println(p2);
        Path p3=Paths.get("c:\\files\\hello.txt");
        p3=p3.resolve("..\\Merhaba.txt");
        System.out.println(p3 );
        
    }
}
