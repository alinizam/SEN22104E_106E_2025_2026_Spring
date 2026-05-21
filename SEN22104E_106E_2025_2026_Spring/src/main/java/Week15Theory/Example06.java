/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week15Theory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author ali.nizam
 */
public class Example06 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        RandomAccessFile file=new RandomAccessFile("c:\\files\\Hello.txt", "rw");
        file.seek(38);
        byte writeData[]={'H','e','l','l','o'};
        file.write(writeData,0,2);
        file.close();
        
    }
}
