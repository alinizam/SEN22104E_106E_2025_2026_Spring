/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Week13Lab;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author ali.nizam
 */
public class Example01{
    
    

    public static void writeByByte(String text) throws IOException {
        byte[] bytes = text.getBytes();
        FileOutputStream stream = new FileOutputStream("C:\\Users\\ali.nizam\\OneDrive - Fatih Sultan Mehmet Vakıf Üniversitesi\\Belgeler\\NetBeansProjects\\file.txt");
        for(byte b:bytes){
            stream.write(b);
        }
        stream.close();
    }
    
    public static void writeLineByLine(String text) throws IOException {
        String[] wordArr = text.split(" ");
        PrintWriter pw = new PrintWriter("C:\\files\\fileLineByLine.txt");
        
        for(String s:wordArr){
            pw.println(s);
        }
        pw.close();
    }
    
    
    static void readAllCapitals() throws FileNotFoundException, IOException{
        String file="c:\\files\\fileLineByLine.txt";
        FileReader f=new FileReader(file);
        int c;
        while((c=f.read())!=-1){
            if (Character.isUpperCase(c)){
                System.out.println((char)c);
            }
        }
        f.close();
    }
            
            
            
    public static void main(String[] args) {
        String text = "Mehmet The Conqueror";
        try{
            readAllCapitals();
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
