/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14Theory;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author ali.nizam
 */
public class Example09 {
    public static void main(String[] args) throws IOException {
        Path p=Paths.get("c:\\files");
        DirectoryStream<Path> ds=Files.newDirectoryStream(p);
        for (Path d : ds) {
            System.out.println(d);
        }
    }
}
