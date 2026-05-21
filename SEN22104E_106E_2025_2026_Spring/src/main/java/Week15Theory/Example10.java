package Week15Theory;

 
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ali.nizam
 */
public class Example10 {
    public static void main(String[] args) throws IOException {
        Files.walkFileTree(Paths.get("c:\\files\\Pasaj1"), new MyDeleteFileVisitor());
    }
}
