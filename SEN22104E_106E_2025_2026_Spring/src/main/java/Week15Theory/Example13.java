/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week15Theory;

/**
 *
 * @author ali.nizam
 */
public class Example13 {
    //Recursive Algorithm
    public static void main(String[] args) {
        write(100000);
    }
 
    
     static void write(int n){
         if (n==0) return;
            
           // System.out.print("write("+(n-1));
            write(--n); 
            System.out.print(")");
    }
}
