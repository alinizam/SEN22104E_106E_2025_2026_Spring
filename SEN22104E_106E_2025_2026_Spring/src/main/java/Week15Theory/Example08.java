/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week15Theory;

import java.io.File;

/**
 *
 * @author ali.nizam
 */
public class Example08 {
    public static void main(String[] args) {
        File file=new File("c:\\files");
        for(File f:file.listFiles()){
            System.out.println(f);
            if (f.isDirectory()){
                for(File f1:f.listFiles()){
                    System.out.println(f1);
                }
            }
        }
    }
}
