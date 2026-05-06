/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13Theory;

import com.google.protobuf.ByteString;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 *
 * @author ali.nizam
 */
public class Example08 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String file="c:\\files\\data.dat";
        /*DataOutputStream f=new DataOutputStream(
                                new BufferedOutputStream(
                                   new FileOutputStream(file)));*/
        DataOutputStream f=new DataOutputStream( 
                                   new FileOutputStream(file));
        f.writeInt(15);
        f.writeInt(5);
      //  f.writeUTF("Ahmet");
        f.writeInt(1);
        f.writeInt(4);
        f.close();
    }
}
