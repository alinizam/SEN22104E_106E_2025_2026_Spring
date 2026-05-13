/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14Theory;


import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author ali.nizam
 */
public class Example01 {
    public static void main(String[] args) {
        String pathDef="c:\\CPII\\week14";
        Path p=Paths.get(pathDef);
        System.out.println(p);
        Path p1=Paths.get("c:","CPII","week14");//better
        System.out.println(p1); 
        
        Path p2=Paths.get("CPII","week14");
        System.out.println(p2);
        
        Path p3=FileSystems.getDefault().getPath("\\file");
        System.out.println(p3);        
       
    }
        
}
