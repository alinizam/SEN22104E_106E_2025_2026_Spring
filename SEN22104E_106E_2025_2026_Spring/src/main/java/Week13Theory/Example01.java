/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13Theory;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author ali.nizam
 */
public class Example01 {
    public static void main(String[] args) {
        String file="c:\\files\\merhaba.txt";
        try(BufferedWriter f=new BufferedWriter(new FileWriter(file))){
            f.write("Merhaba dünya");
            f.flush();
            f.newLine();
        }
        catch(FileNotFoundException e){
            System.out.println("File not exits");
        }
        catch(IOException e){
            System.out.println("I can not read file");
        }
    }
}
