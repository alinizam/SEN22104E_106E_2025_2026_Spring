/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13Theory;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author ali.nizam
 */
public class Example09 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String file="c:\\files\\data.dat"; 
        DataInputStream f=new DataInputStream(new FileInputStream(file));
        System.out.println(f.readInt());
        System.out.println(f.readUTF());
        System.out.println(f.readInt());
        System.out.println(f.readInt());
        f.close();
    }
}
