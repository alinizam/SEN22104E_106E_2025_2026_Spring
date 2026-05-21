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
public class Example05 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        RandomAccessFile file=new RandomAccessFile("c:\\files\\Hello.txt", "r");
        file.seek(38);
        byte readData[]=new byte[19];
        file.read(readData);
        for (byte b : readData) {
            System.out.print((char)b);
        }
        System.out.println("");
        file.close();
        
    }
}
