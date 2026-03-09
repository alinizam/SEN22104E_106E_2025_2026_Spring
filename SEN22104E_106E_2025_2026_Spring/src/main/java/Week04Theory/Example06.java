/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04Theory;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author ali.nizam
 */
public class Example06 {

    static void main(String[] args)  {
        try {
            readFile1();
        } catch (IOException ex) {
            System.getLogger(Example06.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }

    //Catch
    static void readFile() {
        String fileName = "c:\\files\\hello.txt";
        try {
            FileReader f = new FileReader(fileName);
            System.out.println((char) f.read());
            System.out.println((char) f.read());
            System.out.println((char) f.read());
            System.out.println((char) f.read());
            System.out.println((char) f.read());
            System.out.println((char) f.read());
            System.out.println((char) f.read());
        } catch (FileNotFoundException ex) {
            System.getLogger(Example06.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        } catch (IOException ex) {
            System.getLogger(Example06.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }

    //Specify
    static void readFile1() throws FileNotFoundException, IOException{
        String fileName = "c:\\fi231les\\hello.txt";

        FileReader f = new FileReader(fileName);
        System.out.println((char) f.read());
        System.out.println((char) f.read());
        System.out.println((char) f.read());
        System.out.println((char) f.read());
        System.out.println((char) f.read());
        System.out.println((char) f.read());
        System.out.println((char) f.read());

    }
}
