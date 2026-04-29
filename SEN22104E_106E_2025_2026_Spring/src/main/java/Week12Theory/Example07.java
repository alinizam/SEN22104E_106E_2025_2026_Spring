package Week12Theory;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ali.nizam
 */
public class Example07 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String file="c:\\files\\hello.txt"; 
        OutputStream os=new FileOutputStream(file,true);
        os.write('M');
        os.write('e');
        os.write('r');
        os.write('h');
        os.write('a');
        os.write('b');
        os.write('a');
        
        os.close();
    }
}
