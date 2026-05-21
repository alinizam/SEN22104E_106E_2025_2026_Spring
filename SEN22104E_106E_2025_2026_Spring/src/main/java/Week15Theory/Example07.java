/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week15Theory;

import java.nio.file.FileSystems;
import java.nio.file.Path;

/**
 *
 * @author ali.nizam
 */
public class Example07 {
    public static void main(String[] args) {
       Iterable<Path> dirs=FileSystems.getDefault().getRootDirectories();
        for (Path dir : dirs) {
            System.out.println(dir);
        }
    }
}
