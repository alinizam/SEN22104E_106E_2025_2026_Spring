/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13Theory;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author ali.nizam
 */
public class Example05 {
    public static void main(String[] args) throws FileNotFoundException {
         String file="c:\\files\\documents.txt";
         PrintWriter f=new PrintWriter(file);
         int[] documents={1, 12112, 65564};
         for (int documentNo : documents) {
             f.format("Document 2026%07d%n",documentNo);
         }
         f.close();
    }
}
